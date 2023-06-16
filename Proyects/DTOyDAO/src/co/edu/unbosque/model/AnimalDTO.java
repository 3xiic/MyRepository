package co.edu.unbosque.model;
/**
 * La clase donde crearemos a nuestro animal
 * @author Esteban Mejia
 *
 */
public class AnimalDTO {

	/**
	 * Las variables que llevara nuestro animal
	 */
	private String nombre, habitad,alimentacion;
	/**
	 * El nivel de extincion que llevara nuestro animal
	 */
	private int nivel_extincion;
	/**
	 * Metodo constructor vacio
	 */
	public AnimalDTO() {
	}
	/**
	 * Constructor donde inicializaremos las variables
	 * @param nombre sera el nombre del animal
	 * @param habitad sera el habitad del animal
	 * @param alimentacion sera la alimentacion del animal
	 * @param nivel_extincion sera el nivel de extincion del animal
	 */
	public AnimalDTO(String nombre, String habitad, String alimentacion, int nivel_extincion) {
		super();
		this.nombre = nombre;
		this.habitad = habitad;
		this.alimentacion = alimentacion;
		this.nivel_extincion = nivel_extincion;
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
	 * @return the habitad
	 */
	public String getHabitad() {
		return habitad;
	}
	/**
	 * @param habitad the habitad to set
	 */
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	/**
	 * @return the alimentacion
	 */
	public String getAlimentacion() {
		return alimentacion;
	}
	/**
	 * @param alimentacion the alimentacion to set
	 */
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	/**
	 * @return the nivel_extincion
	 */
	public int getNivel_extincion() {
		return nivel_extincion;
	}
	/**
	 * @param nivel_extincion the nivel_extincion to set
	 */
	public void setNivel_extincion(int nivel_extincion) {
		this.nivel_extincion = nivel_extincion;
	}

}
