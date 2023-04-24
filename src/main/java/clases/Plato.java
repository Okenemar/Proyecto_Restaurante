package clases;

import java.util.ArrayList;

public class Plato {
	private int cPlato;
	private String nombre;
	private Double precio;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Plato(int cPlato, String nombre, Double precio, ArrayList<Producto> productos) {
		super();
		this.cPlato = cPlato;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
	}
	
	public Plato() {
		
	}

	public int getcPlato() {
		return cPlato;
	}

	public void setcPlato(int cPlato) {
		this.cPlato = cPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Plato [cPlato=" + cPlato + ", nombre=" + nombre + ", precio=" + precio + ", productos=" + productos
				+ "]";
	}
	
	
	
}
