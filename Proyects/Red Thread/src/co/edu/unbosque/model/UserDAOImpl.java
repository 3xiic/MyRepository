package co.edu.unbosque.model;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import co.edu.unbosque.model.persistence.FileHandler;

/**
 * Implementacion del DAO de usuario
 * 
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class UserDAOImpl implements UserDAO {
	/**
	 * Lista de usuarios
	 */
	private ArrayList<UserDTO> users;
	/**
	 * La fecha de nacimiento
	 */
	private Date birth;
	/**
	 * Formato de la fecha
	 */
	private SimpleDateFormat format;
	/**
	 * Recomendaciones segun orientacion
	 */
	private OrientationDAO orientation;
	/**
	 * DAO de los logins
	 */
	private LoginDAOImpl logins;

	/**
	 * Constructor
	 */
	public UserDAOImpl() {
		users = new ArrayList<>();
//		loadData();
		loadSerializable();
		orientation = new OrientationDAO();
		logins = new LoginDAOImpl();
	}
	/**
	 * Metodo para cargar el archivo serializado
	 */
	public void loadSerializable() {
		users = (ArrayList<UserDTO>) FileHandler.readSerializable("Usuarios.uebfa");
	}
	/**
	 * Metodo para cargar los datos del archivo .csv
	 */
	public void loadData() {
		String content = FileHandler.loadFile("datos.csv");
		String rows[]= content.split("\n");
		boolean gender=true;
		boolean status=true;
		boolean divorce=true;
		format = new SimpleDateFormat("dd/MM/yyyy"); 
		for (String r : rows) {
			String columns[]= r.split(";");
			if(columns[15].equals("Inactivo")) {
				status=false;
			}else {
				status=true;
			}
			if(columns[4].equals("H")) {
				gender=true;
			}else if(columns[4].equals("M")) {
				gender=false;
			}
			try {
				birth= format.parse(columns[9]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			ArrayList<String> urls = new ArrayList<>();
			if(gender) {
				urls.add("src/co/edu/unbosque/util/media/usersImgs/man.png");
				users.add(new UserManDTO(columns[1], columns[2], columns[3], columns[5], columns[17], columns[8], gender, birth, Integer.parseInt(columns[10]), "Hola, me llamo "+columns[1]+ " y \nmi edad es "+Integer.parseInt(columns[10]), urls, Integer.parseInt(columns[13]), Integer.parseInt(columns[14]), status, Integer.parseInt(columns[15]), columns[6], columns[7], columns[8], Float.parseFloat(columns[11].replace(",", "."))));
			}else {
				if(columns[12].equals("SI")) {
					divorce=true;
				}else if(columns[12].equals("NO")) {
					divorce=false;
				}
				urls.add("src/co/edu/unbosque/util/media/usersImgs/woman.png");
				users.add(new UserWomanDTO(columns[1], columns[2], columns[3], columns[5], columns[17], columns[8], gender, birth, Integer.parseInt(columns[10]), "Hola, me llamo "+columns[1]+ " y \nmi edad es "+Integer.parseInt(columns[10]), urls, Integer.parseInt(columns[13]), Integer.parseInt(columns[14]), status, Integer.parseInt(columns[15]), columns[6], columns[7], columns[8],divorce));
			}
		}
		for (int i = 0; i < users.size(); i++) {
			for (int j = 0; j < users.get(i).getMatches(); j++) {
				int s = (int)Math.floor(Math.random()*466);
				if (!users.get(s).isGender() && users.get(i).isGender()) {					
					users.get(i).getMatches_persons().add(s);
				} else if (users.get(s).isGender() && !users.get(i).isGender()) {
					users.get(i).getMatches_persons().add(s);
				} else {
					j--;
				}
			}
		}
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
	}

	@Override
	public void createUser(UserDTO u, String password) {
		users.add(u);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		logins.updateData(u.getAlias(), "s", null);
	}

	@Override
	public boolean updateUserAlias(int index, String new_alias) {
		users.get(index).setAlias(new_alias);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserOrigin(int index, String new_origin) {
		users.get(index).setOrigin(new_origin);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return false;
	}
	
	@Override
	public boolean updateUserEmail(int index, String new_email) {
		users.get(index).setEmail(new_email);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;
	}

	@Override
	public boolean updateUserResidence(int index, String new_residence) {
		users.get(index).setResidence(new_residence);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}

	@Override
	public boolean updateUserContact(int index, String new_contact) {
		users.get(index).setContact(new_contact);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}
	
	@Override
	public boolean updateUserOrientation(int index, String new_orientation) {
		users.get(index).setOrientation(new_orientation);
		FileHandler.writeSerializable(users, "Usuarios.uebfa");
		return true;

	}
	
	@Override
	public ArrayList<UserDTO> showCompatibles(int index) {
		ArrayList<UserDTO> aux = new ArrayList<UserDTO>();
		String orientationaux = users.get(index).getOrientation();
		int indx = 0;
		for (int j = 0; j < OrientationDAO.orientations.size(); j++) {
			if (OrientationDAO.orientations.get(j).getOrientation().equals(orientationaux) && OrientationDAO.orientations.get(j).isGender() == users.get(index).isGender()) {
				indx = j;
				break;
			}
		}
		for (int j = 0; j < users.size(); j++) {
			if(index == j) continue;
			String suf = "";
			if (users.get(j).isGender()) {
				suf = "H";
			} else if (!users.get(j).isGender()) {
				suf = "M";
			}

			for (int k = 0; k < OrientationDAO.orientations.get(indx).getCompatible().size(); k++) {
				if ((users.get(j).getOrientation() + suf).equals(OrientationDAO.orientations.get(indx).getCompatible().get(k))) {
					aux.add(users.get(j));
				}
			}
		}

		return aux;
	}
	
	@Override
	public boolean userExist(String username) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getAlias().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return the users
	 */
	public ArrayList<UserDTO> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(ArrayList<UserDTO> users) {
		this.users = users;
	}

}
