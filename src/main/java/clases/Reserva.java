package clases;

import java.time.LocalDateTime;





public class Reserva {
	private int nReserva;
	private LocalDateTime fechaHora;
	private Cliente cliente; //para el DNI del cliente
	private Gerente gerente; //para el código de usuario
	
	public Reserva(int nReserva, LocalDateTime fechaHora, Cliente cliente, Gerente gerente) {
		super();
		this.nReserva = nReserva;
		this.fechaHora = fechaHora;
		this.cliente = cliente;
		this.gerente = gerente;
	}
	
	public Reserva() {
		
	}

	public int getnReserva() {
		return nReserva;
	}

	public void setnReserva(int nReserva) {
		this.nReserva = nReserva;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Reserva [nReserva=" + nReserva + ", fechaHora=" + fechaHora + ", cliente=" + cliente + ", gerente="
				+ gerente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
