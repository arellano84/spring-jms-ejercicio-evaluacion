package app.modelo;

import java.io.Serializable;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Bean del cliente.
 * 
 * Módulo Spring JMS
 */

public class Cliente implements Serializable{
	
	private String dni;
	private String nombre;
	private String apellido;
	private String edad;
	private String telefono;
	private String email;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String dni, String nombre, String apellido, String edad,
			String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
}
