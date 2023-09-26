package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private int año;
	private ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Trabajador(String nombre, int año) {
		this.nombre = nombre;
		this.año = año;
	}
	
	public double getTotalPercibidos() {
		double total = 0.0;
		for (Ingreso i : ingresos) {
			total += i.getMontoPercibido();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double totalImponible = 0.0;
		for (Ingreso i : ingresos) {
			totalImponible += i.getMontoImponible();
		}
		return totalImponible;
	}
	
	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}
	
	public void addIngreso(Ingreso i) {
		ingresos.add(i);
	}
}
