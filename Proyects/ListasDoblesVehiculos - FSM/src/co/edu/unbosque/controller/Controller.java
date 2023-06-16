package co.edu.unbosque.controller;

import co.edu.unbosque.model.Lista;
import co.edu.unbosque.model.Vehiculo;
import co.edu.unbosque.view.Console;

public class Controller {
	private Lista list;
	private Console c;
	private String placa;
	private String propietario;
	private String ciudad;
	private String modelo;
	
	public Controller() {
		list = new Lista();
		c = new Console();
		init();
	}
	
	private void init() {
		boolean cond = true;
		while (cond) {
			c.imprimirStringln("Bienvenido!! Que desea hacer?");
			c.imprimirStringln(" 1. Ingresar Vehiculo\n 2. Imprimir Lista\n 3. Buscar vehiculo por placa\n 4. Insertar vehiculo despues de un modelo de carro dado \n 5. Eliminar un vehiculo de la lista segun la placa\n 6. Ordenar la lista por orden ascendente (Placa)\n 7. Ordenar la lista por orden descendente (Modelo)\n 0. Salir");
			int a = c.leerInt();
			switch (a) {
			case 1:
				c.imprimirStringln("Digite la placa del vehiculo:");
				placa = c.leerStringln();
				c.imprimirStringln("Digite el modelo del vehiculo:");
				modelo = c.leerStringln();
				c.imprimirStringln("Digite la ciudad de matricula del vehiculo:");
				ciudad = c.leerStringln();
				c.imprimirStringln("Digite el nombre del propietario del vehiculo:");
				propietario = c.leerStringln();
				Vehiculo v = new Vehiculo(placa, modelo, ciudad, propietario);
				if(list.revisarExistente(v)) {
					c.imprimirStringln("Ya existe el vehiculo!");
				}else {
					list.insertar(v);					
				}
				cond = false;
				init();
				break;
			case 2:
				list.imprimirlista();
				cond = false;
				init();
				break;
			case 3:
				c.imprimirStringln("Digite la placa del vehiculo a buscar:");
				placa = c.leerStringln();
				list.buscarVehiculo(placa);
				cond = false;
				init();
				break;
			case 4:
				c.imprimirStringln("Digite la placa del nuevo vehiculo:");
				placa = c.leerStringln();
				c.imprimirStringln("Digite el modelo del nuevo vehiculo:");
				modelo = c.leerStringln();
				c.imprimirStringln("Digite la ciudad de matricula del nuevo vehiculo:");
				ciudad = c.leerStringln();
				c.imprimirStringln("Digite el nombre del propietario del nuevo vehiculo:");
				propietario = c.leerStringln();
				c.imprimirStringln("Digite el modelo de vehiculo que ira antes:");
				String modelo_aux = c.leerStringln();
				Vehiculo v1 = new Vehiculo(placa, modelo, ciudad, propietario);
				if(list.revisarExistente(v1)) {
					c.imprimirString("Ya existe el vehiculo!");
				}else {
					list.insertarpost(modelo_aux,v1);					
				}
				cond = false;
				init();
				break;
			case 5:
				c.imprimirStringln("Digite la placa del vehiculo a eliminar:");
				placa = c.leerStringln();
				c.imprimirStringln(list.eliminar(placa));
				cond = false;
				init();
				break;
			case 6:
				list.imprimirAscendentePlaca();
				cond = false;
				init();
				break;
			case 7:
				list.imprimirDescendenteModelo();
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
