/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregoServicio;

import arregloEntidades.arreglo;
import java.util.Arrays;

/**
 *
 * @author emiliodebenedetto
 */
public class servicios {
    
    public static arreglo crearObjeto(){
        arreglo a1 = new arreglo();
        for (int i = 0; i < 50; i++) {
           a1.A[i]=(float) (Math.random()*50);
            
        }
        System.out.println(Arrays.toString(a1.A));
        return a1;
    }
   
    public static void ordenar(arreglo a1){
        Arrays.sort(a1.A);
    }
    public static void rellenar (arreglo a1){
        for (int i = 0; i < 20; i++) {
            if (i<=10) {
                a1.B[i]=a1.A[i];
                
                
            }else {
                a1.B[i]=(float) 0.5;
                
            }
 
        }
    }
    public static void mostrar(arreglo a1){
        System.out.println(Arrays.toString(a1.A));
        System.out.println(Arrays.toString(a1.B));
        
    }
    
}
