package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCasc {
	private Counter counter;
	
	private Counter counter1;
	
	@BeforeEach
	public void setUp() throws Exception {
	
	counter = new Counter();
	
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}

	
	@BeforeEach
	public void setUp1() throws Exception {
		counter1 = new Counter();
		
		counter1.addNumber(1234);
        counter1.addNumber(2468);
        counter1.addNumber(135);
        counter1.addNumber(-8246);
        counter1.addNumber(9098);

		
	}
	@Test
	void testOddNumbers() {
		int amount = counter.getOddOcurrence();
		
		assertEquals(amount, 8);
	}
	
	@Test
	void testEvenNumbers() {
		int amount = counter.getEvenOcurrence();
		
		assertEquals(amount, 1);
	}

	@Test
	void testMultOcurrences() {
		int amount = counter.getMult(2);
		
		assertEquals(amount, 1);
	}
	
	@Test 
	void testFindNumberWithMostEvenDigits() {
		int numberEvenDigitsMax = counter1.findNumberWithMaxEvensNumbers();
		
		assertEquals(numberEvenDigitsMax, 2468);
	}
}
