package clases;

public abstract class Usuario {
	
	private int cºusuario;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo_trabajo;
	private String trabajo;
	private int mgr;
	
	
	
	public Usuario(int cºusuario, String nombre, String apellido, String telefono, String correo_trabajo,
			String trabajo, int mgr) {
		super();
		this.cºusuario = cºusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo_trabajo = correo_trabajo;
		this.trabajo = trabajo;
		this.mgr = mgr;
	}
	
	public Usuario() {
		
	}
	
	public int getCºusuario() {
		return cºusuario;
	}
	public void setCºusuario(int cºusuario) {
		this.cºusuario = cºusuario;
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
	public String getCorreo_trabajo() {
		return correo_trabajo;
	}
	public void setCorreo_trabajo(String correo_trabajo) {
		this.correo_trabajo = correo_trabajo;
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

	@Override
	public String toString() {
		return "Usuario [cºusuario=" + cºusuario + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correo_trabajo=" + correo_trabajo + ", trabajo=" + trabajo + ", mgr=" + mgr + "]";
	}
	
	
	
}
