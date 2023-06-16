package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 * Esta clase se encarga de realizar todas las operaciones correspondientes a la clase AnimalDTO
 * @author Esteban Mejia
 *
 */
public class AnimalDAO {
	/**
	 * Crearemos nuestra lista de animales
	 */
	private ArrayList<AnimalDTO> lista;
	/**
	 * El metodo constructor donde inicializaremos nuestra lista
	 */
	public AnimalDAO() {
		lista=new ArrayList<>();
	}
	/**
	 * Metodo donde creamos un nuevo animal
	 * @param nombre sera el nombre del animal
	 * @param habitad sera el habitad del animal
	 * @param alimentacion sera la alimentacion del animal
	 * @param nivel_extincion sera el nivel de extincion del animal
	 */
	public void createAnimal(String nombre,String habitad, String alimentacion, int nivel_extincion) {
		lista.add(new AnimalDTO(nombre,habitad,alimentacion,nivel_extincion));
	}
	/**
	 * etodo donde eliminaremos a un animal
	 * @param nombre sera el nombre del animal
	 * @param habitad sera el habitad del animal
	 * @param alimentacion sera la alimentacion del animal
	 * @param nivel sera el nivel de extincion del animal
	 */
	public void deleteAnimalPos(String nombre, String habitad,String alimentacion, int nivel) {
		try {
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().equals(nombre)&&lista.get(i).getHabitad().equals(habitad)&&lista.get(i).getAlimentacion().equals(alimentacion)&&lista.get(i).getNivel_extincion()==nivel) {
					lista.remove(i);
					JOptionPane.showMessageDialog(null, "Se ha elimiado el animal con exito");
				}else {
					JOptionPane.showMessageDialog(null, "No hay ningun animal para eliminar");
				}
			}
		} catch (Exception e) {

		}
	}
	/**
	 * metodo donde actualizaremos los datos de un animal
	 * @param nombre_new sera el nombre nuevo
	 * @param h sera la habitad nueva
	 * @param pos sera la posicion del iterador
	 */
	public void updateAnimal(String nombre_new, String h,int pos) {
		for (pos  = 0; pos  < lista.size(); pos ++) {
			if(lista.get(pos).getNombre().equals(nombre_new)&&lista.get(pos).getHabitad().equals(h)) {
				lista.get(pos).setNombre(JOptionPane.showInputDialog("Digita el nuevo nombre"));
				lista.get(pos).setHabitad(JOptionPane.showInputDialog("Digita el nuevo Habitad"));
			}
		}
	}
	/**
	 * @return the lista
	 */
	public ArrayList<AnimalDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<AnimalDTO> lista) {
		this.lista = lista;
	}

}

