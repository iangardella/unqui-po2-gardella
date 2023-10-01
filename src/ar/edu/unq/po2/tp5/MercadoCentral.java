package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class MercadoCentral {
	private Map<Producto , Integer> stock;
	
	public MercadoCentral() {
		stock = new HashMap<>();
	}
	
	public void addProducto(Producto p, Integer stockDeProducto) {
		stock.put(p, stockDeProducto);
	}
	
	public int obtenerStock(Producto p) {
		return stock.getOrDefault(p, 0);
	}
	
	public void actualizarStock(Producto p, int nuevoStock) {
		stock.put(p, nuevoStock);
	}
	
	
}
