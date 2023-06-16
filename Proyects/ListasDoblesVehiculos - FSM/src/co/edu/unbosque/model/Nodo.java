/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.model;

/**
 *
 * @author DOCENTES
 */
public class Nodo {
    private Vehiculo dato;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(Vehiculo dato, Nodo siguiente, Nodo anterior){
        
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
        
    }
    
    public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo sig){
        this.siguiente = sig;
    }
    
	public Vehiculo getDato() {
		return dato;
	}
	
	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}
    
}
