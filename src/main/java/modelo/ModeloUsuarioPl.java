package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Plato;
import clases.Producto;
import conexion.Conector;

public class ModeloUsuarioPl extends Conector{
	
	
	public ArrayList<Plato> getPlatos (){
		
		PreparedStatement prt;
		ArrayList <Plato> platos = new ArrayList<>();
		
		try {
			prt = con.prepareStatement("SELECT c_plato, nombre, precio FROM platos");
			
			ResultSet result= prt.executeQuery();
			
			while(result.next()) {
				Plato plato = new Plato();
				plato.setcPlato(result.getInt(1));
				plato.setNombre(result.getString(2));
				plato.setPrecio(result.getDouble(3));
				
				platos.add(plato);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return platos;
	}
	
	public ArrayList<Producto> getProductosPlato(int cPlato) {
		PreparedStatement prt;
		ArrayList <Producto> productos = new ArrayList<Producto>();
		
		try {
			prt = con.prepareStatement("SELECT  c_producto,nombre  FROM productos INNER JOIN plato_producto ON c_producto = codigo_producto WHERE codigo_plato=?");
			prt.setInt(1,cPlato);
			
			ResultSet result = prt.executeQuery();
			
			while(result.next()) {
				Producto producto = new Producto();
				producto.setcProducto(result.getInt(1));
				producto.setNombre(result.getString(2));
				
				
				productos.add(producto);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return productos;
		
	}
	
	
	
	
	public Plato getPlato (int cPlato) {
		
		PreparedStatement prt;
		Plato plato = new Plato();
		
		try {
			prt = con.prepareStatement("SELECT c_plato,nombre,precio FROM platos WHERE c_plato=?");
		
		prt.setInt(1, cPlato);
		
		ResultSet result = prt.executeQuery();
		
		if (result.next()) {
			
			
			plato.setcPlato(result.getInt("c_Plato"));
			plato.setNombre(result.getString("nombre"));
			plato.setPrecio(result.getDouble("precio"));
			
			plato.setProductos(getProductosPlato(cPlato));
			
			
				
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plato;
		
		//cargar plato
		
		
		
		
		
		
		
		
		
	}

}
