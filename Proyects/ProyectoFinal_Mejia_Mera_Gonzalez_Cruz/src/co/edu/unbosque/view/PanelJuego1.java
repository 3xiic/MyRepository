package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.*;


import javax.swing.*;

import co.edu.unbosque.model.Dado;
import co.edu.unbosque.model.*;

public class PanelJuego1 extends JFrame{
	private PanelTablero Tb;
	private JLabel lblDado1,lblDado2,lblDado3,lblDado4,lblDado5,lblDado6;
	private JButton btnJugar;
	private Jugador2 P2;
	private Jugador3 P3;
	private Jugador4 P4;
	private Dado D;
	private JLabel lblPuntaje,lblPuntaje2,lblPuntaje3,lblPuntaje4;
	private JLabel lblIP1,lblIP2,lblIP3,lblIP4;
	private Jugador1 P1;
	
	public PanelJuego1() {
		setTitle("Juego");
		setSize(800,600);
		setLayout(null);
		

		inicializarComponentes();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}


	public void  inicializarComponentes() {
		D= new Dado();
		P1= new Jugador1();
		P2= new Jugador2();
		P3= new Jugador3();
		P4= new Jugador4();
		
		lblPuntaje= new JLabel();
		lblPuntaje.setFont(new Font("Serif", Font.PLAIN, 20));
	
		lblPuntaje.setText(P1.getNombre()+P1.getPuntaje());
		lblPuntaje.setVisible(true);
		lblPuntaje.setBounds(500,100,300,50);
		add(lblPuntaje);
		
		lblIP1= new JLabel();
		lblIP1=P1.getImagen();
		lblIP1.setBounds(670,100,100,100);
		lblIP1.setVisible(true);
		add(lblIP1);
		
		lblPuntaje2= new JLabel();
		lblPuntaje2.setFont(new Font("Serif", Font.PLAIN, 20));
	
		lblPuntaje2.setText(P2.getNombre()+P2.getPuntaje());
		lblPuntaje2.setVisible(true);
		lblPuntaje2.setBounds(500,200,300,50);
		add(lblPuntaje2);
		
		lblIP2= new JLabel();
		lblIP2=P2.getImagen();
		lblIP2.setBounds(670,200,100,100);
		lblIP2.setVisible(true);
		add(lblIP2);
		

		lblPuntaje3= new JLabel();
		lblPuntaje3.setFont(new Font("Serif", Font.PLAIN, 20));
	
		lblPuntaje3.setText(P3.getNombre()+P3.getPuntaje());
		lblPuntaje3.setVisible(true);
		lblPuntaje3.setBounds(500,300,300,50);
		add(lblPuntaje3);
		
		lblIP3= new JLabel();
		lblIP3=P3.getImagen();
		lblIP3.setBounds(670,300,100,100);
		lblIP3.setVisible(true);
		add(lblIP3);
		

		lblPuntaje4= new JLabel();
		lblPuntaje4.setFont(new Font("Serif", Font.PLAIN, 20));
	
		lblPuntaje4.setText(P4.getNombre()+P4.getPuntaje());
		lblPuntaje4.setVisible(true);
		lblPuntaje4.setBounds(500,400,300,50);
		add(lblPuntaje4);
		
		lblIP4= new JLabel();
		lblIP4=P4.getImagen();
		lblIP4.setBounds(670,400,100,100);
		lblIP4.setVisible(true);
		add(lblIP4);
		
		
	
		Tb= new PanelTablero();
		Tb.setBounds(0,0,500,500);
		add(Tb);
		
		
		

		btnJugar= new JButton();
		btnJugar.setText("Tirar Dado");
		btnJugar.setActionCommand("Tirar Dado");
		btnJugar.setBounds(0,500,300,50);
		add(btnJugar);
		
		lblDado1= new JLabel();
		lblDado1=D.getCara1();
		lblDado1.setBounds(400,500,50,50);
		lblDado1.setVisible(false);
		add(lblDado1);
		
		lblDado2= new JLabel();
		lblDado2=D.getCara2();
		lblDado2.setBounds(400,500,50,50);
		lblDado2.setVisible(false);
		add(lblDado2);
		
		lblDado3= new JLabel();
		lblDado3=D.getCara3();
		lblDado3.setBounds(400,500,50,50);
		lblDado3.setVisible(false);
		add(lblDado3);
		
		lblDado4= new JLabel();
		lblDado4=D.getCara4();
		lblDado4.setBounds(400,500,50,50);
		lblDado4.setVisible(false);
		add(lblDado4);
		
		lblDado5= new JLabel();
		lblDado5=D.getCara5();
		lblDado5.setBounds(400,500,50,50);
		lblDado5.setVisible(false);
		add(lblDado5);
		
		lblDado6= new JLabel();
		lblDado6=D.getCara6();
		lblDado6.setBounds(400,500,50,50);
		lblDado6.setVisible(false);
		add(lblDado6);
		
		
		
		
}


	




