package clases;


import java.util.Date;





public class Reserva {
	private int nReserva;
	private Date fecha;
	private Cliente cliente; //para el DNI del cliente
	
	public Reserva(int nReserva, Date fecha, Cliente cliente) {
		super();
		this.nReserva = nReserva;
		this.fecha = fecha;
		this.cliente = cliente;
		
	}
	
	public Reserva() {
		
	}

	public int getnReserva() {
		return nReserva;
	}

	public void setnReserva(int nReserva) {
		this.nReserva = nReserva;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Reserva [nReserva=" + nReserva + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
