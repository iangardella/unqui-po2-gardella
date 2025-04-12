package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	Punto ubicacion;
	float base;
	float altura;
	
	public Rectangulo(Punto ubicacion, float base, float altura) {
		this.ubicacion = ubicacion;
		this.base = base; 
		this.altura = altura;
	}
	
	public float obtenereArea() {
		return base * altura;
	}
	
	public float obtenerPerimetro() {
		return 2 * (base + altura );
	}
	
	public String determinarOrientacion() {
		if (base > altura) {
			return "Horizontal";
		} else if (altura > base) {
			return "Vertical";
		} else {
			return "Cuadrado";
		}
	}
	
	
}
