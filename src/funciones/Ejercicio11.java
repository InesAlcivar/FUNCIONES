/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango del vector"));
        int[] arreglo=new int[v];
        int c=0;
        for (int j = 0; j < arreglo.length; j++) {
            
            int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
            arreglo[j]=num;
        }
        System.out.println("Arreglo Desordenado");
        for (int j = 0; j < arreglo.length; j++) {
            
            System.out.print(arreglo[j]+" ");
        }
        System.out.println("");
         int j, k, aux;
         for(j = 0; j < arreglo.length-1; j++)
              for(k = 0; k < arreglo.length-j-1; k++)
                   if(arreglo[k+1] < arreglo[k]){
                      aux=arreglo[k+1];
                      arreglo[k+1]=arreglo[k];
                      arreglo[k]=aux;
                   } 
         System.out.println("Arreglo Ordenado");
         for ( j = 0; j < arreglo.length; j++) {
            System.out.print(arreglo[j]+" ");
        }
         System.out.println("\nArreglo Sin Numeros Repetidos");
         int a1;
         for ( j = 0; j < arreglo.length; j++) 
         {
             if (j==0) {
             System.out.print(arreglo[j]+" ");
             }
             else
             {
                 a1=j-1;
                 aux=arreglo[j];
             if (aux==arreglo[a1]) {
                 
             }else
             {
                 System.out.print(arreglo[j]+" ");
             }
             }                                     
        }
         System.out.print("\n");
    }
    
}
