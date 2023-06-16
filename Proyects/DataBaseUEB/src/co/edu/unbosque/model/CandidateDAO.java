package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.FileHandler;
/**
 * Clase que contiene los métodos propios para el aspirante
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class CandidateDAO implements CandidateOperationsDAO {
	/**
	 * Arreglo de aspirantes
	 */
	private ArrayList<CandidateDTO> list;
	/**
	 * Clase que escribe y guarda los datos en archivos
	 */
	private FileHandler fh;
	
	/**
	 * Clase que escribe y guarda los datos en archivos
	 */
	public CandidateDAO() {
		list = new ArrayList<>();
		fh = new FileHandler("candidates.prog1");
	}
	
	/**
	 * Método para cargar los datos que se ingresan y organiza los datos en el archivo
	 */
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new CandidateDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3],columns[4]));
		}
	}
	
	/**
	 * @return the fh
	 */
	public FileHandler getFh() {
		return fh;
	}

	/**
	 * @param fh the fh to set
	 */
	public void setFh(FileHandler fh) {
		this.fh = fh;
	}
	/**
	 * Método para agregar aspirantes al archivo de datos que recibe los datos del mismo 
	 * @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param career es la carrera
	 */
	public void addCandidate(String name, int age, String food, String color, String career) {
		list.add(new CandidateDTO(name, age, food, color,career));
		fh.write(writeData(list));
	}
	/**
	 * Método para borrar a un aspirante del archivo de datos
	 */
	@Override
	public void deleteCandidate(String name, String carrier) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.remove(i);
				fh.write(writeData(list));
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el candidato",null,JOptionPane.ERROR_MESSAGE);
			}	
		}
	}
	/**
	 * Metodo para actualizar a un aspirante en el archivo de datos
	 */
	@Override
	public void updateCandidate(String name, int newAge, String nfood, String ncolor, String ncareer) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.get(i).setAge(newAge);
				list.get(i).setFood(nfood);
				list.get(i).setColor(ncolor);
				list.get(i).setCareer(ncareer);	
				fh.write(writeData(list));
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el candidato",null,JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	/**
	 * Método que escribe los datos
	 * @param list es la lista
	 * @return retorna la lista
	 */
	public String writeData(ArrayList<CandidateDTO> list) {
		String content = "";
		for (CandidateDTO p : list) {
			content+=p.toString()+"\n";
			
		}
		return content;
	}

	/**
	 * @return the list
	 */
	public ArrayList<CandidateDTO> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<CandidateDTO> list) {
		this.list = list;
	}
	
	

}
