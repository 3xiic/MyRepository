package co.edu.unbosque.model;
/**
 * Clase de tipo DTO que establece los atributos del administrativo
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class AdministrativeDTO extends PersonDTO{
	/**
	 * El cargo que ocupa el administrativo
	 */
	private String position;
	/**
	 * Metodo constructor vacio
	 */
	public AdministrativeDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor
	 * @param position es el cargo
	 */
	public AdministrativeDTO(String position) {
		this.position = position;
	}

	/**
	 * Metodo constructor que se trae de la clase super
	* @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param position es el cargo
	 */
	public AdministrativeDTO(String name, int age, String food, String color, String position) {
		super(name, age, food, color);
		this.position = position;
	}
	

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * Metodo que devuelve los datos organizados en el archivo
	 */
	@Override
	public String toString() {
		return this.getName()+","+this.getAge()+","+this.getFood()+","+this.getColor()+","+this.getPosition();
	}
	

}
