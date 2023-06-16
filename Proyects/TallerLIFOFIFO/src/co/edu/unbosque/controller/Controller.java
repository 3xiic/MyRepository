package co.edu.unbosque.controller;

import co.edu.unbosque.model.DistributionDAOImp;
import co.edu.unbosque.model.RequestDAOImp;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console c;
	private DistributionDAOImp distribution;
	private RequestDAOImp request;
	
	public Controller() {
		c = new Console();
		distribution = new DistributionDAOImp();
		request = new RequestDAOImp();
		init();
	}
	
	public void init() {
		boolean cond = true;
		while (cond) {
			c.printStringln("Bienvenido a TRANSPOR-MINUTE!! Que desea hacer?");
			c.printStringln(" 1. Registrar solicitud. \n 2. Mostrar todas las solicitudes. \n 3. Generar la distribucion de solicitudes.\n 4. Listar la forma en que se distribuyeron las actividades del dia \n 5. Reportes de cada vehiculo.\n 0. Salir");
			int a = c.nextInt();
			switch (a) {
			case 1:
				c.printStringln(" Ingrese el nit del cliente:");
				String nit = c.nextLine();
				int sel = 0;				
				c.printStringln(" Seleccione el tipo de servicio (Escriba 1 para mercancia y 2 para dinero):");
				sel = c.nextInt();
				if (sel > 2 || sel < 1) {
					c.printStringln("Solo debe escribir numeros, ya sea 1 o 2!!");
					cond = false;
					init();
					break;
				}
				String type = "";
				if (sel == 1) {
					type = "MERCANCIA";
				} else {
					type = "DINERO";
				}
				c.printStringln(" Ingrese la direccion del destino:");
				String address = c.nextLine();
				String sector = "";
				c.printStringln(" Seleccione el sector del destino: \n 1. Norte. \n 2. Sur. \n 3. Oriente. \n 4. Occidente.");
				switch (c.nextInt()) {
				case 1:
					sector = "NORTE";
					break;
				case 2:
					sector = "SUR";
					break;
				case 3:
					sector = "ORIENTE";
					break;
				case 4:
					sector = "OCCIDENTE";
					break;
				default:
					c.printStringln("Opcion invalida, intente de nuevo!");
					cond = false;
					init();
					break;
				}
				request.create(nit, type, address, sector);
				cond = false;
				init();
				break;
			case 2:
				c.printStringln(request.show());
				cond = false;
				init();
				break;
			case 3:
				if (distribution.generateDistribution(request.getList())) c.printStringln(" Distribución de solicitudes generada!! \n");
				else c.printStringln(" La distribución de solicitudes no pudo ser generada!! \n");
				cond = false;
				init();
				break;
			case 4:
				c.printStringln(distribution.showInitialDistribution());
				cond = false;
				init();
				break;
			case 5:
				c.printStringln(distribution.showReports());
				cond = false;
				init();
				break;
			case 0:
				cond = false;
				break;
			default:
				c.printStringln("Opcion invalida");
				cond = false;
				init();
				break;
			}
		}
	}
}
