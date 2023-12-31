package co.edu.unbosque.modelo;

import java.io.Serializable;

public class ProductoDTO  implements Serializable{
	
	private String nombre;
	private double precio;
	
	public ProductoDTO() {
		
	}

	public ProductoDTO(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		
		return this.nombre+" "+this.precio;
	}

}
