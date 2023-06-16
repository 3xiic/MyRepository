package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;
	private boolean burnLine;
	
	public Console() {
		sc= new Scanner(System.in);
		burnLine = false;
	}
	
	public void printString(String str) {
		System.out.print(str);
	}
	
	public void printStringln(String str) {
		System.out.println(str);
	}
	
	public String menu() {
		return "Hola, ingresa la opcion que desees realizar   \n"+
				"1. Insertar miembro de la familia \n"+
				"2. Imprimir el contenido del arbol en PosOrden \n"+
				"3. Verificar si existe la persona \n"+
				"4. Imprimir cuantos miembros existen en la familia \n"+
				"5. Crear una copia del arbol recorriendo en InOrden \n"+
				"6. Imprimir en preOrden e inOrden el arbol copia \n"+
				"0. Salir.";
	}
	
	public int nextInt() {
		int a = 0;
		try {			
			a = sc.nextInt();
			burnLine = true;
		} catch (Exception e) {
			return 0;
		}
		return a;
	}
	
	public String nextLine() {
		if (burnLine) {
			sc.nextLine();
			burnLine = false;
			return sc.nextLine();
		} else {
			return sc.nextLine();			
		}
	}
}