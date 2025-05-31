package ar.edu.unq.po2.tp5;

public class ProductoCoorporativo extends Producto{

	double descuento = 0.90 ;
	
	public ProductoCoorporativo(String n, double p) {
		super(n,p);
	}
	
	public void cambiarDescucento(double d) {
		this.descuento = d;
	}
	@Override
	public double precio() {
		return precio * descuento;
	}
	

}
