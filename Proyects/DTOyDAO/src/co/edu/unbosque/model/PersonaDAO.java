package co.edu.unbosque.model;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 * Sera la clase donde haremos las operaciones de la clase PersonaDTO
 * @author Esteban Mejia
 *
 */
public class PersonaDAO {
	/**
	 * Crearemos nuestra lista
	 */
	private ArrayList<PersonaDTO> lista;
	/**
	 * Metodo constructor donde inicializaremos la lista
	 */
	public PersonaDAO() {
		lista=new ArrayList<>();
	}
	/**
	 * Metodo en el que crearemos una nueva persona
	 * @param nombre sera el nombre de la persona
	 * @param edad  sera la edad de la persona
	 * @param fecha_nacimiento sera la fecha denacimiento de la persona
	 * @param altura sera la altura denacimiento de la persona
	 */
	public void createPerson(String nombre, int edad, String fecha_nacimiento, float altura) {
		PersonaDTO aux=new PersonaDTO(nombre,edad,fecha_nacimiento,altura);
		lista.add(aux);
	}
	/**
	 * Metodo en el que eliminaremos a una persona
	 * @param nombre sera el nombre de la persona
	 * @param edad  sera la edad de la persona
	 * @param fecha_nacimiento sera la fecha denacimiento de la persona
	 * @param altura sera la altura denacimiento de la persona
	 */
	public void deletePersonaPos(String nombre, int edad, String fecha_nacimiento, float altura) {
		try {
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().equals(nombre)&&lista.get(i).getEdad()==edad&&lista.get(i).getFecha_nacimiento().equals(fecha_nacimiento)&&lista.get(i).getAltura()==altura) {
					lista.remove(i);
					JOptionPane.showMessageDialog(null, "Se ha elimiado la persona con exito");
				}else {
					JOptionPane.showMessageDialog(null, "No hay ningua persona para eliminar");
				}
			}
		} catch (Exception e) {	
		}
	}
	/**
	 *  Metodo en el que actualizaremos los datos a una persona
	 * @param pos sera la posicion del iterador
	 * @param nombre_new sera el nuevo nombre
	 * @param e sera la nueva edad
	 * @param h sera la nueva altura
	 */
	public void updatePersona(int pos, String nombre_new,int e,float h) {
		for (pos  = 0; pos  < lista.size(); pos ++) {
			if(lista.get(pos).getNombre().equals(nombre_new)&&lista.get(pos).getEdad()==e&&lista.get(pos).getAltura()==h) {
				lista.get(pos).setNombre(JOptionPane.showInputDialog("Digita el nuevo nombre"));
				lista.get(pos).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digita la edad nueva")));
				lista.get(pos).setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digita la altura nueva")));
			}
		}
	}

	/**
	 * @return the lista
	 */
	public ArrayList<PersonaDTO> getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList<PersonaDTO> lista) {
		this.lista = lista;
	}
}
