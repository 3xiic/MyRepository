package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	private PersonaDAO personadao;
	private AnimalDAO animaldao;
	private VPersona vP;
	private VAnimal vA;
	private Ventana v;
	private VMostrar vM;
	/**
	 * El metodo costructor de nuestro controlador donde inicializaremos nuestros metodos y clase
	 * @throws IOException 
	 */
	public Controller() throws IOException {
		personadao= new PersonaDAO();
		v= new Ventana();
		vP= new VPersona();
		vA= new VAnimal();
		vM= new VMostrar();
		animaldao= new AnimalDAO();
		personadao=new PersonaDAO();
		asignarOyentes();
	}
	/**
	 * Metodo que se encargar de agregar un ActionListener a cada uno de los Botones de la vista
	 */
	public void asignarOyentes() {
		v.getAnadir().addActionListener(this);
		v.getMostrar().addActionListener(this);
		v.getQuitar().addActionListener(this);
		vA.getQuitarA().addActionListener(this);
		vA.getAnadirA().addActionListener(this);
		vA.getActualizar().addActionListener(this);
		vP.getQuitarP().addActionListener(this);
		vP.getAnadirP().addActionListener(this);
		vP.getActualizar().addActionListener(this);

	} 

	@Override
	/**
	 * Nuestro metodo actionperformed es un metodo autogenerado, el cual su funcion es hacer que los botones puedan ser funcionale y añadir acciones a estos
	 */
	public void actionPerformed(ActionEvent e) {
		String s= e.getActionCommand();
		if(s.equals("Personas")) {
			vP.setVisible(true);
		}else if(s.equals("Animales")) {
			vA.setVisible(true);
		}else if(s.equals("ANADIRP")) {
			try {
				personadao.createPerson(vP.getNombre().getText(), Integer.parseInt(vP.getEdad().getText()), vP.getFecha().getText(), Float.parseFloat(vP.getAltura().getText()));
				ListaP();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Recuerda solo puedes digitar numeros en la altura y edad");
			}

			vP.repaint();
		}else if(s.equals("QUITARP")) {
			personadao.deletePersonaPos(vP.getNombre().getText(), Integer.parseInt(vP.getEdad().getText()), vP.getFecha().getText(), Float.parseFloat(vP.getAltura().getText()));
			vP=null;
			vP=new VPersona();
			vP.getAnadirP().addActionListener(this);
			vP.getActualizar().addActionListener(this);
			vP.getQuitarP().addActionListener(this);
		}else if(s.equals("ANADIRA")) {
			try {
				animaldao.createAnimal(vA.getNombre().getText(), vA.getHabitad().getText(), vA.getAlimentacion().getText(), Integer.parseInt(vA.getNivel().getText()));
				ListaA();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Recuerda solo puedes digitar numeros en el nivel de extincion");
			}
			vA.repaint();
		}else if(s.equals("QUITARA")) {
			vA=null;
			vA=new VAnimal();
			vA.getQuitarA().addActionListener(this);
			vA.getAnadirA().addActionListener(this);
			vA.getActualizar().addActionListener(this);
		}else if(s.equals("MOSTRAR")) {
			vM=null;
			vM=new VMostrar();
			vM.setVisible(true);
			ListarA();
			ListarP();
		}else if(s.equals("ACTUALIZARA")) {
			for (int i = 0; i < animaldao.getLista().size(); i++) {
				try {
					animaldao.updateAnimal(vA.getNombre().getText(), vA.getHabitad().getText(), Integer.parseInt(vA.getNivel().getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Recuerda solo puedes digitar numeros en el nivel de extincion");
				}
				vA=null;
				vA=new VAnimal();
				vA.getQuitarA().addActionListener(this);
				vA.getAnadirA().addActionListener(this);
				vA.getActualizar().addActionListener(this);
				ListaA();
			}
		}else if(s.equals("ACTUALIZARP")) {
			for (int i = 0; i < personadao.getLista().size(); i++) {
				try {
					personadao.updatePersona(i,vP.getNombre().getText(), Integer.parseInt(vP.getEdad().getText()),Float.parseFloat(vP.getAltura().getText()));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Recuerda solo puedes digitar numeros en la altura y edad");
				}
				vP=null;
				vP=new VPersona();
				vP.getQuitarP().addActionListener(this);
				vP.getAnadirP().addActionListener(this);
				vP.getActualizar().addActionListener(this);
				ListaP();

			}
		}
	}
	/**
	 * Este metodo se encarga de Listar a los animales para ser mostrados en la ventana de Animales (VAnimal)
	 */
	public void ListaP() {
		JLabel texto;
		int pos=10;
		for (int i = 0; i < personadao.getLista().size(); i++) {
			texto=new JLabel();
			texto.setBounds(20,pos,400,100);
			texto.setVisible(true);
			texto.setText(personadao.getLista().get(i).getNombre().toString()+"  "+personadao.getLista().get(i).getEdad()+"  "+personadao.getLista().get(i).getFecha_nacimiento().toString()+"  "+personadao.getLista().get(i).getAltura());
			pos+=25;
			vP.add(texto);
		}
	}
	/**
	 * Este metodo se encarga de Listar a las personas para ser mostrados en la ventana de Personas (VPersona)
	 */
	public void ListaA() {
		JLabel texto;
		int pos=10;
		for (int i = 0; i < animaldao.getLista().size(); i++) {
			texto=new JLabel();
			texto.setBounds(20,pos,400,100);
			texto.setVisible(true);
			texto.setText(animaldao.getLista().get(i).getNombre().toString()+"  "+animaldao.getLista().get(i).getAlimentacion().toString()+"  "+animaldao.getLista().get(i).getHabitad().toString()+"  "+animaldao.getLista().get(i).getNivel_extincion());
			pos+=25;
			vA.add(texto);
		}

	}
	/**
	 * Este metodo se encarga de Listar a los animales para ser mostrados en la ventana de Mostrar todos
	 */
	public void ListarA() {
		JLabel texto = null;
		int pos=15;
		for (int i = 0; i < animaldao.getLista().size(); i++) {
			texto=new JLabel();
			texto.setBounds(40,pos,400,100);
			texto.setVisible(true);
			texto.setText(animaldao.getLista().get(i).getNombre().toString()+"  "+animaldao.getLista().get(i).getAlimentacion().toString()+"  "+animaldao.getLista().get(i).getHabitad().toString()+"  "+animaldao.getLista().get(i).getNivel_extincion());
			pos+=25;
			vM.add(texto);
		}
	}
	/**
	 * Este metodo se encarga de Listar a las personas para ser mostrados en la ventana de Mostrar todos
	 */
	public void ListarP() {
		JLabel texto = null;
		int pos=15;
		for (int i = 0; i < personadao.getLista().size(); i++) {
			texto=new JLabel();
			texto.setBounds(580,pos,400,100);
			texto.setVisible(true);
			texto.setText(personadao.getLista().get(i).getNombre().toString()+"  "+personadao.getLista().get(i).getEdad()+"  "+personadao.getLista().get(i).getFecha_nacimiento().toString()+"  "+personadao.getLista().get(i).getAltura());
			pos+=25;
			vM.add(texto);
		}
	}
}

