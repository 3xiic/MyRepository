package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.FileHandler;
/**
 * Clase que contiene los métodos propios de un estudiante de segundo semestre
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class SecondSemesterStudentsDAO implements StudentOperationsDAO {
	/**
	 * Arreglo de estudiantes de segundo semestre
	 */
	private ArrayList<SecondSemesterStudentsDTO> list;
	/**
	 * Clase que escribe y guarda los datos en archivos
	 */
	private FileHandler fh;
	/**
	 * Metodo constructor
	 */
	public SecondSemesterStudentsDAO() {
		list = new ArrayList<>();
		fh = new FileHandler("students.prog1");
	}
	/**
	 * Método para cargar los datos que se ingresan y organiza los datos en el archivo
	 */
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new SecondSemesterStudentsDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3],Integer.parseInt(columns[4])));
		}
	}
	/**
	 * Método para agregar un estudiante de segundo semestre al archivo de datos que recibe los datos del mismo
	 * @param name es el nombre
	 * @param age es la edad
	 * @param food es la comida
	 * @param color es el color
	 * @param classes son las materias perdidas
	 */
	public void addStudent(String name, int age, String food, String color, int classes) {
		list.add(new SecondSemesterStudentsDTO(name, age, food, color,classes));
		fh.write(writeData(list));
	}
	/**
	 * Metodo para actualizar un estudiante de segundo semestre en el archivo de datos
	 */
	@Override
	public void updateStudent(String name,int newAge, String nfood, String ncolor,int nfailed_class) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.get(i).setAge(newAge);
				list.get(i).setFood(nfood);
				list.get(i).setColor(ncolor);
				list.get(i).setFailed_class(nfailed_class);
				fh.write(writeData(list));
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el estudiante",null,JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	/**
	 * Método para borrar a un estudiante de segundo semestre del archivo de datos
	 */
	@Override
	public void deleteStudent(String name, int failed_class) {
		for (int i = 0; i < list.size(); i++) {
			if(name.toLowerCase().equals(list.get(i).getName().toLowerCase())) {
				list.remove(i);
				fh.write(writeData(list));
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el estudiante",null,JOptionPane.ERROR_MESSAGE);
			}	
		}
	}
	/**
	 * Método que escribe los datos
	 * @param list es la lista
	 * @return retorna la lista
	 */
	public String writeData(ArrayList<SecondSemesterStudentsDTO> list) {
		String content = "";
		for (SecondSemesterStudentsDTO p : list) {
			content+=p.toString()+"\n";

		}
		return content;
	}

	/**
	 * @return the list
	 */
	public ArrayList<SecondSemesterStudentsDTO> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<SecondSemesterStudentsDTO> list) {
		this.list = list;
	}



}


