package modeloUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import clases.Cliente;
import clases.Reserva;
import clases.Usuario;
import conexion.Conector;

public class ModeloUsuario extends Conector{
	
	PreparedStatement prt;
//
//		public void insertarUsuario(Usuario usuario) {
//			try {
//				prt = con.prepareStatement("INSERT INTO usuarios (nombre, password, login_fecha, id_rol) VALUES(?,?,?,?)");
//				
//				prt.setString(1, usuario.getNombre());
//				prt.setString(2, usuario.getPassword());
//				prt.setDate(3, new Date(usuario.getLogin_fecha().getTime()));
//				prt.setInt(4, usuario.getRol().getId());
//				prt.execute();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//		}
//		public ArrayList<Usuario> getUsuarios(){
//			PreparedStatement prt;
//			ArrayList <Usuario> usuarios = new ArrayList <>();
//			Usuario usuario = new Usuario();
//			try {
//				prt = con.prepareStatement("SELECT * FROM usuarios ");
//				ResultSet resultado = prt.executeQuery();
//				
//				
//				
//				while(resultado.next()) {
//					usuario = new Usuario();
//					usuario.setId(resultado.getInt(1));
//					usuario.setNombre(resultado.getString(2));
//					usuario.setPassword(resultado.getString(3));
//					usuario.setLogin_fecha(resultado.getDate(4));
//					Rol rol = new Rol();
//					rol.setId(resultado.getInt(5));
//					usuario.setRol(rol);
//					
//					usuarios.add(usuario);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			return usuarios;
//			}
//		public Usuario getUsuario(int id) throws SQLException  {
//			Usuario usuario = new Usuario();
//		
//				prt=getCon().prepareStatement("SELECT * FROM usuarios WHERE id=?");
//				prt.setInt(1, id);
//				
//				ResultSet resultado = prt.executeQuery();
//				resultado.next();
//				usuario.setId(resultado.getInt("id"));
//				usuario.setNombre(resultado.getString("nombre"));
//				usuario.setPassword(resultado.getString("password"));
//				usuario.setLogin_fecha(resultado.getDate("login_fecha"));
//				Rol rol = new Rol();
//				rol.setId(resultado.getInt("id_rol"));
//				usuario.setRol(rol);
//				
//				
//				return usuario;
//				
//		}
//		
//		
//		public void eliminarUsuario(int id) {
//			try {
//				prt = con.prepareStatement("DELETE FROM usuarios WHERE id = ?");
//				
//				prt.setInt(1, id);
//
//				prt.execute();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//		}
//		public void modificarUsuario(Usuario usuario) {
//			
//			try {
//				 prt = con.prepareStatement("UPDATE usuarios SET nombre=?,password=?,login_fecha=?, id_rol? WHERE id=?");
//				
//				
//				 prt.setString(1, usuario.getNombre());
//				 prt.setString(2, usuario.getPassword());
//				 prt.setDate(3, new Date(usuario.getLogin_fecha().getTime()));
//				 prt.setInt(4, usuario.getRol().getId());
//				 prt.setInt(5, usuario.getId());
//				
//		
//				
//				
//				 prt.executeUpdate();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//		}
	
	public Reserva getReserva(int nReserva) throws SQLException  {
		Reserva reserva = new Reserva();
	
			prt=con.prepareStatement("SELECT * FROM reservas WHERE n_reserva=?");
			prt.setInt(1, nReserva);
			
			ResultSet resultado = prt.executeQuery();
			resultado.next();
			reserva.setnReserva(resultado.getInt("n_reserva"));
			reserva.setFecha(resultado.getDate("fecha"));
			
			Cliente cliente = new Cliente();
			cliente.setDni(resultado.getString("DNI"));
			cliente.setNombre(resultado.getString("nombre"));
			cliente.setTelefono(resultado.getString("telefono"));
			
			reserva.setCliente(cliente);
			
			
			return reserva;
			
	}
//	
	
	
		public void modificarReserva(Reserva reserva) {
			try {
				prt = con.prepareStatement("UPDATE reservas SET fecha=?,nombre=?,telefono=?" );
				
				prt.setDate(1, new Date(reserva.getFecha().getTime()));
				prt.setString(2, reserva.getCliente().getNombre());
				prt.setString(3, reserva.getCliente().getTelefono());
				
				prt.executeUpdate();
			} catch (Exception e) {
				
			}
		}
		
		public void eliminarReserva(int nReserva) {
			try {
				prt = con.prepareStatement("DELETE FROM reservas WHERE n_reserva = ?");
				
				prt.setInt(1, nReserva);

				prt.execute();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
