package co.edu.unbosque.model;

/**
 * Interfaz del DAO de administrador
 * @author Andres Espitia
 * @author Diego Forero
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public interface AdminDAO {
	/**
	 * Metodo para crear un administrador
	 * @param username
	 * @param password
	 */
	public abstract void createAdmin(String username, String password);
	/**
	 * Metodo para mostrar informacion de un usuario
	 * @param username
	 * @return informacion de usuario
	 */
	public abstract String showUserInfo(String username);
	/**
	 * Metodo para eliminar un usuario
	 * @param username
	 * @return eliminar el usuario
	 */
	public abstract boolean deleteUser(String username);
	/**
	 * Metodo para mostrar los usuarios
	 * @return todos los usuarios
	 */
	public abstract String showUsers();
	/**
	 * Metodo para mostrar usuarios por nombre
	 * @return matriz estilo tabla de los usuarios por nombre
	 */
	public abstract String[][] showUsersByName();
	/**
	 * Metodo para mostrar usuarios por apellido
	 * @return matriz estilo tabla de los usuarios por apellido
	 */
	public abstract String[][] showUsersByLastName();
	/**
	 * Metodo para mostrar usuarios por edad
	 * @return matriz estilo tabla de los usuarios por edad
	 */
	public abstract String[][] showUsersByAge();
	/**
	 * Metodo para mostrar usuarios por alias
	 * @return matriz estilo tabla de los usuarios por alias
	 */
	public abstract String[][] showUsersByAlias();
	/**
	 * Metodo que devuelve las 10 personas con mas likes
	 * @return matriz estilo tabla de los primeros 10 usuarios
	 */
	public abstract String[][] topTen();
	/**
	 * Metodo para mostrar usuarios por ingresos mensuales
	 * @return matriz estilo tabla de los usuarios por ingresos
	 */
	public abstract String[][] showByEarnings();
	/**
	 * Metodo para mostrar solo hombres
	 * @return matriz estilo tabla de los usuarios hombres
	 */
	public abstract String[][] showMen();
	/**
	 * Metodo para mostrar solo mujeres
	 * @return matriz estilo tabla de los usuarios mujeres
	 */
	public abstract String[][] showWomen();
	/**
	 * Metodo para generar pdf
	 * @return pdf
	 */
	public abstract String generatePDF();	
}
