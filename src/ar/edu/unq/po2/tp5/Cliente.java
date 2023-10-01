package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Producto> productosEnCarro;
	
	
	public Cliente() {
		productosEnCarro = new ArrayList<Producto>(); 
	}
	
	public void addProducto(Producto p) {
		productosEnCarro.add(p);
	}
	
	public List<Producto> getProductosEnCarro(){
		return productosEnCarro;
	}
	
	
}
