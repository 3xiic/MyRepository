package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
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
	 * Variables respecto a los Labels para separar los animales y personas
	 */
	private JLabel texto,personas,animales,fanimales,fpersonas;
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
		texto.setText("Personas y animales");
		texto.setBounds(310,0,400,30);
		add(texto);

		fanimales=new JLabel();
		fanimales.setFont(new Font("Serif", Font.PLAIN, 12));
		fanimales.setText("Nombre  Alimentacion Habitad  Nivel de extincion");
		fanimales.setBounds(20,40,400,10);
		add(fanimales);

		fpersonas=new JLabel();
		fpersonas.setFont(new Font("Serif", Font.PLAIN, 12));
		fpersonas.setText("Nombre  Edad Fecha de Nacimiento  Altura");
		fpersonas.setBounds(550,40,400,10);
		add(fpersonas);

		personas= new JLabel();
		personas.setText("Personas");
		personas.setBounds(620,10,400,30);
		add(personas);

		animales= new JLabel();
		animales.setText("Animales");
		animales.setBounds(90,10,400,30);
		add(animales);

	}



}
