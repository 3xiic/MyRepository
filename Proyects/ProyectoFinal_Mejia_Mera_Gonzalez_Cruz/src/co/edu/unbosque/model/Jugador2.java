package co.edu.unbosque.model;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Jugador2 {
	private String Nombre;
	private JLabel Imagen;
	private int Puntaje;
	
	public Jugador2() {
		Nombre = "";
		Imagen = new JLabel();
		Puntaje = 1;
		ImagenP2();
	}
public void ImagenP2() {
		
		ImageIcon im= new ImageIcon(getClass().getResource("/imagenes/P2.png"));
		ImageIcon icono= new ImageIcon(im.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		Imagen.setIcon(icono);
		
	}

	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public JLabel getImagen() {
		return Imagen;
	}

	public void setImagen(JLabel imagen) {
		Imagen = imagen;
	}

	public int getPuntaje() {
		return Puntaje;
	}

	public void setPuntaje(int puntaje) {
		Puntaje = puntaje;
	}
	

}
