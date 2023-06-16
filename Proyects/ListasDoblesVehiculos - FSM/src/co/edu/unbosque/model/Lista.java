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
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista (){
        inicio = null;
        fin = null;
    }
    
    // Método para crear la lista vacia, solo se hace una vez con cada variable de tipo Lista
    public boolean estaVacia( ){
        return (inicio == null);
            
    }
    public boolean revisarExistente(Vehiculo v) {
    	Nodo temporal = inicio;
    	boolean encontro = false;
        while (temporal != null){
        	if(temporal.getDato().getPlaca().toUpperCase().equals(v.getPlaca().toUpperCase())) {
        		encontro = true;
        		break;
        	}
        	temporal = temporal.getSiguiente();
            
        }
		return encontro;
    	
    }
    
    public void insertar (Vehiculo v){
        Nodo actual;
        if (estaVacia()){//El nodo nuevo queda como primer y único nodo de la lista
            actual  = new Nodo(v, null, null);
            inicio = actual;
            fin = actual;
            
        }else{//Adiciona el nuevo elemento al final de la lista
            actual  = new Nodo(v, null, null);
            actual.setAnterior(fin);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public void imprimirlista (){
        if (estaVacia()){//No tiene ningun elemento tipo vehiculo
            System.out.println("La lista esta vacia");
            System.out.println();
            return;
        }else{//Por lo menos tiene una vehiculo
            Nodo temporal;
            temporal = inicio;
            while (temporal != null){
                System.out.println(temporal.getDato().toString());
                System.out.println();
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void buscarVehiculo (String placa){
        //A este metodo le llega el placabre que desea buscar en la lista
        if (estaVacia()){//No tiene ningun elemento tipo vehiculo
            System.out.println("No existe en La lista");
            return;
        }else{//Debo buscar ese vehiculo de principio a fin
            Nodo temporal;
            Vehiculo  vtmp;
            boolean encontro = false;
            temporal = inicio;
            while (temporal != null){
                vtmp = temporal.getDato();
                if (vtmp.getPlaca().toUpperCase().equals(placa.toUpperCase())){//Si coincide el placabre de la vehiculo de ese nodo con el placabre buscado
                    System.out.println(" Si existe en la Lista y sus datos son: ");
                    System.out.println(" "+vtmp.toString());
                    encontro = true;
                    break;
                }
                temporal = temporal.getSiguiente();
            }
            if (encontro == false) System.out.println("Esa vehiculo NO existe en la Lista");
        }
    }
    
    public void insertarpost (String modelo, Vehiculo v){
        Nodo nuevo;
          //Revisamos el contenido del modelo para saber si lo desea de primeras o despues de un modelo de vehiculo que ya debe existir en la lista
          
        if (modelo.length()== 0){//Lo desea insertar de primeras
            if (estaVacia()){//El nodo nuevo queda como primer y único nodo de la lista
                nuevo  = new Nodo(v, null, null);
                inicio = nuevo;
                fin = nuevo;
            
            }else{//Haya lo que sea en la lista, todo su contenido deberá quedar despues del nuevo nodo que será el primero
                Nodo temporal;
                temporal = inicio;
                nuevo = new Nodo(v, null, null);
                nuevo.setSiguiente(temporal);
                inicio = nuevo;
            }
        } else {//Busco el antecesor y luego inserto
        	if(size()==1){
        		insertar(v);
        	}else if (estaVacia()) {//No tiene ningun elemento tipo vehiculo
                System.out.println("ERROR - La lista esta vacia por lo que no es posible buscar el antecesor solicitado");
                return;
            } else {//Debo buscar ese modelo de principio a fin
                Nodo temporal = null;
                Nodo aux = null;
                boolean encontro = false;
                temporal = inicio;
                while ((temporal.getSiguiente()) != null ){
                	if (temporal.getDato().getModelo().toUpperCase().equals(modelo.toUpperCase()) == true) {
                		aux = temporal;
                		encontro = true;
                	}
                	temporal = temporal.getSiguiente();
                }
                //Esta parado en el placabre buscado o llego al final
                
                if (!encontro) {
                    System.out.println("El antecesor dado <<"+modelo+" no existe en la Lista. No se insertó el elemento! ");           
                } else {
                    nuevo = new Nodo(v, null, null);
                    nuevo.setSiguiente(aux.getSiguiente());
                    nuevo.setAnterior(aux);
                    aux.setSiguiente(nuevo);
                    System.out.println("Ya ha sido insertada la nueva vehiculo! ");
                }
            }
            
            
        }
    }
    
    public String eliminar (String placa){
        //A este..... metodo le llega el placabre que desea buscar en la lista para eliminarlo
        
        if (placa.length()== 0){//No digito vehiculo a eliminar
                return "ERROR - No digito la placa de vehiculo a eliminar";
        }else{
            if (estaVacia())//Ni si quiera busco el elemento porque la lista no tiene nada
            	return "ERROR - La lista esta vacia";
            
            
            else{//Paso a buscar el elemento que deseo eliminar
                Nodo temporal;
                Nodo nuevo;
                Nodo siguiente = null;
                nuevo = temporal = inicio;
                while ((temporal.getSiguiente() != null) && (temporal.getDato().getPlaca().equals(placa) == false)){
                    nuevo = temporal;
                    temporal = temporal.getSiguiente();
                    if(temporal.getSiguiente() != null) siguiente = temporal.getSiguiente();
                }
                
                //Esta parado en el vehiculo buscado o llego al final
                if (nuevo == null)
                	return "El Elemento a eliminar <<"+placa+" no existe en la Lista. ";           
                else{
                    if (inicio == temporal){//se eliminara el primer elemento
                    	if (size() == 1) inicio = null;
                    	else {                    		
                    		inicio = nuevo.getSiguiente();
                    		inicio.setAnterior(null);
                    	}
                    	return "Ya ha sido eliminado el vehiculo! ";           
                    }else if (temporal == fin) {
                    	temporal.setAnterior(null);
                    	fin = nuevo;
                    	fin.setSiguiente(null);
                    } else {
                    	nuevo.setSiguiente(temporal.getSiguiente());
                    	siguiente.setAnterior(nuevo);
                    	return "Ya ha sido eliminado el vehiculo! ";
                    }
                }
            }
            return "";
        }
    }
    
    public int size() {
    	int size = 0;
    	Nodo temporal = inicio;
        while (temporal != null){
            size++;
            temporal = temporal.getSiguiente();
        }
        return size;
    }
    
    public void imprimirAscendentePlaca() {
    	if (estaVacia()){//No tiene ningun elemento tipo vehiculo
            System.out.println("La lista esta vacia");
            return;
        } else {//Por lo menos tiene una vehiculo
        	Lista listaux = new Lista();
        	Nodo temporal = inicio;
            while (temporal != null){
                listaux.insertar(temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        	Lista listimp = new Lista();
            Nodo aux = null;
            for (int i = 0; i < size(); i++) {
            	temporal = listaux.inicio;
            	String menor_placa = temporal.getDato().getPlaca().toUpperCase();
            	while (temporal != null){
                    if (temporal.getDato().getPlaca().toUpperCase().compareTo(menor_placa.toUpperCase()) <= 0) {
                    	menor_placa = temporal.getDato().getPlaca();
                    	aux = temporal;
                    }
                    temporal = temporal.getSiguiente();
                }
            	listimp.insertar(aux.getDato());
            	listaux.eliminar(aux.getDato().getPlaca());
			}
            listimp.imprimirlista();
        }
	}
    
    public void imprimirDescendenteModelo() {
    	if (estaVacia()){//No tiene ningun elemento tipo vehiculo
            System.out.println("La lista esta vacia");
            return;
        } else {//Por lo menos tiene una vehiculo
        	Lista listaux = new Lista();
        	Nodo temporal = inicio;
            while (temporal != null){
                listaux.insertar(temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        	Lista listimp = new Lista();
            Nodo aux = null;
            for (int i = 0; i < size(); i++) {
            	temporal = listaux.inicio;
            	String mayor_modelo = temporal.getDato().getModelo().toUpperCase();
            	while (temporal != null){
                    if (temporal.getDato().getModelo().toUpperCase().compareTo(mayor_modelo.toUpperCase()) >= 0) {
                    	mayor_modelo = temporal.getDato().getModelo();
                    	aux = temporal;
                    }
                    temporal = temporal.getSiguiente();
                }
            	listimp.insertar(aux.getDato());
            	listaux.eliminar(aux.getDato().getPlaca());
			}
            listimp.imprimirlista();
        }
	}
}
