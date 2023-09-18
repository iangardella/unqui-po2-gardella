
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Counter;
import org.junit.jupiter.api.BeforeEach;

public class CounterTestCase {
	
	private Counter counter;
	private  ArrayList<Integer> numeros = new ArrayList<Integer>();
	/**
	 * Crea un escenario de test basico, que consiste en un contador 
	 * con 10 enteros 
	 * 
	 * @throws Exception
	 */
	
	@BeforeEach 
	public void setUp() throws Exception {
		// Se crea el contador 
		counter = new Counter();
		
		// Se agregan los numeros. Un solo par y nueve impares
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
		numeros.add(2222);
		numeros.add(3456);
		numeros.add(1200);
		
	}
	
	/**
	 * Verifica la cantidad de pares
	 */
	
	@Test
	public void testNumerosImpares() {
		// Obtener los numeros impares 
			int amount = counter.cantidadDeImpares();
		// Verificar el caso 
			assertEquals(amount, 9);
	}
	
	@Test
	public void testNumerosPares() {
		// Obtener los numeros impares
			int amount = counter.cantidadDePares();
			
		// Verificar el caso 
			assertEquals(amount, 1);
	}
	
	@Test 
	public void testNumerosMultiplos() {
		//Obtener los numeros multiplos de 1
			int amount = counter.cantidadDeMultiplos(1);
			
		//Verificar el caso 
			assertEquals(amount, 5);
	}
	
	@Test 
	public void testMayorDigitoPares() {
		int num = counter.encontrarNumeroMayorDigitosPares(numeros);
		
		assertEquals(num, 2222);
	}
	
	@Test 
	public void testMultiplos() {
		int numMultiplo = counter.encontrarMultiploMaximo(3, 9);
		
		assertEquals(numMultiplo, 999);
	}
	
}
