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
public class Ejercicio07 {
    public static void main(String[] args) 
    {        
        int codigo;
        char y;
        String a="";
        String cadena1;
        cadena1=JOptionPane.showInputDialog("Ingrese la Frase");
        int longd1 = cadena1.length();    
        char [] frasc1= cadena1.toCharArray(); 
        System.out.print("La Frase Ingresada es:\n"+cadena1+"\n");
        for (int j = 0; j < longd1; j++)
        {
            if (cadena1.codePointAt(j)>=65 && cadena1.codePointAt(j)<=90)
            {
                codigo = cadena1.codePointAt(j);
                codigo =codigo+32;
                y=(char)codigo; 
                a=a+y;                    
            }
            else                  
            {
                a=a+frasc1[j];                    
            }          
        }
       System.out.print("La Frase en Minúscula es:\n"+a+"\n");
    }
}
