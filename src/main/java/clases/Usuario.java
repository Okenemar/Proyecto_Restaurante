package clases;

public class Usuario {
	
	private int cUsuario;
	private String nombre;
	private String apellido;
	private String contraseña;
	private String telefono;
	private String correoTrabajo;
	
	private RolUsuario rol;

	public Usuario(int cUsuario, String nombre, String apellido, String contraseña, String telefono,
			String correoTrabajo, RolUsuario rol) {
		super();
		this.cUsuario = cUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
		this.telefono = telefono;
		this.correoTrabajo = correoTrabajo;
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


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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


	public RolUsuario getRol() {
		return rol;
	}


	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}


	@Override
	public String toString() {
		return "Usuario [cUsuario=" + cUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", contraseña="
				+ contraseña + ", telefono=" + telefono + ", correoTrabajo=" + correoTrabajo + ", rol=" + rol + "]";
	}
	
}