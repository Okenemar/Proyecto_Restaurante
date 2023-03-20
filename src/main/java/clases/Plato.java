package clases;

import java.util.ArrayList;

public class Plato {
	private int cªplato;
	private String nombre;
	private Double precio;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Plato(int cªplato, String nombre, Double precio, ArrayList<Producto> productos) {
		super();
		this.cªplato = cªplato;
		this.nombre = nombre;
		this.precio = precio;
		this.productos = productos;
	}
	public Plato() {
		
	}
	public int getCªplato() {
		return cªplato;
	}
	public void setCªplato(int cªplato) {
		this.cªplato = cªplato;
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
	
	@Override
	public String toString() {
		return "Plato [cªplato=" + cªplato + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
