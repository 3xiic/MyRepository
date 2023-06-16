package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * En esta clase crearemos la ventana que funcionara para ver a los perros, anadirlos o quitarlos
 * @author Usuario
 *
 */
public class VPerros extends JFrame{
	/**
	 * Variables que se asignan a los botones
	 */
	private JButton anadirP,quitarP,actualizar;
	/**
	 * Variables respecto a los Labels que acompañan los campos de texto
	 */
	private JLabel lblnombre, lbledad,lblraza, perros;
	/**
	 * Campos de texto para poner los nombres,edad y las razas
	 */
	private JTextField nombre,edad,raza;
/**
 * Este sera nuestro metodo constructor de la clase VPerros
 */
	public VPerros() {
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
		anadirP= new JButton();
		anadirP.setText("Anadir");
		anadirP.setBackground(Color.WHITE);
		anadirP.setActionCommand("ANADIRP");
		anadirP.setBounds(550,180,100,30);
		add(anadirP);
		
		actualizar= new JButton();
		actualizar.setText("Actualizar lista");
		actualizar.setBackground(Color.WHITE);
		actualizar.setActionCommand("ACTUALIZARP");
		actualizar.setBounds(550,120,100,30);
		add(actualizar);
		
		perros=new JLabel();
		perros.setText("Perros que han visitado la clinica");
		perros.setBounds(50,0,200,50);
		add(perros);
		
		quitarP= new JButton();
		quitarP.setText("Quitar");
		quitarP.setBackground(Color.WHITE);
		quitarP.setActionCommand("QUITARP");
		quitarP.setBounds(550,150,100,30);
		add(quitarP);
		
		lblnombre=new JLabel();
		lblnombre.setBounds(300,25,400,30);
		lblnombre.setText("Pon el nombre del perro");
		add(lblnombre);
		
		nombre=new JTextField();
		nombre.setBounds(300,50,100,30);
		add(nombre);
		
		lbledad=new JLabel();
		lbledad.setBounds(300,75,400,30);
		lbledad.setText("Pon la edad del perro");
		add(lbledad);
		
		edad=new JTextField();
		edad.setBounds(300,100,100,30);
		add(edad);
		
		lblraza=new JLabel();
		lblraza.setBounds(300,125,400,30);
		lblraza.setText("Pon la raza del perro");
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
	 * @return the anadirP
	 */
	public JButton getAnadirP() {
		return anadirP;
	}
	/**
	 * @param anadirP the anadirP to set
	 */
	public void setAnadirP(JButton anadirP) {
		this.anadirP = anadirP;
	}
	/**
	 * @return the quitarP
	 */
	public JButton getQuitarP() {
		return quitarP;
	}
	/**
	 * @param quitarP the quitarP to set
	 */
	public void setQuitarP(JButton quitarP) {
		this.quitarP = quitarP;
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
	 * @return the perros
	 */
	public JLabel getPerros() {
		return perros;
	}
	/**
	 * @param perros the perros to set
	 */
	public void setPerros(JLabel perros) {
		this.perros = perros;
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
	public void setRaza(JTextField raza) {
		this.raza = raza;
	}
	
	
}
