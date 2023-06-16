package co.edu.unbosque.model;
/**
 * Clase de tipo DTO que establece los atributos de un aspirante
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class CandidateDTO extends PersonDTO{
	/**
	 * Carrera a la que se aspira
	 */
	private String career;
	/**
	 * Metodo constructor vacio
	 */
	public CandidateDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor
	 * @param career es la carrera
	 */
	public CandidateDTO(String career) {
		this.career = career;
	}

	/**
	 * Metodo constructor que se trae de la clase super
	* @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param career es la carrera
	 */
	public CandidateDTO(String name, int age, String food, String color, String career) {
		super(name, age, food, color);
		this.career = career;
	}

	/**
	 * @return the career
	 */
	public String getCareer() {
		return career;
	}

	/**
	 * @param career the career to set
	 */
	public void setCareer(String career) {
		this.career = career;
	}
	/**
	 * Metodo que devuelve los datos organizados en el archivo
	 */
	@Override
	public String toString() {
		return this.getName()+","+this.getAge()+","+this.getFood()+","+this.getColor()+","+this.getCareer();
	}



}
