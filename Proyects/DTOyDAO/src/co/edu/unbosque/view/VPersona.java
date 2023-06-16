package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * En esta clase crearemos la ventana que funcionara para ver a los personas, anadirlos o quitarlos
 * @author Esteban Mejia
 *
 */
public class VPersona extends JFrame{
	/**
	 * Variables que se asignan a los botones
	 */
	private JButton anadirP,quitarP,actualizar;
	/**
	 * Variables respecto a los Labels que acompañan los campos de texto
	 */
	private JLabel lblnombre, lbledad,lblfecha, personas,lblaltura,fpersonas,aviso;
	/**
	 * Campos de texto para poner los nombres,edad y las fechas
	 */
	private JTextField nombre,edad,fecha,altura;
	/**
	 * Este sera nuestro metodo constructor de la clase Vpersonas
	 */
	public VPersona() {
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
		anadirP= new JButton();
		anadirP.setText("Anadir");
		anadirP.setBackground(Color.WHITE);
		anadirP.setActionCommand("ANADIRP");
		anadirP.setBounds(170,220,100,30);
		add(anadirP);

		actualizar= new JButton();
		actualizar.setText("Actualizar lista");
		actualizar.setBackground(Color.WHITE);
		actualizar.setActionCommand("ACTUALIZARP");
		actualizar.setBounds(270,220,100,30);
		add(actualizar);

		personas=new JLabel();
		personas.setText("Personas en lista");
		personas.setBounds(50,-15,200,50);
		add(personas);

		fpersonas=new JLabel();
		fpersonas.setFont(new Font("Serif", Font.PLAIN, 12));
		fpersonas.setText("Nombre  Edad Fecha de Nacimiento  Altura");
		fpersonas.setBounds(10,30,400,10);
		add(fpersonas);

		aviso=new JLabel();
		aviso.setFont(new Font("Serif", Font.PLAIN, 14));
		aviso.setText("Recuerda, si deseas actualizar datos, debes rellenar todos los campos");
		aviso.setBounds(30,250,500,30);
		add(aviso);

		quitarP= new JButton();
		quitarP.setText("Quitar");
		quitarP.setBackground(Color.WHITE);
		quitarP.setActionCommand("QUITARP");
		quitarP.setBounds(370,220,100,30);
		add(quitarP);

		lblnombre=new JLabel();
		lblnombre.setBounds(300,0,400,30);
		lblnombre.setText("Pon el nombre de la persona");
		add(lblnombre);

		nombre=new JTextField();
		nombre.setBounds(300,25,100,30);
		add(nombre);

		lbledad=new JLabel();
		lbledad.setBounds(300,50,400,30);
		lbledad.setText("Pon su edad");
		add(lbledad);

		edad=new JTextField();
		edad.setBounds(300,75,100,30);
		add(edad);

		lblfecha=new JLabel();
		lblfecha.setBounds(300,100,400,30);
		lblfecha.setText("Pon su fecha de nacimiento");
		add(lblfecha);

		fecha=new JTextField();
		fecha.setBounds(300,125,100,30);
		add(fecha);

		altura=new JTextField();
		altura.setBounds(300,175,100,30);
		add(altura);

		lblaltura=new JLabel();
		lblaltura.setBounds(300,150,400,30);
		lblaltura.setText("Pon la altura de la persona");
		add(lblaltura);
	}
	/**
	 * @return the lblaltura
	 */
	public JLabel getLblaltura() {
		return lblaltura;
	}
	/**
	 * @param lblaltura the lblaltura to set
	 */
	public void setLblaltura(JLabel lblaltura) {
		this.lblaltura = lblaltura;
	}
	/**
	 * @return the altura
	 */
	public JTextField getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(JTextField altura) {
		this.altura = altura;
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
	 * @return the lblfecha
	 */
	public JLabel getLblfecha() {
		return lblfecha;
	}
	/**
	 * @param lblfecha the lblfecha to set
	 */
	public void setLblfecha(JLabel lblfecha) {
		this.lblfecha = lblfecha;
	}
	/**
	 * @return the personas
	 */
	public JLabel getPersonas() {
		return personas;
	}
	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(JLabel personas) {
		this.personas = personas;
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
	 * @return the fecha
	 */
	public JTextField getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(JTextField fecha) {
		this.fecha = fecha;
	}
}
