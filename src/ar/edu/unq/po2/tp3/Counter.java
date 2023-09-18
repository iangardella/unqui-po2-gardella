package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class Counter {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public int cantidadDePares() {
		int contador = 0;
		for(int numero : numeros) {
			if (numero % 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int cantidadDeImpares() {
		int contador = 0;
		for(int numero: numeros) {
			if (numero % 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	public int cantidadDeMultiplos(int n1) {
		int contador = 0;
		for(int numero: numeros) {
			if (n1 % numero == 0 ) {
				contador ++;
			}
		}
		return contador;
	}
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	
	//Ejercicio 2 
	
	public Integer mayorCantidadDigitosPares() {
		Integer numeroConMayorDigitoPares = encontrarNumeroMayorDigitosPares(numeros);
		return numeroConMayorDigitoPares;
	}
 	
    public int encontrarNumeroMayorDigitosPares(ArrayList<Integer> numeros) {
        int numeroMayor = -1;
        int maxDigitosPares = -1;

        for (int numero : numeros) {
            int digitosPares = contarDigitosPares(numero);
            if (digitosPares > maxDigitosPares) {
                maxDigitosPares = digitosPares;
                numeroMayor = numero;
            }
        }

        return numeroMayor;
    }

    public int contarDigitosPares(int numero) {
        int contador = 0;

        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            numero /= 10;
        }

        return contador;
    }
    
    public int encontrarMultiploMaximo(int x, int y) {
        for (int i = 1000; i >= 0; i--) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return -1; 
    }
    
}




