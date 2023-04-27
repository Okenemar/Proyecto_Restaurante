package controladorUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Evento;
import conexion.Conector;

public class ModeloEvento  extends Conector{
		
		PreparedStatement prt;
		
		
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
		
		
		
			
		
		
}
