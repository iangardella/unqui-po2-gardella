package ar.edu.unq.po2.tp4;

public class IngresoPorHoras extends Ingreso{
	private int horasExtras;
	
	public IngresoPorHoras(String mes, int horasExtras, int monto) {
		super(mes, "Horas Extras", monto);
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double getMontoPercibido() {
		return horasExtras * 10.0;
	}
	
}
