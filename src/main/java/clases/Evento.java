package clases;



public class Evento {
	private int cEvento;
	private String nombre;
	
	
	public Evento(int cEvento, String nombre) {
		super();
		this.cEvento = cEvento;
		this.nombre = nombre;
		
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

	

	@Override
	public String toString() {
		return "Evento [cEvento=" + cEvento + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}