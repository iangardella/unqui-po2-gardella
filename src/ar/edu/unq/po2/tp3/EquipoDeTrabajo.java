package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	String nombre;
	ArrayList<Persona> grupo;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		grupo = new ArrayList<>();
	}
	
	public String nombre() {
		return nombre;
	}
	
	public double promedioDeEdad() {
		int sumaEdades = 0;
		for (Persona p: grupo) {
			sumaEdades += p.edad();
		}
		
		return sumaEdades / grupo.size();
	}
	
	public void agregarIntegrante(Persona p) {
		grupo.add(p);
	}
	
	public void imprimirPromedio() {
		System.out.println("El promedio de edad del grupo " + this.promedioDeEdad() + " del Grupo " + this.nombre() );
	}
	
}
