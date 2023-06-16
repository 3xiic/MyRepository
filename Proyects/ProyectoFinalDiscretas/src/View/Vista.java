package View;

import java.util.Scanner;

public class Vista {
	private Scanner leer;
	public Vista() {
		leer = new Scanner(System.in);
	}

		public void mostrarInfo(String m) {
			System.out.println(m);
		}
		
		public int leerDato() {
			int aux = leer.nextInt();
			leer.nextLine();
			return aux;
				
		}
		public String leerTexto() {
			return leer.nextLine();
		}
}
