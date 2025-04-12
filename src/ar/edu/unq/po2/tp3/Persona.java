package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	String nombre;
	LocalDate fechaDeNacimiento;
	
	public Persona(String n, LocalDate fechaDeNacimiento) {
		this.nombre = n;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getfechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		return Period.between(fechaDeNacimiento, fechaActual).getYears();
	}
	
	public boolean menorQue(Persona p) {
		return this.edad() < p.edad();
	}
	
}
