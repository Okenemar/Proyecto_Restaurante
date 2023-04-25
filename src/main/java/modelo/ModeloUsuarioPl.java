package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Plato;
import clases.Producto;
import conexion.Conector;

public class ModeloUsuarioPl extends Conector {

	public ArrayList<Plato> getPlatos() {

		PreparedStatement prt;
		ArrayList<Plato> platos = new ArrayList<>();

		try {
			prt = con.prepareStatement("SELECT c_plato, nombre, precio FROM platos");

			ResultSet result = prt.executeQuery();

			while (result.next()) {
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
		ArrayList<Producto> productos = new ArrayList<Producto>();

		try {
			prt = con.prepareStatement(
					"SELECT  c_producto,nombre  FROM productos INNER JOIN plato_producto ON c_producto = codigo_producto WHERE codigo_plato=?");
			prt.setInt(1, cPlato);

			ResultSet result = prt.executeQuery();

			while (result.next()) {
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

	public Plato getPlato(int cPlato) {

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

		// cargar plato

	}

	public void CrearPlato(Plato plato) {

		PreparedStatement prt;

		try {
			prt = con.prepareStatement("INSERT INTO platos(nombre,precio) VALUES (?,?)");

			prt.setString(1, plato.getNombre());
			prt.setDouble(2, plato.getPrecio());

			prt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void getCodigoPlato(Plato plato) {
		PreparedStatement prt;
		
		try {
			prt = con.prepareStatement("select c_plato from platos where nombre=?");
			
			prt.setString(1, plato.getNombre());
			ResultSet result = prt.executeQuery();
			while(result.next()) {
				plato.setcPlato(result.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void AñadirProductosPlato(Plato plato) {

		PreparedStatement prt;
		
		for(Producto producto:plato.getProductos()) {
			try {
				prt = con.prepareStatement("INSERT INTO plato_producto (codigo_plato,codigo_producto) VALUES (?,?)");
				prt.setInt(1, plato.getcPlato());
				prt.setInt(2, producto.getcProducto());
				prt.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	
}
