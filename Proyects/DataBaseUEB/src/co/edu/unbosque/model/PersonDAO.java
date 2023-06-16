package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.FileHandler;
/**
 * DAO de tipo persona
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class PersonDAO {
	/**
	 * Arreglo de personas
	 */
	private ArrayList<PersonDTO> list;
	/**
	 * Clase que escribe y guarda los datos en archivos
	 */
	private FileHandler fh;
	
	/**
	 * Método constructor
	 */
	public PersonDAO() {
		super();
		list = new ArrayList<>();
		fh = new FileHandler("person.csv");
	}
	/**
	 * Método super
	 * @param list es la lista
	 * @param fh es el filehandler
	 */
	public PersonDAO(ArrayList<PersonDTO> list, FileHandler fh) {
		super();
		this.list = list;
		this.fh = fh;
	}
	/**
	 * Método para cargar los datos que se ingresan y organiza los datos en el archivo
	 */
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new PersonDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3]));
		}
	}
	/**
	 * Método que escribe los datos
	 * @param list es la lista
	 * @return retorna la lista
	 */
	public String writeData(ArrayList<PersonDTO> list) {
		String content = "";
		for (PersonDTO p : list) {
			content+=p.toString()+"\n";
			
		}
		return content;
	}
	/**
	 * @return the list
	 */
	public ArrayList<PersonDTO> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<PersonDTO> list) {
		this.list = list;
	}
	
	
	
	
	
	
}
