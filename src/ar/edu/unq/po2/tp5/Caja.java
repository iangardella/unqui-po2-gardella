package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	private double montoTotal; 
	private MercadoCentral mercado;
	
	public Caja(MercadoCentral mc) {
		this.montoTotal = 0;
		this.mercado = mc;
	}	
	public void registrarProductos(Cliente c) {
		
		List<Producto> productoCliente = c.getProductosEnCarro();
		for (Producto p : productoCliente) {
			int stockActual = mercado.obtenerStock(p);
			if (stockActual == 0) {
				System.out.println("Producto registrado y stock actualizado: " + p.getNombre());
			} else {
				this.montoTotal += p.calcularPrecioFinal();
				mercado.actualizarStock(p, stockActual - 1);
			}
		}
	}
	
	public double getMontoTotal() {
		return this.montoTotal;
	}
	
	

}
