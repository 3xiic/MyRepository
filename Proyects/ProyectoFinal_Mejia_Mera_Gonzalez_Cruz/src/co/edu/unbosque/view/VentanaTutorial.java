package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaTutorial extends JFrame{
	private JLabel lblImagen;
	

	public VentanaTutorial() {
		setTitle("Tutorial");
		setSize(1308,738);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(146,176,3));
		getContentPane().setLayout(new BorderLayout());


		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void inicializarComponentes() {
		lblImagen= new JLabel();
		ImageIcon im= new ImageIcon(getClass().getResource("/imagenes/Tutorial.jpg"));
		ImageIcon icono= new ImageIcon(im.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		lblImagen.setIcon(icono);
		lblImagen.setBounds(500,302,300,50);
		add(lblImagen, BorderLayout.CENTER);
}
}
