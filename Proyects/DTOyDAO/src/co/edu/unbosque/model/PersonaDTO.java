package co.edu.unbosque.model;
/**
 * Clase donde crearemos a una nueva persona
 * @author Esteban Mejia
 *
 */
public class PersonaDTO {
	/**
	 * Crearemos las variables que llevara nuestra persona
	 */
	private String nombre,fecha_nacimiento;
	/**
	 * Crearemos la edad que llevara nuestra persona
	 */
	private int edad;
	/**
	 * Crearemos la altura que llevara nuestra persona
	 */
	private float altura;
	/**
	 * Constructor vacio
	 */
	public PersonaDTO() {
	}
	/**
	 * Constructor donde inicializaremos las variables
	 * @param nombre sera el nombre de la persona
	 * @param edad  sera la edad de la persona
	 * @param fecha_nacimiento sera la fecha denacimiento de la persona
	 * @param altura sera la altura denacimiento de la persona
	 */
	public PersonaDTO(String nombre, int edad, String fecha_nacimiento, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.altura = altura;
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
	 * @return the fecha_nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
