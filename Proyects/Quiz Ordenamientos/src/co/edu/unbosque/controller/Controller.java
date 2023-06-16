package co.edu.unbosque.controller;

import co.edu.unbosque.model.ConceptoDAOimpl;
import co.edu.unbosque.view.Console;

public class Controller {
	private ConceptoDAOimpl cDAO;
	private Console c;

	public Controller() {
		cDAO= new ConceptoDAOimpl();
		c= new Console();
		cDAO.loadSerializable();
		run();
	}
	public void run() {
		c.printString(c.menu());
		int n=c.readInt();
		c.burnLine();
		boolean cond=true;
		while(cond) {
			switch(n) {
			case 1:
				c.printString("Digita la palabra");
				String pA=c.readStringLine();
				c.printString("Digita la definicion");
				String dA=c.readStringLine();
				c.printString("Digita el idioma");
				String iA= c.readStringLine();
				if(cDAO.agregar(pA, dA, iA)) {
					c.printString("Agregada exitosamente");
					c.printString("");
				}
				else {
					c.printString("No se pudo agregar, la palabra ya existe");
					c.printString("");
				}
				cond=false;
				run();
				break;
			case 2:
				c.printString("Digita la palabra");
				String pE=c.readStringLine();
				if(cDAO.eliminar(pE)) {
					c.printString("Eliminado exitosamente");	
					c.printString("");
				}else {
					c.printString("No se pudo eliminar, la palabra no existe");
					c.printString("");
				}
				cond=false;
				run();
				break;
			case 3:
				c.printString("Digita la palabra");
				String pAc=c.readStringLine();
				c.printString("Digita la definicion nueva");
				String dAc=c.readStringLine();
				c.printString("Digita el idioma nuevo");
				String iAc= c.readStringLine();
				if(cDAO.actualizar(pAc, dAc, iAc)) {
					c.printString("Actualizado exitosamente");
					c.printString("");
				}else {
					c.printString("No se pudo actualizar, la palabra no existe");
					c.printString("");
				}
				cond=false;
				run();
				break;
			case 4:
				c.printString(cDAO.mostrar());
				cond=false;
				run();
				break;
			case 5:
				cond=false;
				break;
			}
			
		}
	}
}
