package co.edu.unbosque.model;
/**
 * Aca crearemos a nuestros Perros
 * @author Esteban Mejia
 *
 */
public class Perro {
	private int edad;
	private String nombre;
	private String raza;
	/**
	 * Este sera nuestro metodo constructor de la clase Perro
	 * @param edad  sera la edad del perro
	 * @param nombre sera el nombre del perro
	 * @param raza sera la raza del perro
	 */
	public Perro(int edad, String nombre, String raza) {
		this.edad = edad;
		this.nombre = nombre;
		this.raza = raza;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	
}
