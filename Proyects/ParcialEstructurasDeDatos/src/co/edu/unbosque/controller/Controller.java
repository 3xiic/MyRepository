package co.edu.unbosque.controller;

import co.edu.unbosque.model.ConjuntoResidencial;
import co.edu.unbosque.view.Console;

public class Controller {
	ConjuntoResidencial cR;
	Console c;
	
	public Controller() {
		cR = new ConjuntoResidencial();
		c= new Console();
		init();
	}
	public void init() {
		c.mostrarInfo("Digite el nombre del conjunto");
		cR.setNombre(c.leerString());
		c.mostrarInfo("Digita la direccion del Conjunto");
		cR.setDireccion(c.leerString());
		c.mostrarInfo("Digita el nombre del administrador");
		cR.setAdministrador(c.leerString());
		menu();
	}
	public void menu() {
		c.mostrarInfo(c.menu());
		int o= c.leerInt();
		while(o!=0) {
			switch(o) {
			case 1:
				c.mostrarInfo("Digita el valor de la torre 1");
				int valor1= c.leerInt();
				cR.asignarValor(1, valor1);
				c.mostrarInfo("Digita el valor de la torre 2");
				int valor2= c.leerInt();
				cR.asignarValor(2, valor2);
				c.mostrarInfo("Digita el valor de la torre 3");
				int valor3= c.leerInt();
				cR.asignarValor(3, valor3);
				c.mostrarInfo(cR.leerCuotas());
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			case 2:
				c.mostrarInfo("Ingresa el valor que quieres que la cuota aumente mensualmente");
				int valorM = c.leerInt();
				c.mostrarInfo(cR.aumentarMes(valorM));
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			case 3:
				c.mostrarInfo("Ingresa el valor que deseas que aumente anualmente");
				int valorA = c.leerInt();
				cR.aumentarAnual(valorA);
				c.mostrarInfo("Valor aumentado con exito");
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			case 4:
				c.mostrarInfo("El conjunto "+cR.getNombre()+" ubicado en "+cR.getDireccion()+" dirigido por: "+cR.getAdministrador()+" Se distribuye de la siguiente manera:");
				c.mostrarInfo(cR.leerCuotas());
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			case 5:
				c.mostrarInfo("Ingresa la torre a la que quieres saber el valor de cuota");
				int t= c.leerInt();
				c.mostrarInfo(cR.mostrarCuotas(t));
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			default:
				c.mostrarInfo("Ingresa una opcion valida");
				c.mostrarInfo(c.menu());
				o=c.leerInt();
				break;
			}
		}
	}
	
}
