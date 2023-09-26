import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {

	private Multioperador multi;
	
	@BeforeEach 
	public void setUp() throws Exception {
		multi = new Multioperador();
		
		multi.addNumbre(2);
		multi.addNumbre(2);
		multi.addNumbre(2);
		
	}
	
	@Test
	public void testSuma() {
		int sumaTotal = multi.sumarTodosLosNumeros();
		
		assertEquals(sumaTotal, 6);
	}
	
    
	@Test
	public void testResta() {
		int total = multi.restaTodosLosNumeros();
		
		assertEquals(total, -6);
	}
	
	
	@Test
	public void testMultiplcar() {
		int totalMult = multi.multiplicarTodosLosNumeros();
		
		assertEquals(totalMult, 8);
	}
}
