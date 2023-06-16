package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;

/**
 * Clase DAO para el login de admins
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class LoginDAOImpl implements LoginDAO{
	private ArrayList<LoginDTO> logins;
	
	/**
	 * 
	 */
	public LoginDAOImpl() {
		super();
		logins = new ArrayList<>();
//		loadData();
		loadSerializable();
	}
	
	/**
	 * Metodo para cargar los datos
	 */
	public void loadData() {
		String content = FileHandler.loadFile("datos.csv");
		String rows[]= content.split("\n");
		for (String r : rows) {
			String columns[]= r.split(";");
			logins.add(new LoginDTO(columns[5],columns[18],"Country of residence", columns[7]));
		}
		FileHandler.writeSerializable(logins, "YHLQMDLG.uebfa");
	}
	
	/**
	 * Metodo para cargar el archivo serializado
	 */
	public void loadSerializable() {
		logins = (ArrayList<LoginDTO>) FileHandler.readSerializable("YHLQMDLG.uebfa");
	}
	
	/**
	 * Metodo para cambiar los datos
	 * @param username
	 * @param password
	 * @param country
	 */
	public void updateData(String username, String password, String country) {
		logins.add(new LoginDTO(username, password,"Country of residence", country));
		FileHandler.writeSerializable(logins, "YHLQMDLG.uebfa");
	}

	@Override
	public int logIn(String name, String password) {
		//Size erroneo
		for (int i = 0; i < logins.size(); i++) {
			if(logins.get(i).getAlias().equals(name) && logins.get(i).getPassword().equals(password)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String securityQuestion(String username) {
		String cont = "";
		for (LoginDTO log : logins) {
			if (log.getAlias().equals(username)) {
				cont = log.getPassword();
			}
		}
		return cont;
	}

	/**
	 * @return the logins
	 */
	public ArrayList<LoginDTO> getLogins() {
		return logins;
	}

	/**
	 * @param logins the logins to set
	 */
	public void setLogins(ArrayList<LoginDTO> logins) {
		this.logins = logins;
	}
}
