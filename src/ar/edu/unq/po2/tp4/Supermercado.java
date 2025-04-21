package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	String nombreSuper;
	String direccion;
	ArrayList<Producto> listProductos;
	
	public Supermercado(String nombreS, String direccionS) {
		this.nombreSuper = nombreS;
		this.direccion = direccionS;
		this.listProductos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		this.listProductos.add(p);
	}

	public Integer getCantidadDeProductos() {
		return listProductos.size();
	}

	public Double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p:listProductos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
	
	
}
