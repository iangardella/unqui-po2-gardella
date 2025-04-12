package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperator {
	
	public int sumar(ArrayList<Integer> ns) {
		int suma = 0;
		for (int n: ns) {
			suma += n;
		}
		return suma;
	}
	
	public int restar(ArrayList<Integer> ns) {
		int resta = 0;
		for (int n:ns) {
			resta -= n;
		}
		return resta;
	}
	
	public int multiplicar(ArrayList<Integer> ns) {
		if(ns.isEmpty()) {
			return 1;
		}
		int producto = 1;
		for (int n: ns) {
			producto *= n;
		}
		return producto;
	}
}