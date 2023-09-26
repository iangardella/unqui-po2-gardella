package ar.edu.unq.po2.tp3;

import java.time.*;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() > persona.edad();
	}

}
