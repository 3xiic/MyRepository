package co.edu.unbosque.model;
/**
 * Clase de tipo DTO que establece los atributos de un estudiante de segundo semestre
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class SecondSemesterStudentsDTO extends PersonDTO{
	/**
	 * Clase que ha perdido
	 */
	private int failed_class;
	/**
	 * Metodo constructor vacio
	 */
	public SecondSemesterStudentsDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metodo constructor
	 * @param failed_class el numero de materias perdidas
	 */
	public SecondSemesterStudentsDTO(int failed_class) {
		this.failed_class = failed_class;
	}

	/**
	 * Metodo constructor que se trae de la clase super
	 * @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param failed_class es el numero de materias perdidas
	 */
	public SecondSemesterStudentsDTO(String name, int age, String food, String color, int failed_class) {
		super(name, age, food, color);
		this.failed_class = failed_class;
	}

	/**
	 * @return the failed_class
	 */
	public int getFailed_class() {
		return failed_class;
	}

	/**
	 * @param failed_class the failed_class to set
	 */
	public void setFailed_class(int failed_class) {
		this.failed_class = failed_class;
	}
	/**
	 * Metodo que devuelve los datos organizados en el archivo
	 */
	@Override
	public String toString() {
		return this.getName()+","+this.getAge()+","+this.getFood()+","+this.getColor()+","+this.getFailed_class();
		
	}
	
	
	
	

}
