package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {
	private Multiplo multiplo;
	
	
	@BeforeEach 
	public void setUp() throws Exception{
		multiplo = new Multiplo();
	}
	
	@Test
	void testMMC() {
		int mmc = multiplo.mayorMultiploComun(3,9);
		assertEquals(mmc, 999);
	}

}
