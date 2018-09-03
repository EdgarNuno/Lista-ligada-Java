/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

/**
 *
 * @author Hilxer
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        // AQUÍ INGRESO LOS DATOS DE FORMA MANUAL PARA VERIFICAR QUE EL PROGRAMA FUNCIONE.
        
        lista.ingresarNodo(25);
        lista.ingresarNodo(3300);
        lista.ingresarNodo(40);
        lista.ingresarNodo(295);
        lista.ingresarNodo(600);
        lista.ingresarNodo(35);
        lista.ingresarNodo(2);
        lista.verLista();
        
    }
    
}
