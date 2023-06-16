package co.edu.unbosque.view;

import javax.swing.JOptionPane;
/**
 * Vista interactiva
 * @author Camilo Uribe
 * @author Esteban Mejia
 *
 */
public class View {
	/**
	 * Metodo para mostrar informacion
	 * @param sb Es el stringbuilder que concatena la info
	 */
	public void showInfo(StringBuilder sb) {
		JOptionPane.showMessageDialog(null, sb);
	}
	/**
	 * Metodo para mostrar informacion
	 * @param s es el String que muestra info
	 */
	public void showInfoS(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	/**
	 * Metodo que muestra un espacio para ingresar datos
	 * @param s Es el texto que se muestra para ingresar datos
	 * @return Este metodo retorna una ventana de dialogo que permite ingresar datos
	 */
	public String insertInfo(String s) {
		return JOptionPane.showInputDialog(s);
	}
	/**
	 * Metodo que muestra el menu interactivo
	 * @return retorna el menu
	 */
	public String menu() {
		return "Holaa, ingresa la opcion que deseas!"+"\n"+
				"1-Agregar Estudiante"+"\n"+
				"2-Actualizar Estudiante"+"\n"+
				"3-Eliminar Estudiante"+"\n"+
				"4-Agregar Administrativo"+"\n"+
				"5-Actualizar Administrativo"+"\n"+
				"6-Eliminar Administrativo"+"\n"+
				"7-Agregar Candidato"+"\n"+
				"8-Actualizar Candidato"+"\n"+
				"9-Eliminar Candidato"+"\n"+
				"10-Mostrar todo"+"\n"+
				"11-Mostrar Estudiantes"+"\n"+
				"12-Mostrar Administrativos"+"\n"+
				"13-Mostrar Candidatos"+"\n"+
				"0-Salir";
	}
}
