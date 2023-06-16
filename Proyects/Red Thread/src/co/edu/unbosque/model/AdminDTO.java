package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase DTO principal para iniciar sesion
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class AdminDTO  implements Serializable{
	/**
	 * Usuario
	 */
	private String username;
	/**
	 * Contraseña
	 */
	private String password;
	
	/**
	 * Constructor
	 */
	public AdminDTO(){
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param password
	 */
	public AdminDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
