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
public class LoginDTO implements Serializable{
	/**
	 * Nombre de usuario al iniciar sesion
	 */
	private String alias;
	/**
	 * Contraseña del usuario
	 */
	private String password;
	/**
	 * Pregunta de seguridad para cambiar la contraseña
	 */
	private String security_question;
	/**
	 * Respuesta de seguridad
	 */
	private String security_answer;



	/**
	 * Constructor
	 */
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alias alias
	 * @param password contrasena
	 * @param security_question pregunta
	 * @param security_answer respuesta
	 */
	public LoginDTO(String alias, String password, String security_question, String security_answer) {
		super();
		this.alias = alias;
		this.password = password;
		this.security_question = security_question;
		this.security_answer = security_answer;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
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
	/**
	 * @return the security_question
	 */
	public String getSecurity_question() {
		return security_question;
	}
	/**
	 * @param security_question the security_question to set
	 */
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	/**
	 * @return the security_answer
	 */
	public String getSecurity_answer() {
		return security_answer;
	}
	/**
	 * @param security_answer the security_answer to set
	 */
	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}
}	
