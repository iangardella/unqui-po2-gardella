package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class EquipoDeTrabajo {
	private String nombre;
	private static ArrayList<Persona2> empleados = new ArrayList<Persona2>();
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int promedioEdad() {
		int cantidadDeEmpleados = empleados.size();
		int edades = 0;
		for(Persona2 empleado : empleados) {
			edades += empleado.getEdad();
		}
		return edades / cantidadDeEmpleados;
	}
	
	public void addEmpleado(Persona2 p) {
		empleados.add(p);
	}
}
