package modeloCliente;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import clases.Cliente;
import clases.Reserva;
import conexion.Conector;

public class ModeloCliente extends Conector{
	
	public void registrarCliente(Cliente cliente) {
		
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("INSERT INTO clientes(DNI, nombre,apellido, telefono,correo) VALUES (?,?,?,?,?)");
		
			
			prt.setString(1, cliente.getDni());
			prt.setString(2, cliente.getNombre());
			prt.setString(3, cliente.getApellido());
			prt.setString(4, cliente.getTelefono());
			prt.setString(5, cliente.getCorreo());
			
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public boolean DNIExiste (String DNI) {
		
		Boolean encontrado =false;
		PreparedStatement prt;
		try {
			prt=con.prepareStatement("SELECT DNI FROM clientes WHERE DNI=?");
			
			prt.setString(1, DNI);
			
			ResultSet resultado = prt.executeQuery();
			
			if (resultado.next()) {
				encontrado =true;
			} else {
				encontrado= false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return encontrado;
		
		
	}
	
	public Cliente getCliente (String DNI) {
		Cliente cliente = new Cliente();
		
		PreparedStatement prt;
		
		try {
			prt=con.prepareStatement("SELECT nombre,Apellido,telefono,correo FROM clientes WHERE DNI=?");
		
			prt.setString(1, DNI);
			
			ResultSet resultado = prt.executeQuery();
			
			if (resultado.next()) {
				cliente.setDni(DNI);
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setApellido(resultado.getString("Apellido"));
				cliente.setTelefono(resultado.getString("telefono"));
				cliente.setCorreo(resultado.getString("correo"));
				
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
		return cliente;
	
	}
	
	
	
	
	
	
	public void crearReserva(Reserva reserva) {
		
		PreparedStatement prt;
		
		try {
			prt= con.prepareStatement("INSERT INTO reservas (fecha,DNI,nombre, telefono) VALUES (?,?,?,?)");
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


		public ArrayList<Reserva> getReservasUsuario(String DNI){

		PreparedStatement prt;

		ArrayList <Reserva> reservas = new ArrayList<>();

		Reserva reserva = new Reserva();

		try {

		prt = con.prepareStatement("SELECT * FROM reservas WHERE DNI=?");
		
		prt.setString(1, DNI);

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


	
	
}
