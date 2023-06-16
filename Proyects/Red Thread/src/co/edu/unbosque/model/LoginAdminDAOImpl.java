package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * Implementacion del DAO de login
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class LoginAdminDAOImpl implements LoginDAO{
	/**
	 * Lista de logins
	 */
	private ArrayList<LoginDTO> logins_admins;
	
	/**
	 * Constructor
	 */
	public LoginAdminDAOImpl() {
		super();
		logins_admins = new ArrayList<>();
	}

	@Override
	public int logIn(String name, String password) {
		for (int i = 0; i < logins_admins.size(); i++) {
			if(logins_admins.get(i).getAlias().equals(name) && logins_admins.get(i).getPassword().equals(password)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String securityQuestion(String username) {
		String cont = "";
		for (LoginDTO log : logins_admins) {
			if (log.getAlias().equals(username)) {
				cont = log.getPassword();
			}
		}
		return cont;
	}

	/**
	 * @return the logins_admins
	 */
	public ArrayList<LoginDTO> getLogins_admins() {
		return logins_admins;
	}

	/**
	 * @param logins_admins the logins_admins to set
	 */
	public void setLogins_admins(ArrayList<LoginDTO> logins_admins) {
		this.logins_admins = logins_admins;
	}

	
}
