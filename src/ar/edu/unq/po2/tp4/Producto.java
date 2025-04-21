package ar.edu.unq.po2.tp4;

public class Producto {
	String nombreProducto;
	double precio = 0;
	boolean precioCuidado = false;

	public Producto(String nombreP, double precioP) {
		this.nombreProducto = nombreP;
		this.precio = precioP;
	}
	
	public Producto(String nombreP, double precioP, boolean precioCuidadoP) {
		this.nombreProducto = nombreP;
		this.precio = precioP;
		this.precioCuidado = precioCuidadoP;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String nombreProducto() {
		return nombreProducto;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
}
