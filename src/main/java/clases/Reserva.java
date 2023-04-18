package clases;


import java.util.Date;





public class Reserva {
	private int nReserva;
	private Date fecha;
	private Cliente cliente; //para el DNI del cliente
	private Usuario usuario; //para el código de usuario
	
	public Reserva(int nReserva, Date fecha, Cliente cliente, Usuario codigoUsurio) {
		super();
		this.nReserva = nReserva;
		this.fecha = fecha;
		this.cliente = cliente;
		this.usuario = codigoUsurio;
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

	public Usuario getCodigoUsurio() {
		return usuario;
	}

	public void setCodigoUsurio(Usuario codigoUsurio) {
		this.usuario = codigoUsurio;
	}

	@Override
	public String toString() {
		return "Reserva [nReserva=" + nReserva + ", fecha=" + fecha + ", cliente=" + cliente + ", codigoUsurio="
				+ usuario + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
