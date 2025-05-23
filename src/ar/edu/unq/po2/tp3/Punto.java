package ar.edu.unq.po2.tp3;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto() {
		this.setX(0);
		this.setY(0);
	}
	
	
	public Punto(float x, float y) {
		this.setXY(x, y);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void moverPunto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto sumaDePuntos(Punto p1, Punto p2) {
		float newX = p1.getX() + p2.getX();
		float newY = p1.getY() + p2.getY();
		
		Punto puntoNuevo = new Punto(newX, newY);
		return puntoNuevo;
 	}
	
}
