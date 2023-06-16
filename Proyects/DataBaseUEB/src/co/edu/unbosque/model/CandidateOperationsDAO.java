package co.edu.unbosque.model;
/**
 * Implementa los métodos propios de las clases que los utilicen
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public interface CandidateOperationsDAO {
	/**
	 * metodo para eliminar
	 * @param name es el nombre 
	 * @param carrier es la carrera
	 */
	public abstract void deleteCandidate(String name,String carrier);
	/**
	 * Metodo de actualizar
	 * @param name es el nombre
	 * @param newAge es la nueva edad
	 * @param nfood es la nueva comida
	 * @param ncolor es el nuevo color
	 * @param ncarrier es la nueva carrera
	 */
	public abstract void updateCandidate(String name,int newAge, String nfood, String ncolor,String ncarrier);
}
