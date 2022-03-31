/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloEntidades;

/**
 *
 * @author emiliodebenedetto
 */
public class arreglo {
    public float A[]=new float[50];
    public float B[]=new float[20];

    public arreglo() {
    }
    
    public arreglo(float[]A,float[]B){
        this.A=A;
        this.B=B;
        
    }

    public float[] getA() {
        return A;
    }

    public void setA(float[] A) {
        this.A = A;
    }

    public float[] getB() {
        return B;
    }

    public void setB(float[] B) {
        this.B = B;
    }
    
    
}
