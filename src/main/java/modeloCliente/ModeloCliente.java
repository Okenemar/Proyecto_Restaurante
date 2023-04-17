package modeloCliente;


import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Date;


import clases.Reserva;
import conexion.Conector;

public class ModeloCliente extends Conector{
	
	
	public void crearReserva(Reserva reserva) {
		
		PreparedStatement prt;
		
		try {
			prt= con.prepareStatement("INSERT INTO reservas( DNI, nombre, telefono) VALUES (?,?,?,?)");
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
