package Model;

public class BintoDec {


	public int bitode(String binario){
	    int base = 2;
	    double dec = 0;
	    int pot = 0;
	    
	    for(int i=binario.length()-1; i>=0; i--){
	        if(binario.charAt(i)=='1'){
	            dec += Math.pow(base, pot);
	        }
	        pot++;
	    }
	    return (int) dec;
	}

}
