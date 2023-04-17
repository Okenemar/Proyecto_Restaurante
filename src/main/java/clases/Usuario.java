package clases;

public class Usuario {
	
	private int cUsuario;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correoTrabajo;
	private String trabajo;
	private int mgr;
	private RolUsuario rol;
	
	public Usuario(int cUsuario, String nombre, String apellido, String telefono, String correoTrabajo, String trabajo,
			int mgr, RolUsuario rol) {
		super();
		this.cUsuario = cUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correoTrabajo = correoTrabajo;
		this.trabajo = trabajo;
		this.mgr = mgr;
		this.rol = rol;
	}
	
	public Usuario() {
		
	}

	public int getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(int cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoTrabajo() {
		return correoTrabajo;
	}

	public void setCorreoTrabajo(String correoTrabajo) {
		this.correoTrabajo = correoTrabajo;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public RolUsuario getRol() {
		return rol;
	}

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [cUsuario=" + cUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correoTrabajo=" + correoTrabajo + ", trabajo=" + trabajo + ", mgr=" + mgr + ", rol="
				+ rol + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
