package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.model.*;

public class PanelTablero extends JPanel{
private String Casillas[][];


public PanelTablero() {
	setSize(500,500);
	setLayout(new GridLayout(8, 8));
	inicializarComponentes();
	setVisible(true);
}
public void inicializarComponentes() {
	
	Casillas = new String[8][8];
	for(int y=0; y < Casillas.length; y++) {
		for(int x=0; x < Casillas[y].length; x++) {
			 JButton casilla = new JButton(Casillas[y][x]);
			add(casilla);
			if((y+x+1)%2==0){

				casilla.setBackground(Color.GREEN);
			}else{

				casilla.setBackground(Color.ORANGE);
			}
		}
	}

	
}
}

