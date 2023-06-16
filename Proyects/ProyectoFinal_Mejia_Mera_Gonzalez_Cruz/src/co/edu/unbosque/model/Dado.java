package co.edu.unbosque.model;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {
	private JLabel Cara1,Cara2,Cara3,Cara4,Cara5,Cara6;
	int Numero;
	
	public Dado() {
		Cara1= new JLabel();
		Cara2= new JLabel();
		Cara3= new JLabel();
		Cara4= new JLabel();
		Cara5= new JLabel();
		Cara6= new JLabel();
		Imagenes();
	}
	
	public void Imagenes() {
		
		

		ImageIcon im= new ImageIcon(getClass().getResource("/imagenes/Dado1.jpg"));
		ImageIcon icono= new ImageIcon(im.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara1.setIcon(icono);
		
	

		ImageIcon im2= new ImageIcon(getClass().getResource("/imagenes/Dado2.jpg"));
		ImageIcon icono2= new ImageIcon(im2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara2.setIcon(icono2);
		
		

		ImageIcon im3= new ImageIcon(getClass().getResource("/imagenes/Dado3.jpg"));
		ImageIcon icono3= new ImageIcon(im3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara3.setIcon(icono3);
		
		

		ImageIcon im4= new ImageIcon(getClass().getResource("/imagenes/Dado4.jpg"));
		ImageIcon icono4= new ImageIcon(im4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara4.setIcon(icono4);
		
		

		ImageIcon im5= new ImageIcon(getClass().getResource("/imagenes/Dado5.jpg"));
		ImageIcon icono5= new ImageIcon(im5.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara5.setIcon(icono5);
		
		

		ImageIcon im6= new ImageIcon(getClass().getResource("/imagenes/Dado6.jpg"));
		ImageIcon icono6= new ImageIcon(im6.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Cara6.setIcon(icono6);
	}
	public JLabel getCara1() {
		return Cara1;
	}
	public void setCara1(JLabel cara1) {
		Cara1 = cara1;
	}
	public JLabel getCara2() {
		return Cara2;
	}
	public void setCara2(JLabel cara2) {
		Cara2 = cara2;
	}
	public JLabel getCara3() {
		return Cara3;
	}
	public void setCara3(JLabel cara3) {
		Cara3 = cara3;
	}
	public JLabel getCara4() {
		return Cara4;
	}
	public void setCara4(JLabel cara4) {
		Cara4 = cara4;
	}
	public JLabel getCara5() {
		return Cara5;
	}
	public void setCara5(JLabel cara5) {
		Cara5 = cara5;
	}
	public JLabel getCara6() {
		return Cara6;
	}
	public void setCara6(JLabel cara6) {
		Cara6 = cara6;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	

}
