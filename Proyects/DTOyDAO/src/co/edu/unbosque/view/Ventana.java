package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Clase en la que crearemos nuestra ventana
 * @author Esteban Mejia
 *
 */
public class Ventana extends JFrame{
	/**
	 * Sera el titulo
	 */
	private JLabel titulo;
	/**
	 * Las etiquetas que se añaderan
	 */
	private JButton anadir,quitar,mostrar;
	/**
	 * Metodo constructor donde daremos valores a nuestra ventana
	 */
	public Ventana() {
		setSize(500,350);
		setResizable(false);
		setLayout(null);
		inicializarComponentes();
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(252,246,241));
		setVisible(true);
	}
	/**
	 * Aca inicializaremos nuestras distintas variables
	 */
	public void inicializarComponentes(){
		titulo=new JLabel();
		titulo.setText("Personas y Animales");
		titulo.setFont(new Font("Serif", Font.PLAIN, 25));
		titulo.setBounds(145,0,400,100);
		add(titulo);

		anadir= new JButton();
		anadir.setText("Personas");
		anadir.setFont(new Font("Serif", Font.PLAIN, 15));
		anadir.setActionCommand("Personas");
		anadir.setBounds(150,100,200,50);
		anadir.setBackground(new Color(253,247,238));
		add(anadir);

		quitar= new JButton();
		quitar.setText("Animales");
		quitar.setFont(new Font("Serif", Font.PLAIN, 15));
		quitar.setBackground(new Color(246,226,195));
		quitar.setActionCommand("Animales");
		quitar.setBounds(150,150,200,50);
		add(quitar);

		mostrar= new JButton();
		mostrar.setText("Mostrar todo");
		mostrar.setActionCommand("MOSTRAR");
		mostrar.setFont(new Font("Serif", Font.PLAIN, 15));
		mostrar.setBounds(150,200,200,50);
		mostrar.setBackground(new Color(216,157,116));
		add(mostrar);


	}
	/**
	 * @return the titulo
	 */
	public JLabel getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the anadir
	 */
	public JButton getAnadir() {
		return anadir;
	}
	/**
	 * @param anadir the anadir to set
	 */
	public void setAnadir(JButton anadir) {
		this.anadir = anadir;
	}
	/**
	 * @return the quitar
	 */
	public JButton getQuitar() {
		return quitar;
	}
	/**
	 * @param quitar the quitar to set
	 */
	public void setQuitar(JButton quitar) {
		this.quitar = quitar;
	}
	/**
	 * @return the mostrar
	 */
	public JButton getMostrar() {
		return mostrar;
	}
	/**
	 * @param mostrar the mostrar to set
	 */
	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}
}
