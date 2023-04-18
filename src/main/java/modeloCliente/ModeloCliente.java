package modeloCliente;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;


import clases.Reserva;
import clases.Cliente;
import clases.RolUsuario;
import clases.Usuario;
import conexion.Conector;

public class ModeloCliente extends Conector{
	
	
	public void crearReserva(Reserva reserva) {
		
		PreparedStatement prt;
		
		try {
			prt= con.prepareStatement("INSERT INTO reservas(fecha, DNI, nombre, telefono) VALUES (?,?,?,?)");
			prt.setDate(1, new Date (reserva.getFecha().getTime() ));
			prt.setString(2, reserva.getCliente().getDni());
			
			prt.setString(3, reserva.getCliente().getNombre());
			
			prt.setString(4, reserva.getCliente().getTelefono());
			
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public ArrayList<Reserva> getReservas(){
		PreparedStatement prt;
		ArrayList <Reserva> reservas = new ArrayList<>();
		Reserva reserva = new Reserva();
		try {
			prt = con.prepareStatement("SELECT * FROM reservas");
			ResultSet resultado = prt.executeQuery();
			
			while(resultado.next()) {
				reserva = new Reserva();
				reserva.setnReserva(resultado.getInt(1));
				reserva.setFecha(resultado.getDate(2));
				reserva.setCliente(getCliente(resultado.getString(4)));
				
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reservas;
	}
	
	public Cliente getCliente(String DNI) throws SQLException{
		Cliente cliente = new Cliente();
		PreparedStatement prt;

		prt = con.prepareStatement("SELECT * FROM clientes WHERE DNI=?");
		prt.setString(1, DNI);
		
		ResultSet resultado = prt.executeQuery();
		resultado.next();
		cliente.setDni(resultado.getString("DNI"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellido(resultado.getString("apellido"));
		cliente.setTelefono(resultado.getString("telefono"));
		cliente.setCorreo(resultado.getString("correo"));
		
		return cliente;
	}
	
	
	public Usuario getUsuario(int cUsuario) throws SQLException  {
		Usuario usuario = new Usuario();
		PreparedStatement prt;
		
			prt=con.prepareStatement("SELECT * FROM usuarios WHERE cUsuario=?");
			prt.setInt(1, cUsuario);
			
			ResultSet resultado = prt.executeQuery();
			resultado.next();
			usuario.setcUsuario(resultado.getInt("cUsuario"));
			usuario.setNombre(resultado.getString("nombre"));
			usuario.setApellido(resultado.getString("apellido"));
			usuario.setTelefono(resultado.getString("telefono"));
			usuario.setCorreoTrabajo(resultado.getString("correoTrabajo"));
			usuario.setTrabajo(resultado.getString("trabajo"));
			usuario.setMgr(resultado.getInt("mgr"));
			RolUsuario rolUsuario = new RolUsuario();
			rolUsuario.setId(resultado.getInt("rol"));
			usuario.setRol(rolUsuario);
			
			return usuario;
			
	}
}
