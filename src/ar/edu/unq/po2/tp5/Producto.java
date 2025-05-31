package ar.edu.unq.po2.tp5;

public class Producto {
	String nombreProducto;
	double precio = 0;

	public Producto(String nombreP, double precioP) {
		this.nombreProducto = nombreP;
		this.precio = precioP;
	}
	
	public double precio() {
		return precio;
	}
	
	public String nombreProducto() {
		return nombreProducto;
	}
	
}
