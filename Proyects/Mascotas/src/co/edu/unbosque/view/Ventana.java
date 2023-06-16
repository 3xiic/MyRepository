package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Esta clase mostrara nuestra ventana Principal, el menu
 * @author Esteban Mejia
 *
 */
public class Ventana extends JFrame{
/**
 * Variable la cual dara el titulo del menu
 */
	private JLabel titulo;
	/**
	 * Variables el cual se asignan los botones del menu
	 */
	private JButton anadir,quitar,mostrar;
/**
 * Este sera nuestro metodo constructor de la clase Ventana
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
		titulo.setText("Mascoteria");
		titulo.setFont(new Font("Serif", Font.PLAIN, 30));
		titulo.setBounds(185,0,200,100);
		add(titulo);

		anadir= new JButton();
		anadir.setText("Perros");
		anadir.setFont(new Font("Serif", Font.PLAIN, 15));
		anadir.setActionCommand("PERROS");
		anadir.setBounds(150,100,200,50);
		anadir.setBackground(Color.WHITE);
		add(anadir);
		
		quitar= new JButton();
		quitar.setText("Gatos");
		quitar.setFont(new Font("Serif", Font.PLAIN, 15));
		quitar.setBackground(new Color(246,226,195));
		quitar.setActionCommand("GATOS");
		quitar.setBounds(150,150,200,50);
		add(quitar);
		
		mostrar= new JButton();
		mostrar.setText("Mostrar visitantes actuales");
		mostrar.setFont(new Font("Serif", Font.PLAIN, 15));
		mostrar.setActionCommand("MOSTRAR");
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
