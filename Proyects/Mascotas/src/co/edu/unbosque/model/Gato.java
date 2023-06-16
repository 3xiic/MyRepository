package co.edu.unbosque.model;
/**
 * En esta Clase crearemos a nuestros gatos
 * @author Esteban Mejia
 *
 */
public class Gato {
	private int edad;
	private String nombre;
	private String raza;
	/**
	 * Este sera nuestro metodo constructor de la clase Gato
	 * @param edad Sera la edad del gato
	 * @param nombre sera el nombre del gato
	 * @param raza sera la raza del gato
	 */
	public Gato(int edad, String nombre, String raza) {
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
