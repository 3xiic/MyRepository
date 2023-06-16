package co.edu.unbosque.model;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import com.itextpdf.text.DocumentException;

import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.util.AgeSort;
import co.edu.unbosque.util.AliasSort;
import co.edu.unbosque.util.GenerateReports;
import co.edu.unbosque.util.IncomesSort;
import co.edu.unbosque.util.LastNameSort;
import co.edu.unbosque.util.LikesSort;
import co.edu.unbosque.util.NameSort;

/**
 * Implementacion del DAO de administrador
 * @author Andres Espitia
 * @author Diego Forero
 * @author Esteban Mejia
 * @author Camilo Uribe
 *
 */
public class AdminDAOImpl implements AdminDAO{
	/**
	 * Lista de administradores
	 */
	private ArrayList<AdminDTO> admins;
	/**
	 * Usuario
	 */
	private UserDAOImpl user;
	private ArrayList<UserDTO> aux_users;
	
	/**
	 * Constructor
	 */
	public AdminDAOImpl() {
		admins = (ArrayList<AdminDTO>) FileHandler.readSerializable("Admins.uebfa");
		user = new UserDAOImpl();
		aux_users = user.getUsers(); 
	}

	@Override
	public void createAdmin(String username, String password) {
		admins.add(new AdminDTO(username, password));
		FileHandler.writeSerializable(admins, "Admins.uebfa");
	}

	@Override
	public String showUserInfo(String username) {
		String cont = "";
		for (int i = 0; i < user.getUsers().size(); i++) {
			if (username.equals(user.getUsers().get(i).getAlias())) {
				cont = user.getUsers().get(i).toString();
			}
		}
		return cont;
	}

	@Override
	public boolean deleteUser(String username) {
		for (int i = 0; i < user.getUsers().size(); i++) {
			if (username.equals(user.getUsers().get(i).getAlias())) {
				File dir = new File("src/co/edu/unbosque/util/media/usersImgs/"+user.getUsers().get(i).getAlias());
				File[] ficheros = dir.listFiles();
				for (int j = 0; j < ficheros.length; j++) {
					ficheros[j].delete();
				}
				dir.delete();
				user.getUsers().remove(i);
				FileHandler.writeSerializable(user.getUsers(), "Usuarios.uebfa");
				return true;
			}
		}
		return false;
	}

	@Override
	public String showUsers() {
		String content = "";
		for (UserDTO us : user.getUsers()) {
			if(us instanceof UserManDTO) {
				UserManDTO aux = (UserManDTO) us;
				content+=aux.toString()+"\n";
			}else if(us instanceof UserWomanDTO) {
				UserWomanDTO aux = (UserWomanDTO) us;
				content+=aux.toString()+"\n";
			}
		}
		return content;
	}

	@Override
	public String[][] showUsersByName() {
		aux_users = NameSort.sort(aux_users, 0, aux_users.size()-1);
		String[][] matrix = new String[aux_users.size()][6];
		for (int i = 0; i < aux_users.size(); i++) {
			matrix[i][0] = aux_users.get(i).getName();
			matrix[i][1] = aux_users.get(i).getLastname1();
			matrix[i][2] = aux_users.get(i).getAlias();
			matrix[i][3] = aux_users.get(i).getAge()+"";
			if (aux_users.get(i).isGender()) {						
				matrix[i][4] = "Male";
			} else {
				matrix[i][4] = "Female";
			}
			matrix[i][5] = aux_users.get(i).getOrientation();
		}
		return matrix;
	}

	@Override
	public String[][] showUsersByLastName() {
		aux_users = LastNameSort.sort(aux_users, 0, aux_users.size()-1);
		String[][] matrix = new String[aux_users.size()][6];
		for (int i = 0; i < aux_users.size(); i++) {
			matrix[i][0] = aux_users.get(i).getLastname1();
			matrix[i][1] = aux_users.get(i).getName();
			matrix[i][2] = aux_users.get(i).getAlias();
			matrix[i][3] = aux_users.get(i).getAge()+"";
			if (aux_users.get(i).isGender()) {						
				matrix[i][4] = "Male";
			} else {
				matrix[i][4] = "Female";
			}
			matrix[i][5] = aux_users.get(i).getOrientation();
		}
		return matrix;
	}

	@Override
	public String[][] showUsersByAge() {
		aux_users = AgeSort.sort(aux_users, 0, aux_users.size()-1);
		String[][] matrix = new String[aux_users.size()][6];
		for (int i = 0; i < aux_users.size(); i++) {
			matrix[i][0] = aux_users.get(i).getName();
			matrix[i][1] = aux_users.get(i).getLastname1();
			matrix[i][2] = aux_users.get(i).getAlias();
			matrix[i][3] = aux_users.get(i).getAge()+"";
			if (aux_users.get(i).isGender()) {						
				matrix[i][4] = "Male";
			} else {
				matrix[i][4] = "Female";
			}
			matrix[i][5] = aux_users.get(i).getOrientation();
		}
		return matrix;
	}

