package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Clase que maneja la escritura de datos y persistencia
 */
public class FileHandler {
	/**
	 * Scanner que lee datos
	 */
	private Scanner reader;
	/**
	 * Archivo donde se guardan los datos
	 */
	private File file;
	/**
	 * Escritor
	 */
	private PrintWriter writer;
	/**
	 * Metodo constructor
	 * @param url es la url
	 */
	public FileHandler(String url) {
		file = new File("src/co/edu/unbosque/model/persistence/"+url);		
	}
	/**
	 * Metodo que lee el archivo de datos y en caso de no encontrar el archivo lanza una notificacion
	 * @return retorna los datos
	 */
	public String read() {
		StringBuilder sb = new StringBuilder();
		try {
			reader = new Scanner(file);
			while(reader.hasNext()) {
				sb.append(reader.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, null, "Quejeso pa????", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		reader.close();
		return sb.toString();
	}
	/**
	 * Metodo que crea o escribe el archivo de datos y en caso de no encontrar el archivo lanza una notificacion
	 * @param contenido es el string a escribir
	 */
	public void write(String contenido) {
		try {
			writer = new PrintWriter(file);
			writer.print(contenido);
			writer.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, null, "No hay archivo pa", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	
	
}
