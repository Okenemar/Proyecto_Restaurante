package modeloUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import clases.Cliente;
import clases.Evento;
import clases.Reserva;
import clases.RolUsuario;
import clases.Usuario;
import conexion.Conector;

public class ModeloUsuario extends Conector{
	
	PreparedStatement prt;
	public void insertarEvento(Evento evento) {
	try {
		prt = con.prepareStatement("INSERT INTO eventos (c_evento, nombre) VALUES(?,?)");
		
		prt.setInt(1, evento.getcEvento());
		prt.setString(2, evento.getNombre());
		
		
		prt.execute();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}

	public void eliminarEvento(int c_evento) {
		try {
			prt = con.prepareStatement("DELETE FROM eventos WHERE c_evento = ?");
			
			prt.setInt(1, c_evento);
	
			prt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void modificarEvento(Evento evento) {
		try {
			prt = con.prepareStatement("UPDATE eventos SET c_evento=?, nombre=? WHERE c_evento=?");
			
			prt.setInt(1, evento.getcEvento());
			prt.setString(2, evento.getNombre());
			prt.setInt(3, evento.getcEvento());
			
			prt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Evento getEvento(int cEvento) throws SQLException {
		Evento evento = new Evento();
		
		prt=con.prepareStatement("SELECT * FROM eventos WHERE c_evento=?");
		prt.setInt(1, cEvento);
		
		ResultSet resultado = prt.executeQuery();
		resultado.next();
		
		evento.setcEvento(resultado.getInt("c_evento"));
		evento.setNombre(resultado.getString("nombre"));
		
		return evento;
	}
	
	public ArrayList<Evento> getEventos(){
		PreparedStatement prt;
		ArrayList <Evento> eventos = new ArrayList <>();
		Evento evento = new Evento();
		try {
			prt = con.prepareStatement("SELECT * FROM eventos");
			ResultSet resultado = prt.executeQuery();
			
			
			
			while(resultado.next()) {
				evento = new Evento();
				evento.setcEvento(resultado.getInt(1));
				evento.setNombre(resultado.getString(2));
				
				eventos.add(evento);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eventos;
		}
	
	
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
	
	
		public void modificarReserva(Reserva reserva) {
			try {
				prt = con.prepareStatement("UPDATE reservas SET fecha=?,nombre=?,telefono=?,id_evento=? WHERE n_reserva=?" );
				prt.setInt(5, reserva.getnReserva());

				prt.setDate(1, new Date(reserva.getFecha().getTime()));
				prt.setString(2, reserva.getCliente().getNombre());
				prt.setString(3, reserva.getCliente().getTelefono());
				prt.setInt(4, reserva.getEvento().getcEvento());
				
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
		
		public void insertarUsuario(Usuario usuario) {
			try {
				prt = con.prepareStatement("INSERT INTO usuarios (cUsuario, nombre, apellido, telefono, correo_trabajo, trabajo, mgr, rol) VALUES(?,?,?,?,?,?,?,?)");
				
				prt.setInt(1, usuario.getcUsuario());
				prt.setString(2, usuario.getNombre());
				prt.setString(3, usuario.getApellido());
				prt.setString(4, usuario.getTelefono());
				prt.setString(5, usuario.getCorreoTrabajo());
				prt.setString(6, usuario.getTrabajo());
				prt.setInt(7, usuario.getMgr());
				prt.setInt(8, usuario.getRol().getId());
				
				prt.execute();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public ArrayList<Usuario> getUsuarios(){
			PreparedStatement prt;
			ArrayList <Usuario> usuarios = new ArrayList <>();
			Usuario usuario = new Usuario();
			try {
				prt = con.prepareStatement("SELECT * FROM usuarios");
				ResultSet resultado = prt.executeQuery();
				
				
				
				while(resultado.next()) {
					usuario = new Usuario();
					usuario.setcUsuario(resultado.getInt(1));
					usuario.setNombre(resultado.getString(2));
					usuario.setApellido(resultado.getString(3));
					usuario.setTelefono(resultado.getString(4));
					usuario.setCorreoTrabajo(resultado.getString(5));
					usuario.setTrabajo(resultado.getString(6));
					usuario.setMgr(resultado.getInt(7));
					RolUsuario rolusuario = new RolUsuario();
					rolusuario.setId(resultado.getInt(8));
					usuario.setRol(rolusuario);
					
					usuarios.add(usuario);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return usuarios;
			}
		public Usuario getUsuario(int cUsuario) throws SQLException  {
			Usuario usuario = new Usuario();
		
				prt=con.prepareStatement("SELECT * FROM usuarios WHERE cUsuario=?");
				prt.setInt(1, cUsuario);
				
				ResultSet resultado = prt.executeQuery();
				resultado.next();
				
				usuario.setcUsuario(resultado.getInt("cUsuario"));
				usuario.setNombre(resultado.getString("nombre"));
				usuario.setApellido(resultado.getString("apellido"));
				usuario.setTelefono(resultado.getString("telefono"));
				usuario.setCorreoTrabajo(resultado.getString("correo_trabajo"));
				usuario.setTrabajo(resultado.getString("trabajo"));
				usuario.setMgr(resultado.getInt("mgr"));
				RolUsuario rolusuario = new RolUsuario();
				rolusuario.setId(resultado.getInt("rol"));
				usuario.setRol(rolusuario);
				
				return usuario;
				
		}
		
		
		public void eliminarUsuario(int cUsuario) {
			try {
				prt = con.prepareStatement("DELETE FROM usuarios WHERE cUsuario = ?");
				
				prt.setInt(1, cUsuario);

				prt.execute();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		public void modificarUsuario(Usuario usuario) {
			
			try {
				 prt = con.prepareStatement("UPDATE usuarios SET cUsuario=?,nombre=?,apellido=?,telefono=?,correo_trabajo=?,trabajo=?,mgr=?,rol=? WHERE cUsuario=?");
				 
				 prt.setInt(1, usuario.getcUsuario());
				 prt.setString(2, usuario.getNombre());
				 prt.setString(3, usuario.getApellido());
				 prt.setString(4, usuario.getTelefono());
				 prt.setString(5, usuario.getCorreoTrabajo());
				 prt.setString(6, usuario.getTrabajo());
				 prt.setInt(7, usuario.getMgr());
				 prt.setInt(8, usuario.getRol().getId());
				 prt.setInt(9, usuario.getcUsuario());
				 
				 prt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	}
