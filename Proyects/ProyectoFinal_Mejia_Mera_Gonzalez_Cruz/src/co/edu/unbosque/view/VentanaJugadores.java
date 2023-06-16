package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaJugadores extends JFrame{
	private JButton btnJugador1,btnJugador2,btnJugador3,btnJugador4;
	private JLabel  lblJugadores;


	public VentanaJugadores() {
		setTitle("Cantidad Jugadores");
		setSize(700,420);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(187,235,16));
		getContentPane().setLayout(null);



		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}


	public void inicializarComponentes() {

		lblJugadores= new JLabel();
		lblJugadores.setText("Elija el numero de jugadores");
		lblJugadores.setFont(new Font("Serif", Font.PLAIN, 24));
		lblJugadores.setBounds(225,50,300,50);

		btnJugador1= new JButton();
		btnJugador1.setText("Un jugador");
		btnJugador1.setActionCommand("JUGADOR1");
		btnJugador1.setBackground(Color.WHITE);
		btnJugador1.setForeground(Color.BLACK);
		btnJugador1.setBounds(210,100,300,50);

		btnJugador2= new JButton();
		btnJugador2.setText("Dos jugadores");
		btnJugador2.setActionCommand("JUGADOR2");
		btnJugador2.setBackground(Color.WHITE);
		btnJugador2.setForeground(Color.BLACK);
		btnJugador2.setBounds(210,150,300,50);

		btnJugador3= new JButton();
		btnJugador3.setText("Tres jugadores");
		btnJugador3.setActionCommand("JUGADOR3");
		btnJugador3.setBackground(Color.WHITE);
		btnJugador3.setForeground(Color.BLACK);
		btnJugador3.setBounds(210,200,300,50);

		btnJugador4= new JButton();
		btnJugador4.setText("Cuatro jugadores");
		btnJugador4.setActionCommand("JUGADOR4");
		btnJugador4.setBackground(Color.WHITE);
		btnJugador4.setForeground(Color.BLACK);
		btnJugador4.setBounds(210,250,300,50);

		add(lblJugadores);
		add(btnJugador1);
		add(btnJugador2);
		add(btnJugador3);
		add(btnJugador4);

	}


	public JButton getBtnJugador1() {
		return btnJugador1;
	}


	public void setBtnJugador1(JButton btnJugador1) {
		this.btnJugador1 = btnJugador1;
	}


	public JButton getBtnJugador2() {
		return btnJugador2;
	}


	public void setBtnJugador2(JButton btnJugador2) {
		this.btnJugador2 = btnJugador2;
	}


	public JButton getBtnJugador3() {
		return btnJugador3;
	}


	public void setBtnJugador3(JButton btnJugador3) {
		this.btnJugador3 = btnJugador3;
	}


	public JButton getBtnJugador4() {
		return btnJugador4;
	}


	public void setBtnJugador4(JButton btnJugador4) {
		this.btnJugador4 = btnJugador4;
	}


	public JLabel getLblJugadores() {
		return lblJugadores;
	}


	public void setLblJugadores(JLabel lblJugadores) {
		this.lblJugadores = lblJugadores;
	}



}
