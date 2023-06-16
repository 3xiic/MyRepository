package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.FileHandler;
/**
 * Clase que contiene los métodos propios para el administrativo
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class AdministrativeDAO implements AdminOperationsDAO {
	/**
	 * Arreglo de administrativos
	 */
	private ArrayList<AdministrativeDTO> list;
	/**
	 * Clase que escribe y guarda los datos en archivos
	 */
	private FileHandler fh;
	/**
	 * Metodo constructor
	 */
	public AdministrativeDAO() {
		list = new ArrayList<>();
		fh = new FileHandler("admin.prog1");
	}
	/**
	 * Método para cargar los datos que se ingresan y organiza los datos en el archivo
	 */
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new AdministrativeDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3],columns[4]));
		}
	}
	/**
	 * Método para agregar administrativos al archivo de datos que recibe los datos del mismo 
	* @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param position es el cargo
	 */
	public void addAdmin(String name, int age, String food, String color, String position) {
		list.add(new AdministrativeDTO(name, age, food, color, position));
		fh.write(writeData(list));
	}
	/**
	 * Método para borrar un administrador del archivo de datos
	 */
	@Override
	public void deleteAdmin(String name, String position) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.remove(i);
				fh.write(writeData(list));
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el administrativo",null,JOptionPane.ERROR_MESSAGE);
			}	
		}
	}
	/**
	 * Metodo para actualizar al administrador en el archivo de datos
	 */
	@Override
	public void updateAdmin(String name, int newAge, String nfood, String ncolor, String nposition) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.get(i).setAge(newAge);
				list.get(i).setFood(nfood);
				list.get(i).setColor(ncolor);
				list.get(i).setPosition(nposition);
				fh.write(writeData(list));
				
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el administrativo",null,JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	/**
	 * Método que escribe los datos
	 * @param list es la lista de admin
	 * @return retorna la lista
	 */
	public String writeData(ArrayList<AdministrativeDTO> list) {
		String content = "";
		for (AdministrativeDTO p : list) {
			content+=p.toString()+"\n";
			
		}
		return content;
	}

	/**
	 * @return the list
	 */
	public ArrayList<AdministrativeDTO> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<AdministrativeDTO> list) {
		this.list = list;
	}

}
