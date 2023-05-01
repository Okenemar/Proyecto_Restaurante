package modeloUsuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.RolUsuario;
import conexion.Conector;

public class ModeloRolUsuario extends Conector{

		public ArrayList<RolUsuario> getRolesUsuarios(){
			
			PreparedStatement prt;
			ArrayList <RolUsuario> roles = new ArrayList <>();
			RolUsuario rol = new RolUsuario();
			
			try {
				prt = con.prepareStatement("SELECT id,nombre FROM roles_usuarios");
				
				ResultSet result = prt.executeQuery();
				
				while (result.next()) {
					rol = new RolUsuario();
					rol.setId(result.getInt(1));
					rol.setNombre(result.getString(2));
					
					roles.add(rol);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			return roles;
		}

public RolUsuario getRol (int id) {
	
	PreparedStatement prt;
	RolUsuario rol = new RolUsuario();
	
	try {
		prt= con.prepareStatement("SELECT id,nombre FROM roles_usuarios WHERE id=?");
		prt.setInt(1, id);
		ResultSet result = prt.executeQuery();
		
		while(result.next()) {
			rol.setId(result.getInt(1));
			rol.setNombre(result.getString(2));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		return rol;
	
}
		
}