	@Override
	public String[][] showUsersByAlias() {
		aux_users = AliasSort.sort(aux_users, 0, aux_users.size()-1);
		String[][] matrix = new String[aux_users.size()][6];
		for (int i = 0; i < aux_users.size(); i++) {
			matrix[i][0] = aux_users.get(i).getAlias();
			matrix[i][1] = aux_users.get(i).getName();
			matrix[i][2] = aux_users.get(i).getLastname1();
			matrix[i][3] = aux_users.get(i).getAge()+"";
			if (aux_users.get(i).isGender()) {						
				matrix[i][4] = "Male";
			} else {
				matrix[i][4] = "Female";
			}
			matrix[i][5] = aux_users.get(i).getOrientation();
		}
		return matrix;
	}

	@Override
	public String[][] topTen() {
		Collections.sort(aux_users, new LikesSort());
		String[][] matrix = new String[10][6];
		for (int i = 0; i < 10; i++) {
			matrix[i][0] = (i+1)+"";
			matrix[i][1] = aux_users.get(i).getName();
			matrix[i][2] = aux_users.get(i).getAge()+"";
			matrix[i][3] = aux_users.get(i).getLikes()+"";
			if (aux_users.get(i).isGender()) {						
				matrix[i][4] = "Male";
			} else {
				matrix[i][4] = "Female";
			}
			matrix[i][5] = aux_users.get(i).getOrientation();
		}
		return matrix;
	}

	@Override
	public String[][] showByEarnings() {
		ArrayList<UserManDTO> auxmen = new ArrayList<>();
		for (UserDTO us : aux_users) {
			if (us instanceof UserManDTO) {
				auxmen.add((UserManDTO) us);
			}
		}
		auxmen = IncomesSort.sort(auxmen, 0, auxmen.size()-1);
		String[][] matrix = new String[auxmen.size()][6];
		for (int i = 0; i < auxmen.size(); i++) {
			matrix[i][0] = auxmen.get(i).getName();
			matrix[i][1] = auxmen.get(i).getLastname1();
			matrix[i][2] = auxmen.get(i).getAlias();
			matrix[i][3] = auxmen.get(i).getAge()+"";
			matrix[i][4] = "$"+auxmen.get(i).getIncomes();
		}
		return matrix;
	}

	@Override
	public String[][] showMen() {
		ArrayList<UserManDTO> auxmen = new ArrayList<>();
		for (UserDTO us : aux_users) {
			if (us instanceof UserManDTO) {
				auxmen.add((UserManDTO) us);
			}
		}
		String[][] matrix = new String[auxmen.size()][6];
		for (int i = 0; i < auxmen.size(); i++) {
			matrix[i][0] = auxmen.get(i).getName();
			matrix[i][1] = auxmen.get(i).getLastname1();
			matrix[i][2] = auxmen.get(i).getAlias();
			matrix[i][3] = auxmen.get(i).getAge()+"";
		}
		return matrix;
	}

	@Override
	public String[][] showWomen() {
		ArrayList<UserWomanDTO> auxwomen = new ArrayList<>();
		for (UserDTO us : aux_users) {
			if (us instanceof UserWomanDTO) {
				auxwomen.add((UserWomanDTO) us);
			}
		}
		String[][] matrix = new String[auxwomen.size()][6];
		for (int i = 0; i < auxwomen.size(); i++) {
			matrix[i][0] = auxwomen.get(i).getName();
			matrix[i][1] = auxwomen.get(i).getLastname1();
			matrix[i][2] = auxwomen.get(i).getAlias();
			matrix[i][3] = auxwomen.get(i).getAge()+"";
		}
		return matrix;
	}

	@Override
	public String generatePDF() {
		LocalDateTime datetime = LocalDateTime.now();
		File file = FileHandler.createReport(((datetime+"").split("T")[0])+".pdf");
		aux_users = NameSort.sort(aux_users, 0, aux_users.size()-1);
		try {
			if (GenerateReports.generatePdf(file, aux_users)) {
				return "Your PDF file has been generated!(¡Se ha generado tu hoja PDF!)";
			} else {
				return "The file not exists (Se ha producido un error al generar un documento)";
			}
		} catch (DocumentException e1) {
			e1.printStackTrace();
			return "The file not exists (Se ha producido un error al generar un documento)";
		}
	}

	/**
	 * @return the admins
	 */
	public ArrayList<AdminDTO> getAdmins() {
		return admins;
	}

	/**
	 * @param admins the admins to set
	 */
	public void setAdmins(ArrayList<AdminDTO> admins) {
		this.admins = admins;
	}

	
}
