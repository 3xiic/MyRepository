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