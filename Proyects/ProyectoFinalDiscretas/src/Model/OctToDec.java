package Model;

public class OctToDec {
	public int octodec(String octal){
	    int base = 8;
	    double dec = 0;
	    int pot = 0;
	    
	    for(int i=octal.length()-1; i>=0; i--){
	        if(octal.charAt(i)!='0'){
	            dec +=Integer.parseInt(octal.charAt(i)+"")* (int) Math.round(Math.pow(base, pot));
	        }
	        pot++;
	    }
	    return (int) dec;
	}


}