	public JLabel getLblIP2() {
		return lblIP2;
	}


	public void setLblIP2(JLabel lblIP2) {
		this.lblIP2 = lblIP2;
	}


	public JLabel getLblIP3() {
		return lblIP3;
	}


	public void setLblIP3(JLabel lblIP3) {
		this.lblIP3 = lblIP3;
	}


	public JLabel getLblIP4() {
		return lblIP4;
	}


	public void setLblIP4(JLabel lblIP4) {
		this.lblIP4 = lblIP4;
	}


	public Jugador3 getP3() {
		return P3;
	}


	public void setP3(Jugador3 p3) {
		P3 = p3;
	}


	public Jugador4 getP4() {
		return P4;
	}


	public void setP4(Jugador4 p4) {
		P4 = p4;
	}


	public JLabel getLblIP1() {
		return lblIP1;
	}


	public void setLblIP1(JLabel lblIP1) {
		this.lblIP1 = lblIP1;
	}


	public JLabel getLblPuntaje3() {
		return lblPuntaje3;
	}


	public void setLblPuntaje3(JLabel lblPuntaje3) {
		this.lblPuntaje3 = lblPuntaje3;
	}


	public JLabel getLblPuntaje4() {
		return lblPuntaje4;
	}


	public void setLblPuntaje4(JLabel lblPuntaje4) {
		this.lblPuntaje4 = lblPuntaje4;
	}


	public Jugador2 getP2() {
		return P2;
	}


	public void setP2(Jugador2 p2) {
		P2 = p2;
	}


	public JLabel getLblPuntaje2() {
		return lblPuntaje2;
	}


	public void setLblPuntaje2(JLabel lblPuntaje2) {
		this.lblPuntaje2 = lblPuntaje2;
	}


	public JLabel getLblPuntaje() {
		return lblPuntaje;
	}


	public void setLblPuntaje(JLabel lblPuntaje) {
		this.lblPuntaje = lblPuntaje;
	}


	public Jugador1 getP1() {
		return P1;
	}


	public void setP1(Jugador1 p1) {
		P1 = p1;
	}


	public JLabel getLblDado2() {
		return lblDado2;
	}


	public void setLblDado2(JLabel lblDado2) {
		this.lblDado2 = lblDado2;
	}


	public JLabel getLblDado3() {
		return lblDado3;
	}


	public void setLblDado3(JLabel lblDado3) {
		this.lblDado3 = lblDado3;
	}


	public JLabel getLblDado4() {
		return lblDado4;
	}


	public void setLblDado4(JLabel lblDado4) {
		this.lblDado4 = lblDado4;
	}


	public JLabel getLblDado5() {
		return lblDado5;
	}


	public void setLblDado5(JLabel lblDado5) {
		this.lblDado5 = lblDado5;
	}


	public JLabel getLblDado6() {
		return lblDado6;
	}


	public void setLblDado6(JLabel lblDado6) {
		this.lblDado6 = lblDado6;
	}


	public PanelTablero getTb() {
		return Tb;
	}


	public void setTb(PanelTablero tb) {
		Tb = tb;
	}


	public JLabel getLblDado1() {
		return lblDado1;
	}


	public void setLblDado1(JLabel lblDado1) {
		this.lblDado1 = lblDado1;
	}


	public JButton getBtnJugar() {
		return btnJugar;
	}


	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}


	public Dado getD() {
		return D;
	}


	public void setD(Dado d) {
		D = d;
	}
}













