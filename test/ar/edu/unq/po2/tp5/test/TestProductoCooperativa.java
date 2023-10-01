package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.ProductoCooperativa;

class TestProductoCooperativa {

	private ProductoCooperativa p;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new ProductoCooperativa("Arroz", 10.0);
		p.setDescuento(0.9);;
	}

	@Test
	void testProductoCooperativa() {
		assertEquals(9.0, p.calcularPrecioFinal());
	}

}
