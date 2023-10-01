package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Cliente;
import ar.edu.unq.po2.tp5.MercadoCentral;
import ar.edu.unq.po2.tp5.ProdcutoTradicional;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

class TestMercadoCentral {
	private MercadoCentral mercadoCentral;
	private ProductoCooperativa p; 
	private Caja caja;
	private Cliente cliente;
	
	
	@BeforeEach
	void setUp() throws Exception {
		mercadoCentral = new MercadoCentral();
		p = new ProductoCooperativa("Arroz", 10.0);
		p.setDescuento(0.9);
		mercadoCentral.addProducto(p, 5);
		caja = new Caja(mercadoCentral);
		cliente = new Cliente();
		cliente.addProducto(p);
	}


	@Test
	void test() {
		assertEquals(4, mercadoCentral.obtenerStock(p));
	}

}
