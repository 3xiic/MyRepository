package co.edu.unbosque.util;

public class StackTAD {
	
    private Nodo top;
    private Nodo beginning;
    
    public StackTAD (){
        top = null;
        beginning = null;
    }
    
    public String showAll() {
    	Nodo temp = beginning;
    	String imp = "";
    	while ((temp != null)){
			imp = temp.getDato().toString() +"\n"+ imp;
			temp = temp.getNext();
		}
    	if (imp != "") return imp;
    	else return "Sin solicitudes!! \n";
    }
    
    public String showAllAndPop() {
    	String imp = "";
    	int tam = size();
    	for (int i = 0; i < tam; i++) {			
    		imp += pop().toString()+"\n";
		}
    	if (imp != "") return imp;
    	else return "Sin solicitudes!! \n";
    }
    
    public int size() {
    	int n = 0;
    	Nodo temp = beginning;
    	while ((temp != null)){
			n++;
			temp = temp.getNext();
		}
    	return n;
    }
    
    public boolean isEmpty(){
        return (top == null);
    }
    
    public void makeEmpty() {
    	top = null;
		beginning = null;
    }
    
    public void push (Object o){
    	Nodo actual;
        if (isEmpty()){
            actual  = new Nodo(o, null);
            top = actual;
            beginning = actual;
        }else{
            actual  = new Nodo(o, null);
            top.setNext(actual);
            top = actual;
        }
    }
   
    public Object pop() {
    	Object imp = null;
    	if (isEmpty()) {
    		System.out.println("ERROR: The stack is empty!");
    	} else {
    		imp = top.getDato();
    		Nodo temp;
    		Nodo previous;
    		previous = temp = beginning;
    		while ((temp.getNext() != null)){
    			previous = temp;
    			temp = temp.getNext();
    		}
    		if (beginning == temp) {
    			beginning = null;
    			top = null;
    		} else {
    			previous.setNext(null);
    			top = previous;
    		}
    	}
    	return imp;
    }
    
    public String peek() {
    	if (isEmpty()) {
    		System.out.println("ERROR: The stack is empty!");
    		return "";
    	} else return top.getDato().toString();
    } 
}
