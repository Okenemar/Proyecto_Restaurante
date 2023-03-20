package clases;

import java.sql.Date;

public class Reserva {
	private int nºreserva;
	private Date fecha;
	private Date hora;
	
	public Reserva(int nºreserva, Date fecha, Date hora) {
		super();
		this.nºreserva = nºreserva;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public Reserva() {
		
	}
	public int getNºreserva() {
		return nºreserva;
	}
	public void setNºreserva(int nºreserva) {
		this.nºreserva = nºreserva;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Reserva [nºreserva=" + nºreserva + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
}
