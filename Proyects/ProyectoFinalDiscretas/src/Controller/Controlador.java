package Controller;

import Model.*;
import View.*;

public class Controlador {

	private Menu m;
	private Vista v;
	private BintoDec ej1;
	private HexToDec ej2;
	private DecToBin ej3;
	private DecToHex ej4;
	private OctToDec ej5;
	private DecToOct ej6;
	private int seleccion;

	public Controlador() {
		 m  = new Menu();
		ej1 = new BintoDec();
		ej2 = new HexToDec();
		ej3 = new DecToBin();
		ej4 = new DecToHex();
		ej5 = new OctToDec();
		ej6 = new DecToOct();
		v = new Vista();
		seleccion = -1;
		funcionar();
	}

	public void funcionar() {
		while (seleccion !=0) {
			m.Opciones();
			seleccion =v.leerDato();
			switch (seleccion) {

			case 1:
				v.mostrarInfo("Pon tu numero binario");
				String Binario= v.leerTexto();   
				v.mostrarInfo("El numero binario "+Binario+" en decimal es: "+ej1.bitode(Binario));
				v.mostrarInfo("");		
				break;
			case 2:
				v.mostrarInfo("Pon tu numero Hexadecimal");
				String Hex = v.leerTexto();
				v.mostrarInfo("El numero Hexadecimal "+Hex+" en decimal es: "+ej2.hextode(Hex));
				v.mostrarInfo("");
				break;
			case 3:
				v.mostrarInfo("Pon tu numero Decimal");
				String Dec = v.leerTexto();
				v.mostrarInfo("El numero decimal "+Dec+" en binario es: "+ej3.dectobin(Dec));
				v.mostrarInfo("");
				break;
			case 4:
				v.mostrarInfo("Pon tu numero Decimal");
				String decimal=v.leerTexto();
				v.mostrarInfo("El numero decimal "+decimal+" en hexadecimal es: "+ej4.dectohex(decimal));
				v.mostrarInfo("");
				break;
			case 5:
				v.mostrarInfo("Digita tu primer numero binario");
				String bin1=v.leerTexto();
				int dec1 = (ej1.bitode(bin1));
				v.mostrarInfo("Digita tu segundo numero binario");
				String bin2=v.leerTexto();
				int dec2 =(ej1.bitode(bin2));
				int suma=  dec1+dec2;
				String resp= suma+"";
				v.mostrarInfo("La suma de los numeros binarios "+bin1+" y "+bin2+" es: "+ej3.dectobin(resp));
				break;
			case 6:
				v.mostrarInfo("Digita tu primer numero hexadecimal");
				String hex1 = v.leerTexto();
				int deci1 = (ej2.hextode(hex1));
				v.mostrarInfo("Digita tu segundo numero hexadecimal");
				String hex2 =v.leerTexto();
				int deci2 = (ej2.hextode(hex2));
				int suma2= deci1+deci2;
				String respuesta= suma2+"";
				v.mostrarInfo("La suma de los numeros Hexadecimales "+hex1+" y "+hex2+" es: "+ej4.dectohex(respuesta));
				break;
			case 7:
				v.mostrarInfo("Digita tu numero Octal");
				String Oct = v.leerTexto();
				v.mostrarInfo("El numero octal "+Oct+" en decimal es: "+ej5.octodec(Oct));
				v.mostrarInfo("");
				break;
			case 8: 
				v.mostrarInfo("Digita tu numero decimal");
				String Decimal = v.leerTexto();
				v.mostrarInfo("El numero decimal "+Decimal+" en octal es: "+ej6.dectooct(Decimal));
				break;
			case 9:
				v.mostrarInfo("Digita tu primer numero octal");
				String Octal1= v.leerTexto();
				int decimal1=(ej5.octodec(Octal1));
				v.mostrarInfo("Digita tu segundo numero octal");
				String Octal2= v.leerTexto();
				int decimal2=(ej5.octodec(Octal2));
				int suma3=decimal1+decimal2;
				String respu=String.valueOf(suma3);
				v.mostrarInfo("la suma de los numero octales "+Octal1+" y "+Octal2+" es: "+ej6.dectooct(respu));
				break;
			case 10:
				v.mostrarInfo("Muchas gracias profe, hasta luego :3");
				System.exit(0);
				break;
			default: v.mostrarInfo("Digita una opcion valida!");
			}

		}
	}

}
