package modeloCliente;


import java.sql.PreparedStatement;

import java.sql.SQLException;
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
}
