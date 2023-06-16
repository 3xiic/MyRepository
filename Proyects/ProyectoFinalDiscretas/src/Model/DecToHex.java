package Model;

public class DecToHex {


	public String dectohex(String decimal) {
		String hex="";
        int base = 16;
        int aux = Integer.parseInt(decimal);
        int res = 0;
        while(aux>=1) {
            res = aux%base;
            if(res<10) {
                hex = res + hex;
            }
            else if(res==10) {
                hex = "A" + hex;
            }
            else if(res==11) {
                hex = "B" + hex;
            }
            else if(res==12) {
                hex = "C" + hex;
            }
            else if(res==13) {
                hex = "D" + hex;
            }
            else if(res==14) {
                hex = "E" + hex;
            }
            else if(res==15) {
                hex = "F" + hex;
            }
            aux = aux/base;
        }
        return hex;
	}
}
