package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc;
	private boolean quemarlinea;
	
	public Console() {
		sc= new Scanner(System.in);
		quemarlinea = false;
	}
	
	public void imprimirStringln(String str) {
		System.out.println(str);
	}
	
	public void imprimirString(String str) {
		System.out.print(str);
	}

	
	public int leerInt() {
		int a = 0;
		try {			
			a = sc.nextInt();
			quemarlinea = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return a;
	}
	
	public String leerStringln() {
		if (quemarlinea) {
			sc.nextLine();
			quemarlinea = false;
			return sc.nextLine();
		} else {
			return sc.nextLine();			
		}
	}
	
	public String readString() {
		return sc.next();
	}
	
	
	

}