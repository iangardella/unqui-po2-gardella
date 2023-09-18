package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> numeros = new ArrayList<Integer>() ; 
	
	public int sumarTodosLosNumeros() {
		int sumaTotal = 0;
		for (int numero : numeros) {
			sumaTotal += numero;
		}
		return sumaTotal;
	}
	
	public int restaTodosLosNumeros() {
		int restaTotal = 0;
		for (int numero : numeros) {
			restaTotal -= numero;
		}
		return restaTotal;
	}
	
	public int multiplicarTodosLosNumeros() {
		int sumaTotal = 0;
		for (int numero : numeros) {
			sumaTotal = sumaTotal * numero;
		}
		return sumaTotal;
	}
}
