package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * Clase donde crearemos la ventana de Animales
 * @author Esteban Mejia
 *
 */
public class VAnimal extends JFrame{
	/**
	 * Variables que se asignan a los botones
	 */
	private JButton anadirA,quitarA, actualizar;
	/**
	 * Variables respecto a los Labels que acompa�an los campos de texto
	 */
	private JLabel animales, lblnombre, lblnivel,lblalimentacion,lblhabitad,fanimales,aviso;
	/**
	 * Campos de texto para poner los nombres,edad y las alimentacions
	 */
	private JTextField nombre,nivel,alimentacion,habitad;
	/**
	 * Este sera nuestro metodo constructor de la clase Vanimales
	 */
	public VAnimal() {
		setSize(500,320);
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
		anadirA= new JButton();
		anadirA.setText("Anadir");
		anadirA.setBackground(Color.WHITE);
		anadirA.setActionCommand("ANADIRA");
		anadirA.setBounds(170,220,100,30);
		add(anadirA);

		actualizar= new JButton();
		actualizar.setText("Actualizar lista");
		actualizar.setBackground(Color.WHITE);
		actualizar.setActionCommand("ACTUALIZARA");
		actualizar.setBounds(270,220,100,30);
		add(actualizar);

		animales=new JLabel();
		animales.setText("Animales en lista");
		animales.setBounds(50,-15,200,50);
		add(animales);

		fanimales=new JLabel();
		fanimales.setFont(new Font("Serif", Font.PLAIN, 12));
		fanimales.setText("Nombre  Alimentacion Habitad  Nivel de extincion");
		fanimales.setBounds(10,30,400,10);
		add(fanimales);

		aviso=new JLabel();
		aviso.setFont(new Font("Serif", Font.PLAIN, 14));
		aviso.setText("Recuerda, si deseas actualizar datos, debes rellenar todos los campos ");
		aviso.setBounds(50,250,500,30);
		add(aviso);

		quitarA= new JButton();
		quitarA.setBackground(Color.WHITE);
		quitarA.setText("Quitar");
		quitarA.setActionCommand("QUITARA");
		quitarA.setBounds(370,220,100,30);
		add(quitarA);

		lblnombre=new JLabel();
		lblnombre.setBounds(300,0,400,30);
		lblnombre.setText("Pon el nombre del animal");
		add(lblnombre);

		nombre=new JTextField();
		nombre.setBounds(300,25,100,30);
		add(nombre);

		lblnivel=new JLabel();
		lblnivel.setBounds(300,50,400,30);
		lblnivel.setText("Pon su nivel de extincion");
		add(lblnivel);

		nivel=new JTextField();
		nivel.setBounds(300,75,100,30);
		add(nivel);

		lblalimentacion=new JLabel();
		lblalimentacion.setBounds(300,100,400,30);
		lblalimentacion.setText("Pon la alimentacion del animal");
		add(lblalimentacion);

		alimentacion=new JTextField();
		alimentacion.setBounds(300,125,100,30);
		add(alimentacion);

		lblhabitad=new JLabel();
		lblhabitad.setBounds(300,150,400,30);
		lblhabitad.setText("Pon el habitad del animal");
		add(lblhabitad);

		habitad=new JTextField();
		habitad.setBounds(300,175,100,30);
		add(habitad);
	}
	/**
	 * @return the lblhabitad
	 */
	public JLabel getLblhabitad() {
		return lblhabitad;
	}
	/**
	 * @param lblhabitad the lblhabitad to set
	 */
	public void setLblhabitad(JLabel lblhabitad) {
		this.lblhabitad = lblhabitad;
	}
	/**
	 * @return the habitad
	 */
	public JTextField getHabitad() {
		return habitad;
	}
	/**
	 * @param habitad the habitad to set
	 */
	public void setHabitad(JTextField habitad) {
		this.habitad = habitad;
	}
	/**
	 * @return the anadirA
	 */
	public JButton getAnadirA() {
		return anadirA;
	}
	/**
	 * @param anadirA the anadirA to set
	 */
	public void setAnadirA(JButton anadirA) {
		this.anadirA = anadirA;
	}
	/**
	 * @return the quitarA
	 */
	public JButton getQuitarA() {
		return quitarA;
	}
	/**
	 * @param quitarA the quitarA to set
	 */
	public void setQuitarA(JButton quitarA) {
		this.quitarA = quitarA;
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
	 * @return the animales
	 */
	public JLabel getAnimales() {
		return animales;
	}
	/**
	 * @param animales the animales to set
	 */
	public void setAnimales(JLabel animales) {
		this.animales = animales;
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
	 * @return the lblnivel
	 */
	public JLabel getLblnivel() {
		return lblnivel;
	}
	/**
	 * @param lblnivel the lblnivel to set
	 */
	public void setLblnivel(JLabel lblnivel) {
		this.lblnivel = lblnivel;
	}
	/**
	 * @return the lblalimentacion
	 */
	public JLabel getLblalimentacion() {
		return lblalimentacion;
	}
	/**
	 * @param lblalimentacion the lblalimentacion to set
	 */
	public void setLblalimentacion(JLabel lblalimentacion) {
		this.lblalimentacion = lblalimentacion;
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
	 * @return the nivel
	 */
	public JTextField getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(JTextField nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return the alimentacion
	 */
	public JTextField getAlimentacion() {
		return alimentacion;
	}
	/**
	 * @param alimentacion the alimentacion to set
	 */
	public void setAlimentacion(JTextField alimentacion) {
		this.alimentacion = alimentacion;
	}
}
