package ar.edu.unq.po2.tp3;

public class Multiplo {
	public int mayorMultiploComun(int x , int y) {
		// En este caso es por si los numeros x o y son 0
		if (x <= 0 || y <= 0) {
			return -1;
		}
		// Empieza la busqueda del mmc 
		for (int n = 1000; n >= 0; n--) {
			if (n % x == 0 && n % y == 0) {
				return n;
			}
		}
		return -1;
	}
}
