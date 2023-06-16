package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc= new Scanner(System.in);
	}

	public void printString(String str) {

		System.out.println(str);
	}

	public void printStringInLine(String str) {
		System.out.print(str);
	}

	public void burnLine() {
		sc.nextLine();
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public String readStringLine() {
		return sc.nextLine();
	}

	public String readString() {
		return sc.next();
	}
	public String menu() {
		return "Bienvenido al diccionario, elige una opcion"+"\n"+
				"1.Agregar palabra al diccionario"+"\n"+
				"2.Eliminar palabra"+"\n"+
				"3.Actualizar palabra"+"\n"+
				"4.Mostrar todo"+"\n"+
				"5.Salir";
	}
}
