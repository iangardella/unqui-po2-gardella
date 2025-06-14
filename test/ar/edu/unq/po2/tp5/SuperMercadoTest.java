package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp4.Supermercado;

public class SuperMercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private SuperMercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d);
		detergente = new Producto("Detergente", 75d);
		supermercado = new SuperMercado("Lo de Tito");
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	

	@Test
	public void testPrecioTotal() {
		assertEquals(0.0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9, supermercado.getPrecioTotal());
	}
}