package co.edu.unbosque.model;
/**
 * Clase de tipo DTO que establece los atributos de la clase persona
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class PersonDTO {
	/**
	 * Nombre de la persona
	 */
	private String name;
	/**
	 * Edad de la persona
	 */
	private int age;
	/**
	 * Comida favorita de la persona
	 */
	private String food;
	/**
	 * Color favorito de la persona
	 */
	private String color;
	/**
	 * Metodo constructor vacio
	 */
	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metodo constructor super
	 * @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 */
	public PersonDTO(String name, int age, String food, String color) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
		this.color = color;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}
	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Metodo que devuelve los datos organizados en el archivo
	 */
	@Override
	public String toString() {
		return this.name+","+this.age+","+this.food+","+this.color;
		
	}
	
	
}
