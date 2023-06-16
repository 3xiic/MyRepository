package co.edu.unbosque.view;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	private Scanner sc;
	private boolean quemarlinea;
	
	public Console() {
		sc= new Scanner(System.in);
		quemarlinea = false;
	}
	
	public void imprimirtString(String str) {
		System.out.print(str);
	}
	
	public void imprimirStringln(String str) {
		System.out.println(str);
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
}