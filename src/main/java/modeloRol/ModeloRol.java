package modeloRol;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.RolUsuario;
import conexion.Conector;

public class ModeloRol extends Conector {
	
	public ArrayList<RolUsuario> getRoles (){
		
		PreparedStatement prt;
		ArrayList <RolUsuario> roles = new ArrayList <>();
		RolUsuario rol = new RolUsuario();
			try {
				prt = con.prepareStatement("SELECT * FROM roles_usuarios ");
				ResultSet resultado = prt.executeQuery();
				
				while(resultado.next()) {
					rol = new RolUsuario();
					rol.setId(resultado.getInt(1));
					rol.setNombre(resultado.getString(2));
					
					roles.add(rol);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return roles;
		}

	public RolUsuario getRol(int id) {
		
		PreparedStatement prt;
		RolUsuario rol = new RolUsuario();
		
			try {
				prt= con.prepareStatement("SELECT * FROM roles_usuarios WHERE id=?");
				prt.setInt(1, id);
				
				ResultSet result = prt.executeQuery();

				while(result.next()) {
					rol.setId(result.getInt(1));
					rol.setNombre(result.getString(2));
					
					return rol;					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rol;
		}
	}
