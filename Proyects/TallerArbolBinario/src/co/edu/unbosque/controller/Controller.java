package co.edu.unbosque.controller;

import co.edu.unbosque.model.FamilyDAO;
import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.view.Console;

public class Controller {
	
	private FamilyDAO fa; 
	private Console c;
	
	public Controller() {
		fa = new FamilyDAO();
		c = new Console();
		init();
	}
	public void init() {
		c.printStringln(c.menu());
		int n1 = c.nextInt();
		while(n1 != 0) {
			switch(n1) {
			case 1:
				c.printStringln("Ingresa el nombre del padre:");
				String f = c.nextLine().toUpperCase();
				c.printStringln("Ingresa el del hijo:");
				String s = c.nextLine().toUpperCase();
				c.printStringln("Ingresa la edad:");
				int age = c.nextInt();
				c.printStringln("Ingresa el genero:");
				String g = c.nextLine().toUpperCase();
				
				if (fa.getB().add(f, new PersonDTO(s,age,g))) {
					c.printStringln("Agregado con exito!");
				}else {
					c.printStringln("No se pudo agregar!");
				}
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
			case 2:
				if (fa.getB().isEmpty()) {
					c.printStringln("No hay ningun miembro en el arbol familiar");
				} else {					
					c.printStringln(fa.getB().postorden());
				}
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
			case 3:
				c.printStringln("Digita el nombre a buscar!");
				String na = c.nextLine().toUpperCase();
				if(fa.getB().exist(na)) {
					c.printStringln("El usuario "+na+" si existe!");
				}else {
					c.printStringln("El usuario "+na+" no existe!");
				}
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
			case 4:
				c.printStringln("La familia tiene un total de "+fa.getB().getNodes()+ " miembros");
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
			case 5:
				fa.getB().inorden();
				for (int i = 0; i < fa.getB().size(); i++) {
					fa.getbCopy().createCopy(fa.getB().getArr()[i].getObject());
				}
				c.printStringln("Se ha creado una copia del arbol familiar mediante el recorrido inOrden");
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
			case 6:
				c.printStringln("PreOrden");
				c.printStringln(fa.getbCopy().preorden());
				c.printStringln("InOrden");
				c.printStringln(fa.getbCopy().inorden());
				c.printStringln("");
				c.printStringln(c.menu());
				n1 = c.nextInt();
				break;
				
			}
		}
	}
	
	
}
