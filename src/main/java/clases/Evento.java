package clases;

import java.util.Date;

public class Evento {
	private int cºEvento;
	private String nombre;
	private Date fecha;
	
	public Evento(int cºEvento, String nombre, Date fecha) {
		super();
		this.cºEvento = cºEvento;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public Evento() {
		
	}
	public int getCºEvento() {
		return cºEvento;
	}
	public void setCºEvento(int cºEvento) {
		this.cºEvento = cºEvento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Evento [cºEvento=" + cºEvento + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	
}
