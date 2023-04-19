package clases;

import java.util.ArrayList;

public class Plato {
	private int cplato;
	private String nombre;
	private Double precio;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
	public Plato(int cplato, String nombre, Double precio, ArrayList<Producto> productos) {
		super();
		this.cplato = cplato;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
		
	}
	
	public Plato() {
		
	}

	public int getCplato() {
		return cplato;
	}

	public void setCplato(int cplato) {
		this.cplato = cplato;
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
		return "Plato [cplato=" + cplato + ", nombre=" + nombre + ", precio=" + precio + ", productos=" + productos
				+  "]";
	}
	
	
	
	
	
	
	
	
	
}
