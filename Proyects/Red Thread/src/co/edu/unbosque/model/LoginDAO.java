package co.edu.unbosque.model;

/**
 * DAO de login
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public interface LoginDAO {
	/**
	 * Metodo para iniciar sesion
	 * @param name
	 * @param password
	 * @return index de usuario
	 */
	public abstract int logIn(String name, String password);
	/**
	 * Metodo para la pregunta de seguridad y cambiar la contraseña
	 * @param username usuario
	 * @return pregunta respondida exitosamente
	 */
	public abstract String securityQuestion(String username);
}
