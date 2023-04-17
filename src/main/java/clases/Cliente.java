package clases;

import java.util.ArrayList;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private RolUsuario rol;
	
	
	public Cliente(String dni, String nombre, String apellido, String telefono, String correo, RolUsuario rol) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.rol = rol;
	}
	
	public Cliente() {
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public RolUsuario getRol() {
		return rol;
	}

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}

	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", correo=" + correo + ", rol=" + rol + "]";
	}

	public void anadirReserva() {
		
	}
	public void verReservas(ArrayList<Reserva> reservas) {
		
	}
	
 }
