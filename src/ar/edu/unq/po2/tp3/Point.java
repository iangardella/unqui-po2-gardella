package ar.edu.unq.po2.tp3;

public class Point {
	private int x ;
	private int y ;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	
	public void setX(int n) {
		this.x = n;
	}
	
	public void setY(int n) {
		this.y = n;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void moverPunto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point sumaDeDosPutnos(Point a, Point b) {
		int x = a.getX() + b.getX();
		int y = a.getY() + b.getY();
		return new Point(x, y);
	}
}