package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	private double descuento;
	
	public ProductoCooperativa(String nombre, double precio) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return precio * descuento;
	}
	
	
}
