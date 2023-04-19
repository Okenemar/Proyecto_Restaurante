package clases;



public class Producto {
	private int cProducto;
	private String nombre;
	private int cantidad;
	private Double precio;
	

	
	public Producto(int cProducto, String nombre, int cantidad, Double precio) {
		super();
		this.cProducto = cProducto;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public Producto() {
		
	}

	public int getcProducto() {
		return cProducto;
	}

	public void setcProducto(int cProducto) {
		this.cProducto = cProducto;
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
		return "Producto [cProducto=" + cProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
}
