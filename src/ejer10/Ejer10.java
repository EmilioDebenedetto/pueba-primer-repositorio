/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import arregloEntidades.arreglo;
import arregoServicio.servicios;



/**
 *
 * @author emiliodebenedetto
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       arreglo a1= servicios.crearObjeto();
       servicios.ordenar(a1);
       servicios.rellenar(a1);
       servicios.mostrar(a1);
       
    }
    
}
