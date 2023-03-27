package clases;

import java.util.Date;

public class Evento {
	private int cEvento;
	private String nombre;
	private Date fecha;
	private Usuario usuario; //para el codigo de usuario
	
	public Evento(int cEvento, String nombre, Date fecha, Usuario usuario) {
		super();
		this.cEvento = cEvento;
		this.nombre = nombre;
		this.fecha = fecha;
		this.usuario = usuario;
	}
	
	public Evento() {
		
	}

	public int getcEvento() {
		return cEvento;
	}

	public void setcEvento(int cEvento) {
		this.cEvento = cEvento;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Evento [cEvento=" + cEvento + ", nombre=" + nombre + ", fecha=" + fecha + ", usuario=" + usuario + "]";
	}
	
	
	
	
	
	
}