package Model;

public class DecToOct {

	public String dectooct(String decimal) {
		String oct="";
		int base = 8;
		int aux = Integer.parseInt(decimal);
		int res = 0;
		while(aux>=1) {
			res = aux%base;
			aux = aux/base;           
			oct=res+oct;
		}

		return oct;

	}
}
