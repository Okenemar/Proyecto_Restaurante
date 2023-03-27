package clases;

import java.util.ArrayList;

public class Pedido {
	
	private int cPedido;
	private int cantidad;
	private Double precio;
	private ArrayList <LineaPedido> lineasPedido = new ArrayList <LineaPedido>();
	private Usuario usuario; //codigo usuario
	
	

	public Pedido(int cPedido, int cantidad, Double precio, ArrayList<LineaPedido> lineasPedido, Usuario usuario) {
		super();
		this.cPedido = cPedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.lineasPedido = lineasPedido;
		this.usuario = usuario;
	}

	public Pedido() {
		
	}

	
	public int getcPedido() {
		return cPedido;
	}

	public void setcPedido(int cPedido) {
		this.cPedido = cPedido;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	
	
	@Override
	public String toString() {
		return "Pedido [cPedido=" + cPedido + ", cantidad=" + cantidad + ", precio=" + precio + ", lineasPedido="
				+ lineasPedido + ", usuario=" + usuario + "]";
	}




	private class LineaPedido {
		private int cLineaPedido;
		private double precio;
		private int cantidad;
		private Pedido pedido;
		
		
		public LineaPedido(int cLineaPedido, double precio, int cantidad, Pedido pedido) {
			super();
			this.cLineaPedido = cLineaPedido;
			this.precio = precio;
			this.cantidad = cantidad;
			this.pedido = pedido;
		}

		public LineaPedido() {
			
		}

		public int getcLineaPedido() {
			return cLineaPedido;
		}

		public void setcLineaPedido(int cLineaPedido) {
			this.cLineaPedido = cLineaPedido;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public Pedido getPedido() {
			return pedido;
		}

		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}

		@Override
		public String toString() {
			return "LineaPedido [cLineaPedido=" + cLineaPedido + ", precio=" + precio + ", cantidad=" + cantidad
					+ ", pedido=" + pedido + "]";
		}
		
		
		
	}
	
	
	
	
}


