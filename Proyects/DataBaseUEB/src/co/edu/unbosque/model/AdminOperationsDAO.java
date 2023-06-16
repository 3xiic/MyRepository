package co.edu.unbosque.model;
/**
 * Implementa los métodos propios de las clases que los utilicen
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public interface AdminOperationsDAO {
	/**
	 * Es el metodo de eliminar admin
	 * @param name es el nombre
	 * @param position es el cargo
	 */
	public abstract void deleteAdmin(String name,String position);
	/**
	 * Metodo de actualizar
	 * @param name es el nombre
	 * @param newAge es la nueva edad
	 * @param nfood es la nueva comida
	 * @param ncolor es el nuevo color
	 * @param nposition es el nuevo cargo
	 */
	public abstract void updateAdmin(String name,int newAge, String nfood, String ncolor,String nposition);
}
