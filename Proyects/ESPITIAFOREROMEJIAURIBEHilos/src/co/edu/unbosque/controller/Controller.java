package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console console;
	private Bank bank;
	private Customer customers[];
	private int q;
	
	public Controller() {
		init();
		exe();
	}
	
	public void init() {
		console = new Console();
		//Cantidad de cajeros
		do {
			console.printMessage("Bienvenido elija la cantidad de cajeros automáticos que requiere su banco (Un número entero positivo)");
			q = console.parse(console.readString());
		}while(q<=0);
		
		//Variables
		customers = new Customer[30];
		bank = new Bank(q);
		
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer(i+1);
		}
	}
	
	public void exe() {
		int i = 0;
		
		for (int j = 0; j < 30; j++) {
			//System.out.println(i);
			customers[j].start();
			try {
				Thread.sleep(2000);
				synchronized (Bank.getAtms()[i]) {
					if (!Bank.getAtms()[i].isOccupied()) {				
						Bank.getAtms()[i].notify();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			if ((i+1) > Bank.getAtms().length-1) {
				i = 0;
			} else {					
				i++;
			}
		}
	}

}
