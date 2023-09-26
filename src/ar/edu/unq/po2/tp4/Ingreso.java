package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mes;
	private String concepto;
	private double monto;
	
	public Ingreso(String mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto; 
		this.monto = monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
	
	public double getMontoPercibido() {
		return monto;
	}
}

