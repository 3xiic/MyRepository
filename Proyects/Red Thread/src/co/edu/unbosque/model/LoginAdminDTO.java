package co.edu.unbosque.model;

/**
 * Clase DTO principal de Login
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class LoginAdminDTO extends LoginDTO {

	/**
	 * Constructor
	 */
	public LoginAdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alias
	 * @param password
	 * @param security_question
	 * @param security_answer
	 */
	public LoginAdminDTO(String alias, String password, String security_question, String security_answer) {
		super(alias, password, security_question, security_answer);
		// TODO Auto-generated constructor stub
	}
	
}
