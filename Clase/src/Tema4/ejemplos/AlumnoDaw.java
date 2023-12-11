package Tema4.ejemplos;

import java.time.LocalDate;

public class AlumnoDaw {
	// Propiedades de instancia
	private String nombre;
	private String dni;
	private String localidadResidencia;
	private LocalDate fechaNacimiento;
	private int horasAsistidas;
	// Constructor
	public AlumnoDaw(String nombre,	String dni,
			String localidadResidencia,	LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.localidadResidencia = localidadResidencia;
		this.fechaNacimiento = fechaNacimiento;
		this.horasAsistidas = 0;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getLocalidadResidencia() {
		return localidadResidencia;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getHorasAsistidas() {
		return horasAsistidas;
	}

	public void setHorasAsistidas(int horasAsistidas) {
		this.horasAsistidas = horasAsistidas;
	}

	// toString
	public String toString() {
		return "AlumnoDaw [nombre = " + nombre
				+ ", dni = " + dni
				+ ", localidadResidencia = " + localidadResidencia
				+ ", fechaNacimiento = " + fechaNacimiento + "]";
	}
	
	// Otros métods de instancia
	public void asistir(int horas) {
		
	}
	public void darDeBaja(){
		
	}
	
}
