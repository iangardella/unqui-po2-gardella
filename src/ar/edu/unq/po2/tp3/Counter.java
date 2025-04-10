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
}
