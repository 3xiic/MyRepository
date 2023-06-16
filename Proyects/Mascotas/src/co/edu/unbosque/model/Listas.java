package co.edu.unbosque.model;

import java.util.ArrayList;
/**
 * En esta clase crearemos nuestra dos listas tanto de perros como de gatos
 * @author Esteban Mejia
 *
 */
public class Listas {
	private ArrayList<Gato> Gatos;
	private ArrayList <Perro> Perros;
	/**
	 * Este sera nuestro metodo constructor de la clase Listas
	 */
	public Listas() {
		Gatos= new ArrayList<>();
		Perros= new ArrayList<>();
		
	}
	/**
	 * @return the gatos
	 */
	public ArrayList<Gato> getGatos() {
		return Gatos;
	}
	/**
	 * @param gatos the gatos to set
	 */
	public void setGatos(ArrayList<Gato> gatos) {
		Gatos = gatos;
	}
	/**
	 * @return the perros
	 */
	public ArrayList<Perro> getPerros() {
		return Perros;
	}
	/**
	 * @param perros the perros to set
	 */
	public void setPerros(ArrayList<Perro> perros) {
		Perros = perros;
	}
	

}
