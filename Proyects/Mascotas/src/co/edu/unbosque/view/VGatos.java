package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * En esta clase crearemos la ventana que funcionara para ver a los gatos, anadirlos o quitarlos
 * @author Esteban Mejia
 *
 */
public class VGatos extends JFrame{
	/**
	 * Variables que se asignan a los botones
	 */
	private JButton anadirG,quitarG, actualizar;
	/**
	 * Variables respecto a los Labels que acompañan los campos de texto
	 */
	private JLabel gatos, lblnombre, lbledad,lblraza;
	/**
	 * Campos de texto para poner los nombres,edad y las razas
	 */
	private JTextField nombre,edad,raza;
	/**
	 * Este sera nuestro metodo constructor de la clase VGatos
	 */
	public VGatos() {
		setSize(700,300);
		setResizable(false);
		setLayout(null);
		inicializarComponentes();
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(252,246,241));
		setVisible(false);
	}
/**
 * Aca inicializaremos nuestras distintas variables
 */
	public void inicializarComponentes() {
		anadirG= new JButton();
		anadirG.setText("Anadir");
		anadirG.setBackground(Color.WHITE);
		anadirG.setActionCommand("ANADIRG");
		anadirG.setBounds(550,180,100,30);
		add(anadirG);
		
		actualizar= new JButton();
		actualizar.setText("Actualizar lista");
		actualizar.setBackground(Color.WHITE);
		actualizar.setActionCommand("ACTUALIZARG");
		actualizar.setBounds(550,120,100,30);
		add(actualizar);

		gatos=new JLabel();
		gatos.setText("Gatos que han visitado la clinica");
		gatos.setBounds(50,0,200,50);
		add(gatos);
		
		quitarG= new JButton();
		quitarG.setBackground(Color.WHITE);
		quitarG.setText("Quitar");
		quitarG.setActionCommand("QUITARG");
		quitarG.setBounds(550,150,100,30);
		add(quitarG);
		
		lblnombre=new JLabel();
		lblnombre.setBounds(300,25,400,30);
		lblnombre.setText("Pon el nombre del gato");
		add(lblnombre);
		
		nombre=new JTextField();
		nombre.setBounds(300,50,100,30);
		add(nombre);
		
		lbledad=new JLabel();
		lbledad.setBounds(300,75,400,30);
		lbledad.setText("Pon la edad del gato");
		add(lbledad);
		
		edad=new JTextField();
		edad.setBounds(300,100,100,30);
		add(edad);
		
		lblraza=new JLabel();
		lblraza.setBounds(300,125,400,30);
		lblraza.setText("Pon la raza del gato");
		add(lblraza);
		
		raza=new JTextField();
		raza.setBounds(300,150,100,30);
		add(raza);
	}
	/**
	 * @return the actualizar
	 */
	public JButton getActualizar() {
		return actualizar;
	}
	/**
	 * @param actualizar the actualizar to set
	 */
	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}
	/**
	 * @return the lblnombre
	 */
	public JLabel getLblnombre() {
		return lblnombre;
	}
	/**
	 * @param lblnombre the lblnombre to set
	 */
	public void setLblnombre(JLabel lblnombre) {
		this.lblnombre = lblnombre;
	}
	/**
	 * @return the lbledad
	 */
	public JLabel getLbledad() {
		return lbledad;
	}
	/**
	 * @param lbledad the lbledad to set
	 */
	public void setLbledad(JLabel lbledad) {
		this.lbledad = lbledad;
	}
	/**
	 * @return the lblraza
	 */
	public JLabel getLblraza() {
		return lblraza;
	}
	/**
	 * @param lblraza the lblraza to set
	 */
	public void setLblraza(JLabel lblraza) {
		this.lblraza = lblraza;
	}
	/**
	 * @return the nombre
	 */
	public JTextField getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public JTextField getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(JTextField edad) {
		this.edad = edad;
	}
	/**
	 * @return the raza
	 */
	public JTextField getRaza() {
		return raza;
	}
	/**
	 * @param raza the raza to set
	 */
	/**
	 * @return the anadirG
	 */
	public JButton getAnadirG() {
		return anadirG;
	}
	/**
	 * @param anadirG the anadirG to set
	 */
	public void setAnadirG(JButton anadirG) {
		this.anadirG = anadirG;
	}
	/**
	 * @return the quitarG
	 */
	public JButton getQuitarG() {
		return quitarG;
	}
	/**
	 * @param quitarG the quitarG to set
	 */
	public void setQuitarG(JButton quitarG) {
		this.quitarG = quitarG;
	}
	/**
	 * @return the gatos
	 */
	public JLabel getGatos() {
		return gatos;
	}
	/**
	 * @param gatos the gatos to set
	 */
	public void setGatos(JLabel gatos) {
		this.gatos = gatos;
	}
	/**
	 * @param raza the raza to set
	 */
	public void setRaza(JTextField raza) {
		this.raza = raza;
	}
	
}
