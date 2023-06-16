package co.edu.unbosque.view;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 * En esta clase crearemosla ventana e la que mostraran todos los animales que se encuetran actualmente en la clinica
 * @author Esteba Mejia
 *
 */
public class VMostrar extends JFrame{
	/**
	 * Variables respecto a los Labels para separar los gatos y perros
	 */
	private JLabel texto,perros,gatos;
	/**
	 * Este sera nuestro metodo constructor de la clase VMostrar
	 */
	public VMostrar() {
		setSize(800,300);
		setResizable(false);
		setLayout(null);
		inicializarComponentes();
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(252,246,241));
		setVisible(false);
	}
	/**
	 * Aca inicializaremos, nuestras distintas variables
	 */
	public void inicializarComponentes() {
		texto= new JLabel();
		texto.setText("Mascotas en la veterinaria");
		texto.setBounds(310,0,400,30);
		add(texto);

		perros= new JLabel();
		perros.setText("Perros");
		perros.setBounds(600,10,400,30);
		add(perros);

		gatos= new JLabel();
		gatos.setText("Gatos");
		gatos.setBounds(20,10,400,30);
		add(gatos);

	}



}
