package clases;

public class RolUsuario {
	private int id;
	private String nombre;
	
	public RolUsuario(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public RolUsuario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "RolUsuario [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

	
}
