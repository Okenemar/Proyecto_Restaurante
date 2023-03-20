package clases;

public class Pedido {
	
	private int cºpedido;
	private int cantidad;
	private Double precio;
	private ArrayList<LineaPedido> lineaspedido = new ArrayList<LineaPedido>();
	
	public Pedido(int cºpedido, int cantidad, Double precio, ArrayList<LineaPedido> lineaspedido) {
		super();
		this.cºpedido = cºpedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.lineaspedido = lineaspedido;
	}

	public Pedido() {
		
	}
	public int getCºpedido() {
		return cºpedido;
	}

	public void setCºpedido(int cºpedido) {
		this.cºpedido = cºpedido;
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

	public ArrayList<LineaPedido> getLineaspedido() {
		return lineaspedido;
	}

	public void setLineaspedido(ArrayList<LineaPedido> lineaspedido) {
		this.lineaspedido = lineaspedido;
	}
	
	private class LineaPedido() {
		private int cºlinea_pedido;
		
	}
	@Override
	public String toString() {
		return "Pedido [cºpedido=" + cºpedido + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
