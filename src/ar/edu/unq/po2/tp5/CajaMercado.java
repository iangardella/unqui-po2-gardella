package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class CajaMercado {
	Integer id; 
	SuperMercado superM;
	
	public CajaMercado(Integer idC, SuperMercado superMer) {
		this.id = idC;
		this.superM = superMer;
	}
	
	public double registarProductos(Cliente c) {
		descontarStock(c.productosAComprar());
		return montoTotal(c.productosAComprar());
	}

	public double montoTotal(ArrayList<Producto> ps) {
		double montoTotal = 0;
		for (Producto p: ps) {
			montoTotal *= p.precio();
		}
		return montoTotal;
	}
	
	public void descontarStock(ArrayList<Producto> ps) {
		for (Producto p: ps) {
			superM.sacarProducto(p);
		}
	}
	
}
