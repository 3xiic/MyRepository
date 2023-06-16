package Model;

public class HexToDec {
	
	public int hextode(String hexadecimal){

	    int base = 16;
	    double dec = 0;
	    int pot = 0;
	    
	    for(int i=hexadecimal.length()-1; i>=0; i--){
	    	if(hexadecimal.charAt(i)!='A' && hexadecimal.charAt(i)!='B' && hexadecimal.charAt(i)!='C' && hexadecimal.charAt(i)!='D' &&  hexadecimal.charAt(i)!='E' && hexadecimal.charAt(i)!='F') {
	    		 dec +=Integer.parseInt(hexadecimal.charAt(i)+"")*Math.pow(base, pot); 
	    	}
	    	 else if(hexadecimal.charAt(i)==65) {
		    		dec += Math.pow(base, pot)*10;
		    	} else if(hexadecimal.charAt(i)==66) {
		    		dec += Math.pow(base, pot)*11;
		    	} else if(hexadecimal.charAt(i)==67) {
		    		dec += Math.pow(base, pot)*12;
		    	} else if(hexadecimal.charAt(i)==68) {
		    		dec += Math.pow(base, pot)*13;
		    	} else if(hexadecimal.charAt(i)==69) {
		    		dec += Math.pow(base, pot)*14;
		    	} else if(hexadecimal.charAt(i)==70) {
		    		dec += Math.pow(base, pot)*15;
		    	} 
	        pot++;
	    }
	    return (int)dec;
	}

}
