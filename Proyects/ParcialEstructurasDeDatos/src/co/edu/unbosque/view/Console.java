package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	Scanner sc = new Scanner(System.in);
	
	public void mostrarInfo(String s) {
		System.out.println(s);
	}
	public String leerString() {
		return sc.nextLine();
	}
	public int leerInt() {
		return sc.nextInt();
	}
	
	public String menu() {
		return "Elige una opcion (Solo enteros) \n"
				+ "1. Asignar un valor segun la torre dada \n"
				+"2. Aumentar el valor de una torre segun el valor mensual \n"
				+"3. Aumentar el valor de la cuota respecto al cambio de año \n"
				+"4. Mostrar los valores de cuota de todo el conjunto \n"
				+"5. Mostrar segun la torre el valor de cuota \n"
				+"0. Salir.";
				
	}
}
