package ar.edu.unq.po2.tp5;

public class ProdcutoTradicional extends Producto{

	public ProdcutoTradicional(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public double calcularPrecioFinal() {
		return precio;
	}
	
	
}
