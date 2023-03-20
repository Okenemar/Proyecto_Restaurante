package clases;

public class Producto {
	private int cºproducto;
	private String nombre;
	private int cantidad;
	private Double precio;
	
	public Producto(int cºproducto, String nombre, int cantidad, Double precio) {
		super();
		this.cºproducto = cºproducto;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public Producto() {
		
	}
	public int getCºproducto() {
		return cºproducto;
	}
	public void setCºproducto(int cºproducto) {
		this.cºproducto = cºproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [cºproducto=" + cºproducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
}
