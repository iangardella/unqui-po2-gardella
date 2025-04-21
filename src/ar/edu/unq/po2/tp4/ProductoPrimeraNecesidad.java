package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombreP, double precioP, boolean precioCuidadoP) {
		super(nombreP, precioP, precioCuidadoP);
	}
	
	@Override
	public double getPrecio() {
		return precio * 0.9;
	}

}
