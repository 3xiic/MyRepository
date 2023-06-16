package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.Border;

public class MenuPrincipal extends JFrame{
	private JLabel lblMenu;
	private PanelImagenMenuPrincipal pIM;
	private JButton btnJugar, btnTutorial, btnHistorial;

	public MenuPrincipal() {
		setTitle("MenuPrincipal");
		setSize(1080,772);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(146,176,3));
		getContentPane().setLayout(null);


		inicializarComponentes();

		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	public void inicializarComponentes() {
		pIM= new PanelImagenMenuPrincipal();
		add(pIM);
		btnJugar= new JButton();
		btnJugar.setActionCommand("JUGAR");
		btnJugar.setFocusPainted(true);
		btnJugar.setBorderPainted(true);
		btnJugar.setContentAreaFilled(false);
		btnJugar.setBounds(429,280, 200,70);

		btnTutorial= new JButton();
		btnTutorial.setActionCommand("TUTORIAL");
		btnTutorial.setFocusPainted(false);
		btnTutorial.setBorderPainted(false);
		btnTutorial.setContentAreaFilled(false);
		btnTutorial.setBounds(420,380, 220,70);

		btnHistorial= new JButton();
		btnHistorial.setActionCommand("HISTORIAL");
		btnHistorial.setFocusPainted(false);
		btnHistorial.setBorderPainted(false);
		btnHistorial.setContentAreaFilled(false);
		btnHistorial.setBounds(410,480, 250,70);


		add(btnJugar);
		add(btnTutorial);
		add(btnHistorial);
	}
	

	public JButton getBtnJugar() {
		return btnJugar;
	}
	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}
	public JButton getBtnTutorial() {
		return btnTutorial;
	}
	public void setBtnTutorial(JButton btnTutorial) {
		this.btnTutorial = btnTutorial;
	}
	public JButton getBtnHistorial() {
		return btnHistorial;
	}
	public void setBtnHistorial(JButton btnHistorial) {
		this.btnHistorial = btnHistorial;
	}
}
