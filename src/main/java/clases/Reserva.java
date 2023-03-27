package clases;

import java.util.Date;

import org.apache.tomcat.jni.Time;

public class Reserva {
	private int nºreserva;
	private Date fecha;
	private Time hora;
	
	public Reserva(int nºreserva, Date fecha, Time hora) {
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
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Reserva [nºreserva=" + nºreserva + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
}
