package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Cliente {

	ArrayList<Producto> productosAComprar;
	String nombre;
	
	public Cliente(String n) {
		this.nombre = n;
		this.productosAComprar = new ArrayList<Producto>();
	}

	public ArrayList<Producto> productosAComprar() {
		return productosAComprar();
	}

	public void agregarProducto(Producto p) {
		productosAComprar.add(p);
	}
	
	public void sacarProducto(Producto p) {
		int index = productosAComprar.indexOf(p);
		productosAComprar.remove(index);
	}

}
