package ar.edu.unq.po2.tp4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Trabajador;
import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoPorHoras;

class TrabajdorTest {
	Trabajador trabajador;
	IngresoPorHoras ingresoPorHoras1;
	Ingreso ingreso1;
	IngresoPorHoras ingresoPorHoras2; 
	
	@BeforeEach
	void setUp() throws Exception {
		ingresoPorHoras1 = new IngresoPorHoras("Agosto", 4, 20);
		ingresoPorHoras2 = new IngresoPorHoras("Septiembre", 2, 10);
		ingreso1 = new Ingreso("Enero", "LavarPlata", 20.0);
		trabajador = new Trabajador("Ian", 20);
		trabajador.addIngreso(ingreso1);
		trabajador.addIngreso(ingresoPorHoras1);
		trabajador.addIngreso(ingresoPorHoras2);
	}

	@Test
	void testGetTotalPercibido() {
		assertEquals(80.0, trabajador.getTotalPercibidos());
	}
	@Test
	void testGetMontoImponible() {
		assertEquals(50.0, trabajador.getMontoImponible());
	}
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(1.0, trabajador.getImpuestoAPagar());
	}
}
