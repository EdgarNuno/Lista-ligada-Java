package estructuradedatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilxer
 */
public class ListaLigada {
     
    Nodo primero;
    Nodo ultimo;
    
    public ListaLigada(){
        primero= null;
        ultimo = null;
    
    }
    
    public void ingresarNodo(int dato){
        Nodo nodoNuevo= new Nodo();
        
        nodoNuevo.dato = dato;
        if(primero == null){
        primero=nodoNuevo;
        primero.siguiente=null;
        ultimo=primero;
        
        }else {
          ultimo.siguiente=nodoNuevo;
          nodoNuevo.siguiente=null;
          ultimo = nodoNuevo;
        
        }
    
    }
    public void verLista(){
       Nodo actual = new Nodo();
       actual = primero;
       while(actual != null){
           System.out.println(actual.dato);
          actual = actual.siguiente;
       
       }
    
    }
    
}
