package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;
/**
 * Esta Clase es nuestro controlador enn cual esta encargado de realizar los distinstos procediemientos de ejecucion respecto a la vista y el modelo
 * @author Esteban Mejia
 *
 */
public class Controller implements ActionListener {
	private Ventana v;
	private VMostrar vM;
	private VGatos vG;
	private VPerros vP;
	private Gato g;
	private Perro p;
	private Listas l;
/**
 * El metodo costructor de nuestro controlador donde inicializaremos nuestros metodos y clase
 */
	public Controller()  {
		v= new Ventana();
		vM= new VMostrar();
		vG= new VGatos();
		vP= new VPerros();
		l=new Listas();
		asignarOyentes();
	}
	/**
	 * Metodo que se encargar de agregar un ActionListener a cada uno de los Botones de la vista
	 */
	public void asignarOyentes() {
		v.getAnadir().addActionListener(this);
		v.getMostrar().addActionListener(this);
		v.getQuitar().addActionListener(this);
		vP.getQuitarP().addActionListener(this);
		vG.getQuitarG().addActionListener(this);
		vG.getAnadirG().addActionListener(this);
		vP.getAnadirP().addActionListener(this);
		vP.getActualizar().addActionListener(this);
		vG.getActualizar().addActionListener(this);
	}
	@Override
	/**
	 * Nuestro metodo actionperformed es un metodo autogenerado, el cual su funcion es hacer que los botones puedan ser funcionale y añadir acciones a estos
	 */
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("MOSTRAR")) {
			vM=null;
			vM=new VMostrar();
			vM.setVisible(true);
			ListarG();
			ListarP();
		}else if(s.equals("ACTUALIZARP")) {
			vP=null;
			vP=new VPerros();
			vP.repaint();
			vP.getQuitarP().addActionListener(this);
			vP.getAnadirP().addActionListener(this);
			vP.getActualizar().addActionListener(this);
		}else if(s.equals("ACTUALIZARG")) {
			vG=null;
			vG=new VGatos();
			vG.repaint();
			vG.getQuitarG().addActionListener(this);
			vG.getAnadirG().addActionListener(this);
			vG.getActualizar().addActionListener(this);
		}else if(s.equals("PERROS")) {
			vP.setVisible(true);
			ListaP();
		}else if(s.equals("GATOS")) {
			vG.setVisible(true);
			ListaG();
		}else if(s.equals("ANADIRG")) {
			try {
				AnadirGato(vG.getNombre().getText(),Integer.parseInt(vG.getEdad().getText()),vG.getRaza().getText());
				ListaG();
				vG.repaint();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Solo puedes poner numeros en la edad");
			}
		}else if(s.equals("ANADIRP")) {
			try {
				AnadirPerro(vP.getNombre().getText(),Integer.parseInt(vP.getEdad().getText()),vP.getRaza().getText());
				ListaP();
				vP.repaint();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Solo puedes poner numeros en la edad");
			}
		}else if(s.equals("QUITARG")) {
			EliminarGato(vG.getNombre().getText(),vG.getRaza().getText());
			vG.repaint();
		}else if(s.equals("QUITARP")) {
			EliminarPerro(vP.getNombre().getText(),vP.getRaza().getText());
			vP.repaint();
		}
	}
	/**
	 * Este metodo es el encargado de anadir perros a una lista de perros
	 * @param nombre Sera el nombre que llevara el perro que agregaremos
	 * @param edad Sera la edad que llevara el perro que agregaremos
	 * @param raza Sera la raza que llevara el perro que agregaremos
	 */
	public void AnadirPerro(String nombre, int edad, String raza){
		Perro p= new Perro(edad, nombre, raza);
		l.getPerros().add(p);
		JOptionPane.showMessageDialog(null, "El Perro se ha registrado con exito");
	}
	/**
	 * Este metodo es el encargado de anadir gatos a una lista de gatos
	 * @param nombre Sera el nombre que llevara el gato que agregaremos
	 * @param edad Sera la edad que llevara el gato que agregaremos
	 * @param raza Sera la raza  que llevara el gato que agregaremos
	 */
	public void AnadirGato(String nombre, int edad, String raza){
		Gato g= new Gato(edad, nombre, raza);
		l.getGatos().add(g);
		JOptionPane.showMessageDialog(null, "El Gato se ha registrado con exito");
	}
	/**
	 * Este metodo es el encargado de eliminar perros de una lista de perros
	 * @param nombre Sera el nombre que llevara el perro que eliminaremos
	 * @param raza Sera la raza que llevara el perro que eliminaremos
	 */
	public void EliminarPerro(String nombre,String raza) {
		for (int i = 0; i < l.getPerros().size(); i++) {
			if(l.getPerros().get(i).getNombre().equals(nombre)&&l.getPerros().get(i).getRaza().equals(raza)){
				l.getPerros().remove(i);
				JOptionPane.showMessageDialog(null, "El perro se ha eliminado con exito");
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado ningun perro");
			}
		}
	}
	/**
	 * Este metodo es el encargado de eliminar gatos de una lista de gatos
	 * @param nombre Sera el nombre que llevara el gatos que eliminaremos
	 * @param raza Sera la raza que llevara el perro que eliminaremos
	 */
	public void EliminarGato(String nombre,String raza) {
		for (int i = 0; i < l.getGatos().size(); i++) {
			if(l.getGatos().get(i).getNombre().equals(nombre)&&l.getGatos().get(i).getRaza().equals(raza)){
				l.getGatos().remove(i);
				JOptionPane.showMessageDialog(null, "El gato se ha eliminado con exito");
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado ningun gato");
			}
		}
	}
	/**
	 * Este metodo se encarga de Listar a los gatos para ser mostrados en la ventana de Mostrar visitantes actuales
	 */
	public void ListarG() {
		JLabel texto;
		int pos=0;
		for (int i = 0; i < l.getGatos().size(); i++) {
			texto=new JLabel();
			texto.setBounds(20,pos,400,100);
			texto.setVisible(true);
			texto.setText(l.getGatos().get(i).getNombre().toString()+"    "+String.valueOf(l.getGatos().get(i).getEdad())+"   "+l.getGatos().get(i).getRaza().toString());
			vM.add(texto);
			pos+=25;
		}
	}
	/**
	 * Este metodo se encarga de Listar a los perros para ser mostrados en la ventana de Mostrar visitantes actuales (VMostrar)
	 */
	public void ListarP() {
		JLabel texto;
		int pos=0;
		for (int i = 0; i < l.getPerros().size(); i++) {
			texto=new JLabel();
			texto.setBounds(600,pos,400,100);
			texto.setVisible(true);
			texto.setText(l.getPerros().get(i).getNombre().toString()+"    "+String.valueOf(l.getPerros().get(i).getEdad())+"   "+l.getPerros().get(i).getRaza().toString());
			vM.add(texto);
			pos+=25;
		}
	}
	/**
	 * Este metodo se encarga de Listar a los perros para ser mostrados en la ventana de Perros (VPerros)
	 */
	public void ListaP() {
		JLabel texto;
		int pos=0;
		for (int i = 0; i < l.getPerros().size(); i++) {
			texto=new JLabel();
			texto.setBounds(100,pos,400,100);
			texto.setVisible(true);
			texto.setText(l.getPerros().get(i).getNombre().toString()+"    "+String.valueOf(l.getPerros().get(i).getEdad())+"   "+l.getPerros().get(i).getRaza().toString());
			vP.add(texto);
			pos+=25;
		}
	}
	/**
	 * Este metodo se encarga de Listar a los Gatos para ser mostrados en la ventana de Gatos (VGatos)
	 */
	public void ListaG() {
		JLabel texto;
		int pos=0;
		for (int i = 0; i < l.getGatos().size(); i++) {
			texto=new JLabel();
			texto.setBounds(100,pos,400,100);
			texto.setVisible(true);
			texto.setText(l.getGatos().get(i).getNombre().toString()+"    "+String.valueOf(l.getGatos().get(i).getEdad())+"   "+l.getGatos().get(i).getRaza().toString());
			vG.add(texto);
			pos+=25;
		}
	}
}
