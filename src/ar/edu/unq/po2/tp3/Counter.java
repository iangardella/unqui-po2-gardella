package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> listNumbers;
	
	public Counter() {
		listNumbers = new ArrayList<>();
	}
	
	public void addNumber(Integer x) {
		listNumbers.add(x);
	}
	
	public int getEvenOcurrence() {
		int counter = 0;
		for(int n:listNumbers) {
			if (n % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public int getOddOcurrence() {
		int counter = 0;
		for(int n:listNumbers) {
			if(n%2 != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public int getMult(int div) {
		int counter = 0;
		for(int n:listNumbers) {
			if (n % div == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public int findNumberWithMaxEvensNumbers() {
		int maxEvenDigits = 0;
		int resultNumber = 0;
		for(int n: listNumbers) {
			int evenDigitsCount = countEvenDigits(n);
			
			if (evenDigitsCount > maxEvenDigits) {
				maxEvenDigits = evenDigitsCount;
				resultNumber = n;
			}
		}
		return resultNumber;
	}

	private int countEvenDigits(int n) {
		int count = 0;
		
		n = Math.abs(n);
		
		while(n > 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
}
