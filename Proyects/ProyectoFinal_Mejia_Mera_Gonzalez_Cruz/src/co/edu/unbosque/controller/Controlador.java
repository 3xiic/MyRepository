package co.edu.unbosque.controller;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;


public class Controlador implements ActionListener {
	private VentanaJugadores Vj;
	private MenuPrincipal mP;
	private VentanaTutorial Vt;
	private Jugador1 P1;
	private Jugador2 P2;
	private Jugador3 P3;
	private Jugador4 P4;
	private Dado D;
	private int opc;
	private int Pos;
	private Preguntas Pr;
	private PanelJuego1 Pj1;

	public Controlador() {
		mP= new MenuPrincipal();
		Vj= new VentanaJugadores();
		Vt= new VentanaTutorial();
		Pj1= new PanelJuego1();
		P2= new Jugador2();
		Pos=1;
		Pr= new Preguntas();
		P1= new Jugador1();
		P3= new Jugador3();
		P4= new Jugador4();
		D= new Dado();
		opc=0;
		Vt.setVisible(false);
		Vj.setVisible(false);
		Pj1.setVisible(false);

		asignarOyentes();
	}
	public void asignarOyentes() {
		mP.getBtnJugar().addActionListener(this);
		mP.getBtnTutorial().addActionListener(this);
		mP.getBtnHistorial().addActionListener(this);
		Vj.getBtnJugador1().addActionListener(this);
		Pj1.getBtnJugar().addActionListener(this);
		Vj.getBtnJugador2().addActionListener(this);
		Vj.getBtnJugador3().addActionListener(this);
		Vj.getBtnJugador4().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando=e.getActionCommand();
		if(comando.equals("JUGAR")){
			Vj.setVisible(true);	
		}
		else if(comando.equals("JUGADOR1")) {
			P1.setNombre(JOptionPane.showInputDialog(null,"Jugador 1 pon tu nombre "));
			mP.setVisible(false);
			Vj.setVisible(false);
			Pj1.setVisible(true);
			Pj1.getLblPuntaje2().setVisible(false);
			Pj1.getLblPuntaje3().setVisible(false);
			Pj1.getLblPuntaje4().setVisible(false);
			Pj1.getLblIP2().setVisible(false);
			Pj1.getLblIP3().setVisible(false);
			Pj1.getLblIP4().setVisible(false);
		}	
		else if(comando.equals("JUGADOR2")) {
			P1.setNombre(JOptionPane.showInputDialog(null,"Jugador 1 pon tu nombre "));
			P2.setNombre(JOptionPane.showInputDialog(null,"Jugador 2 pon tu nombre "));
			mP.setVisible(false);
			Vj.setVisible(false);
			Pj1.setVisible(true);
			Pj1.getLblPuntaje3().setVisible(false);
			Pj1.getLblPuntaje4().setVisible(false);
			Pj1.getLblIP3().setVisible(false);
			Pj1.getLblIP4().setVisible(false);
			
		}
		else if(comando.equals("JUGADOR3")) {
			P1.setNombre(JOptionPane.showInputDialog(null,"Jugador 1 pon tu nombre "));
			P2.setNombre(JOptionPane.showInputDialog(null,"Jugador 2 pon tu nombre "));
			P3.setNombre(JOptionPane.showInputDialog(null,"Jugador 3 pon tu nombre "));
			mP.setVisible(false);
			Vj.setVisible(false);
			Pj1.setVisible(true);
			Pj1.getLblPuntaje4().setVisible(false);
			Pj1.getLblIP4().setVisible(false);
		}
		else if(comando.equals("JUGADOR4")) {
			P1.setNombre(JOptionPane.showInputDialog(null,"Jugador 1 pon tu nombre "));
			P2.setNombre(JOptionPane.showInputDialog(null,"Jugador 2 pon tu nombre "));
			P3.setNombre(JOptionPane.showInputDialog(null,"Jugador 3 pon tu nombre "));
			P4.setNombre(JOptionPane.showInputDialog(null,"Jugador 4 pon tu nombre "));
			mP.setVisible(false);
			Vj.setVisible(false);
			Pj1.setVisible(true);
			Pj1.getLblIP1().setVisible(true);
		}

		else if(comando.equals("TUTORIAL")) {
			Vt.setVisible(true);

		}
		else if(comando.equals("HISTORIAL")) {
			JOptionPane.showMessageDialog(null,"No sabemos ayuda");
		}
		if(comando.equals("Tirar Dado")) {
			int numero=(int) (Math.random()*6)+1;
			
			if(numero==1) {
				Pj1.getLblDado1().setVisible(true);
				opc= Integer.parseInt(JOptionPane.showInputDialog (null,Pr.Dado1()));
				if(opc>0&&opc<=6) {
					if(opc==4){
						Pos+=numero;
						JOptionPane.showMessageDialog(null, "Correcto");
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrecto");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Digita una opcion valida");
				}
			}
			
			
			else if(numero==2) {
				Pj1.getLblDado1().setVisible(false);
				Pj1.getLblDado2().setVisible(true);
			
			}
			else if(numero==3) {
				Pj1.getLblDado1().setVisible(false);
				Pj1.getLblDado2().setVisible(false);
				Pj1.getLblDado3().setVisible(true);
				
			}
			else if(numero==4) {
				Pj1.getLblDado1().setVisible(false);
				Pj1.getLblDado2().setVisible(false);
				Pj1.getLblDado3().setVisible(false);
				Pj1.getLblDado4().setVisible(true);
				
			}
			else if(numero==5) {
				Pj1.getLblDado1().setVisible(false);
				Pj1.getLblDado2().setVisible(false);
				Pj1.getLblDado3().setVisible(false);
				Pj1.getLblDado4().setVisible(false);
				Pj1.getLblDado5().setVisible(true);
				
			}
			else if(numero==6) {
				Pj1.getLblDado1().setVisible(false);
				Pj1.getLblDado2().setVisible(false);
				Pj1.getLblDado3().setVisible(false);
				Pj1.getLblDado4().setVisible(false);
				Pj1.getLblDado5().setVisible(false);
				Pj1.getLblDado6().setVisible(true);
		
			}
			
			
			Pos+=numero;
			P1.setPuntaje(Pos);
			Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
			Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			Pj1.getLblPuntaje3().setText(P3.getNombre()+": "+P3.getPuntaje());
			Pj1.getLblPuntaje4().setText(P4.getNombre()+": "+P4.getPuntaje());
			
			System.out.println(Pos);
			
			//Escaleras
			if(Pos==6) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 37");
				Pos=37;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==8) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 24");
				Pos=24;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==19) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 51");
				Pos=51;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==23) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 54");
				Pos=54;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==33) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 40");
				Pos=40;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==36) {
				JOptionPane.showMessageDialog(null, "¡Geniaal, te has topado con una escalera!, avanzas hasta la posicion 60");
				Pos=60;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			//Serpientes
			if(Pos==50) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 29");
				Pos=29;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==63) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 18");
				Pos=18;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
				
			}
			if(Pos==45) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 17");
				Pos=17;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==43) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 22");
				Pos=22;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
				}
			if(Pos==55) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 25");
				Pos=25;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(Pos==28) {
				JOptionPane.showMessageDialog(null, "¡Oh no!, has caido en una serpiente, regresas a la posicion 2");
				Pos=2;
				P1.setPuntaje(Pos);
				Pj1.getLblPuntaje().setText(P1.getNombre()+": "+P1.getPuntaje());
				Pj1.getLblPuntaje2().setText(P2.getNombre()+": "+P2.getPuntaje());
			}
			if(P1.getPuntaje()>=64) {
				JOptionPane.showMessageDialog(null, P1.getNombre()+", ha ganado");
				Pj1.getLblPuntaje().setText(P1.getNombre()+" "+"¡Ha ganado!");
			}
			else if(P2.getPuntaje()==64) {
				JOptionPane.showMessageDialog(null, P2.getNombre()+", ha ganado");
				Pj1.getLblPuntaje().setText(P2.getNombre()+" "+"¡Ha ganado!");
			}
				
			}
		}
	}

