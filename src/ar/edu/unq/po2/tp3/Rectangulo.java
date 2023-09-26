package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
	private int ancho;
	private int altura;
	
	public Rectangulo(Point esquinaSuperiorIzquierda, int ancho, int altura) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.ancho = ancho;
		this.altura = altura;
	}
	
	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int calcularArea() {
		return  ancho * altura;
	}
	
	public int calculadorPerimetro() {
		return 2 *(ancho + altura);
	}
	
	public boolean esHorizontal() {
		return ancho > altura;
	}
	
	public boolean esVertical() {
		return !esHorizontal();
	}
}
