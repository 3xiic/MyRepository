package co.edu.unbosque.controller;

import co.edu.unbosque.model.ClienteDAOimpl;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console c;
	private ClienteDAOimpl cDAO;
	
	public Controller() {
		c = new Console();
		c.imprimirStringln("Ingrese el numero maximo de clientes:");
		cDAO = new ClienteDAOimpl(c.leerInt());
		init();
	}
	
	public void init() {
		boolean cond = true;
		while (cond) {
			c.imprimirStringln("Bienvenido!! Que desea hacer?");
			c.imprimirStringln(" 1. Ingresar Vehiculo\n 2. Actualizar avance del Trabajo\n 3. Retirar Carro\n 4. Pagar \n 5. Consultar Estado de un vehiculo\n 6. Mostrar todos los clientes\n 7. Mostrar clientes retirados \n 0. Salir");
			int a = c.leerInt();
			switch (a) {
			case 1:
				c.imprimirStringln(" Ingrese el nombre del cliente:");
				String n = c.leerStringln().toUpperCase();
				c.imprimirStringln(" Ingrese el id:");
				String id = c.leerStringln();
				c.imprimirStringln(" Ingrese el celular:");
				String cel = c.leerStringln();
				c.imprimirStringln(" Ingrese el valor del servicio:");
				int val = c.leerInt();
				c.imprimirStringln(" Ingrese la placa del carro:");
				String placa = c.leerStringln().toUpperCase();
				c.imprimirStringln(" Ingrese la seccion a la que ingresa el vehiculo: \n 1.Mecanica \n 2.Latoneria \n 3.Pintura");
				String secc="";
				switch (c.leerInt()) {
				case 1:
					secc = "Mecanica";
					break;
				case 2:
					secc = "Latoneria";				
					break;
				case 3:					
					secc = "Pintura";				
					break;
				default:
					c.imprimirStringln(" Opcion invalida!!");
					break;
				}
				if (cDAO.agregarCliente(n, id, cel, val, placa, secc)) {
					c.imprimirStringln("Cliente agregado con exito!!");
				} else {
					c.imprimirStringln("No se pudo agregar el cliente, revise los datos ingresados!!");					
				}
				cond = false;
				init();
				break;
			case 2:
				c.imprimirStringln(" Ingrese la placa del vehiculo:");
				String p = c.leerStringln();
				c.imprimirStringln(" A cual estado desea cambiar?");
				c.imprimirStringln("  1. Iniciando \n  2. Medio \n  3. Terminado");
				boolean cambiado = false;
				switch (c.leerInt()) {
				case 1:
					cambiado = cDAO.actualizarEstado(p, "INICIANDO");
					break;
				case 2:
					cambiado = cDAO.actualizarEstado(p, "MEDIO");					
					break;
				case 3:					
					cambiado = cDAO.actualizarEstado(p, "TERMINADO");					
					break;
				default:
					c.imprimirStringln(" Opcion invalida!!");
					break;
				}
				if (cambiado) {
					c.imprimirStringln(" Estado actualizado con exito!!");
				}
				cond = false;
				init();
				break;
			case 3:
				c.imprimirStringln("Ingrese la placa del vehiculo a retirar:");
				String pr = c.leerStringln();
				if (cDAO.retirarCarro(pr)) c.imprimirStringln(" Retirado con exito!!");
				else c.imprimirStringln(" Retiro fallido!!");
				cond = false;
				init();
				break;
			case 4:
				c.imprimirStringln("Ingrese el id del cliente:");
				String idCli = c.leerStringln();
				c.imprimirStringln("Ingrese el valor a pagar:");
				int valorP = c.leerInt();
				c.imprimirStringln(cDAO.pagar(idCli, valorP));
				cond = false;
				init();
				break;
			case 5:
				c.imprimirStringln("Digite el id del propietario del vehiculo:");
				String idm = c.leerStringln();
				c.imprimirStringln(cDAO.mostrarInfo(idm));
				cond = false;
				init();
				break;
			case 6:
				c.imprimirStringln(cDAO.mostrarInfoTodos());
				cond = false;
				init();
				break;
			case 7:
				c.imprimirStringln(cDAO.mostrarInfoRetirados());
				cond = false;
				init();
				break;
			case 0:
				cond = false;
				break;
			default:
				System.out.println("Opcion invalida");
				cond = false;
				init();
				break;
			}
		}
	}
}
