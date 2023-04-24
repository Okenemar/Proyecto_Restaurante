package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Producto;
import conexion.Conector;

public class ModeloUsuarioP extends Conector {

	

	public ArrayList<Producto> getProductos() {
		
		ArrayList <Producto> productos = new ArrayList <>();
		
		PreparedStatement prt ;
		
		
		try {
			prt = con.prepareStatement("SELECT c_producto,nombre,calorias,proteinas,cantidad,precio FROM productos ");
		
			ResultSet result = prt.executeQuery();
			
			while (result.next()) {
				Producto producto = new Producto();
				
				producto.setcProducto(result.getInt(1));
				producto.setNombre(result.getString(2));
				producto.setCalorias(result.getDouble(3));
				producto.setProteinas(result.getDouble(4));
				producto.setCantidad(result.getInt(5));
				producto.setPrecio(result.getDouble(6));	
				
				productos.add(producto);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productos;
		
		
	}

	public Producto getProducto(int cProducto) {

		
		Producto producto = new Producto();
		
		
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("SELECT c_producto,nombre,calorias,proteinas,cantidad,precio FROM productos WHERE c_producto=?");
			
			prt.setInt(1, cProducto);
			
			ResultSet result = prt.executeQuery();
			
			if (result.next()) {
				
				
				producto.setcProducto(result.getInt("c_producto"));
				producto.setNombre(result.getString("nombre"));
				producto.setCalorias(result.getDouble("calorias"));
				producto.setProteinas(result.getDouble("proteinas"));
				producto.setCantidad(result.getInt("cantidad"));
				producto.setPrecio(result.getDouble("precio"));
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return  producto;
	}
	
	public void modificarProducto(Producto producto) {
		
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("UPDATE productos SET nombre=?,calorias=?,proteinas=?,cantidad=?,precio=? WHERE c_producto=?");
			
			prt.setString(1, producto.getNombre());
			prt.setDouble(2, producto.getCalorias());
			prt.setDouble(3, producto.getProteinas());
			prt.setInt(4, producto.getCantidad());
			prt.setDouble(5, producto.getPrecio());
			prt.setInt(6, producto.getcProducto());
			
			prt.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void eliminarProducto(int cProducto) {
		
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("DELETE FROM productos WHERE  c_producto=?");
			prt.setInt(1, cProducto);
			prt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
  public void registrarProducto (Producto producto) {
	  
	  PreparedStatement prt;
	  
	  try {
		prt = con.prepareStatement("INSERT INTO productos(nombre,calorias,proteinas,cantidad,precio) VALUES (?,?,?,?,?)");
	
		 prt.setString(1, producto.getNombre());
		 prt.setDouble(2, producto.getCalorias());
		 prt.setDouble(3, producto.getProteinas());
		 prt.setInt(4, producto.getCantidad());
		 prt.setDouble(5, producto.getPrecio());
		  
		 prt.execute();
	  
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 
	  
  }

	
	
	
	
	
	
	
}
