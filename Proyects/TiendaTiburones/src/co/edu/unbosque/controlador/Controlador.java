package co.edu.unbosque.controlador;


import co.edu.unbosque.modelo.ProductoDAO;
import co.edu.unbosque.modelo.ProductoDTO;
import co.edu.unbosque.vista.Consola;

public class Controlador {

	private Consola miconsola;
	private ProductoDAO productoDAO;

	public Controlador() {
		productoDAO= new ProductoDAO();
		miconsola= new Consola();
	}

	public Consola getMiconsola() {
		return miconsola;
	}

	public void setMiconsola(Consola miconsola) {
		this.miconsola = miconsola;
	}

	public void mostrarMenu() {
		boolean ejecutando = true;
		while (ejecutando) {
			miconsola.imprimirString("bienvenido a la tienda tiburones \n " + "1) crear 2) eliminar 3) mostrar 4) actualizar");
			String op = miconsola.leerTexto();

			switch (op) {
			case "1":
				miconsola.imprimirString("Nuevo producto");
				miconsola.imprimirString("Inserte nombre del producto");
				String nombre= miconsola.leerTexto();
				miconsola.imprimirString("Inserte precio del producto");
				double precio= miconsola.leerDoble();
				miconsola.leerTexto();
				productoDAO.crear(new ProductoDTO(nombre,precio));
				miconsola.imprimirString("Dato insertado con exito");
				break;
			case "2":

				break;
			case "3":
				miconsola.imprimirString(productoDAO.mostrar());

				break;
			case "4":
				break;
			default:
				ejecutando = false;
				break;
			}
		}
	}

}
