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
public class Ejercicio08 {
    public static void main(String[] args) 
    {
        int c=0;
        String cadena1;
        cadena1=JOptionPane.showInputDialog("Ingrese una Frase");
        cadena1=" "+ cadena1+" ";         
        char[] fras1 =cadena1.toCharArray();        
        for (int j = 0; j < cadena1.length() ; j++)
        {
            if (fras1[j]=='A'||fras1[j]=='a') 
            {
                   c=c+1;
                   
                for (int k = j; k < cadena1.length(); k++) 
                {
                    if (fras1[k]==' ') 
                    {
                      j=k;
                      k=cadena1.length();                      
                    }   
                }                
            }            
        }        
        System.out.print("Su Frase es:\n"+cadena1+"\nHay "+c+ " palabras que tienen la letra A\n ");
    }
}
