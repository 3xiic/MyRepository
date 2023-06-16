package Model;

public class DecToBin {

	public String dectobin(String decimal) {
		String bin="";
		int base = 2;
		int aux = Integer.parseInt(decimal);
		int res = 0;
		while(aux>=1) {
			res = aux%base;
			aux = aux/base;           
			bin=res+bin;
		}

		return bin;

	}

}
