package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Rectangulo cuerpo;
	
	public Cuadrado(Point esquinaSuperiorIzquierda, int ancho) {
		this.cuerpo = new Rectangulo(esquinaSuperiorIzquierda, ancho, ancho);
	}
	
	public Point getEsquinaSuperiorIzquierda() {
		return cuerpo.getEsquinaSuperiorIzquierda();
	}
	
	public int getAncho() {
		return cuerpo.getAncho();
	}
	
	public int getAltura() {
		return cuerpo.getAltura();
	}
	
	public int calcularArea() {
		return this.getAncho() * this.getAltura();
	}
	
	public int calculadorPerimetro() {
		return cuerpo.calculadorPerimetro();
	}
	
}
