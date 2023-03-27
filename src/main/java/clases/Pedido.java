package clases;

import java.util.ArrayList;

public class Pedido {
	
	private int cºpedido;
	private int cantidad;
	private Double precio;
	private ArrayList <LineaPedido> lineasPedido = new ArrayList <LineaPedido>();
	
	

	public Pedido(int cºpedido, int cantidad, Double precio, ArrayList<LineaPedido> lineasPedido) {
		super();
		this.cºpedido = cºpedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.lineasPedido = lineasPedido;
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



	public ArrayList<LineaPedido> getLineasPedido() {
		return lineasPedido;
	}



	public void setLineasPedido(ArrayList<LineaPedido> lineasPedido) {
		this.lineasPedido = lineasPedido;
	}

	

	@Override
	public String toString() {
		return "Pedido [cºpedido=" + cºpedido + ", cantidad=" + cantidad + ", precio=" + precio + ", lineasPedido="
				+ lineasPedido + "]";
	}



	private class LineaPedido {
		private int cºlinea_pedido;

		
		LineaPedido(int cºlinea_pedido) {
			
			this.cºlinea_pedido = cºlinea_pedido;
		}
		
		
	}
	
	
	
	
}


