package ar.edu.unq.po2.tp5;

import java.util.Objects;

abstract class Producto {
    protected String nombre;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Método abstracto para calcular el precio final del producto
    public abstract double calcularPrecioFinal();
    
    @Override 
    public boolean equals(Object o) {
    	if (this == o) return true;
    	if (o == null || getClass() != o.getClass())return false;
    	Producto producto = (Producto) o;
    	return Objects.equals(nombre, producto.nombre);
    }
    
    @Override 
    public int hashCode() {
    	return Objects.hash(nombre);
    }
}
