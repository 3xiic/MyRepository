package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImagenMenuPrincipal extends JPanel{
private JLabel lblIm;

public PanelImagenMenuPrincipal() {
	setLayout(new FlowLayout());
	setSize(1080,772);
	inicializarComponentes();
	setVisible(true);

}

public void inicializarComponentes() {
setBackground(Color.WHITE);
	
	lblIm= new JLabel();
	add(lblIm);
	
	ImageIcon im= new ImageIcon(getClass().getResource("/imagenes/MenuPrincipal.jpg"));
	ImageIcon icono= new ImageIcon(im.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
	lblIm.setIcon(icono);
}
	
}
