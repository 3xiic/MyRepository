package co.edu.unbosque.util;

public class QueueTAD {
	private Nodo back;
    private Nodo front;
    
    public QueueTAD() {
		back = null;
		front = null;
	}
    
    public String showAll() {
    	Nodo temp = back;
    	String imp = "";
    	while (temp != null){
			imp = temp.getDato().toString() + "\n" + imp;
			temp = temp.getNext();
		}
    	return imp;
    }
    
    public int size() {
    	int n = 0;
    	Nodo temp = back;
    	while (temp != null){
			n++;
			temp = temp.getNext();
		}
    	return n;
    }
    
    public boolean isEmpty(){
        return (back == null);
    }
    
    public void makeEmpty() {
    	back = null;
		front = null;
    }
    
    public void offer(Object o){
    	Nodo actual;
        if (isEmpty()){
            actual  = new Nodo(o, null);
            back = actual;
            front = actual;
        } else {
            actual = new Nodo(o, back);
            back = actual;
        }
    }
    
    public Object poll() {
    	Object imp = null;
    	if (isEmpty()) {
    		System.out.println("ERROR: The queue is empty!");
    	} else {
    		imp = front.getDato();
    		Nodo temp;
    		Nodo previous;
    		previous = temp = back;
    		while ((temp.getNext() != null)){
    			previous = temp;
    			temp = temp.getNext();
    		}
    		if (back == temp) {
    			back = null;
    			front = null;
    		} else {
    			previous.setNext(null);
    			front = previous;
    		}
    	}
    	return imp;
    }
    
    public Object peek() {
    	if (isEmpty()) {
    		System.out.println("ERROR: The stack is empty!");
    		return "";
    	} else return front.getDato();
    } 
}
