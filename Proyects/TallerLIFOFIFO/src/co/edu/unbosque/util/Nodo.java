package co.edu.unbosque.util;

public class Nodo {
    private Object dato;
    private Nodo next;
    
    public Nodo(Object dato, Nodo next){
        this.next = next;
        this.dato = dato;
    }
    public Nodo getNext(){
        return next;
    }
    public void setNext(Nodo sig){
        this.next = sig;
    }
     public Object getDato(){
        return dato;
    }
    public void setDato(Object p){
        this.dato = p;
    }

}
