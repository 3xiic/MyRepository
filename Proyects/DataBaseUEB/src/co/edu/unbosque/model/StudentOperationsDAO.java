package co.edu.unbosque.model;
/**
 * Implementa los métodos propios de las clases que los utilicen
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public interface StudentOperationsDAO {
	/**
	 * Metodo para eliminar
	 * @param name es el nombre
	 * @param failed_class es las materias perdidas
	 */
	public abstract void deleteStudent(String name,int failed_class);
	/**
	 * Metodo de actualizar
	 * @param name es el nombre
	 * @param newAge es la nueva edad
	 * @param nfood es la nueva comida
	 * @param ncolor es el nuevo color
	 * @param nfailed_class es el nuevo materias perdidas
	 */
	public abstract void updateStudent(String name,int newAge, String nfood, String ncolor,int nfailed_class);

}
