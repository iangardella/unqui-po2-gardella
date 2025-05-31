package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class SuperMercado {
	String nombre;
	HashMap<Producto, Integer> listProductos;
	ArrayList<CajaMercado> cajas;
	
	public SuperMercado(String nombreS) {
		this.nombre = nombreS;
		this.listProductos = new HashMap<Producto, Integer>();
		this.cajas = new ArrayList<CajaMercado>();
	}
	
	public SuperMercado(String nombreS, HashMap<Producto, Integer> ps, ArrayList<CajaMercado> cs) {
		this.nombre = nombreS;
		this.listProductos = ps;
		this.cajas = cs;
	}
	
	public void agregarProducto(Producto p, Integer c) {
		this.listProductos.put(p, c);
	}

	public void sacarProducto(Producto p) {
		Integer cantP = this.listProductos.get(p);
		cantP =- 1;
		this.listProductos.put(p, cantP);
	}

	public Integer cantidadEnStockProducto(Producto p) {
		return listProductos.get(p);
	}
	
}