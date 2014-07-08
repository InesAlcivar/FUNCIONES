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
public class Ejercicio04 {
    public static void main(String[] args) 
    {
        String cad1, cad2, a;        
        cad1=(JOptionPane.showInputDialog("Ingrese la Cadena 1"));
        cad2=(JOptionPane.showInputDialog("Ingrese la Cadena 2"));    
        cad2=cad2.toLowerCase();
        a=cad2.toUpperCase();
        int longd1=cad1.length();
        int longd2=cad2.length();               
        char[] fras1 = cad1.toCharArray();
        char[] fras2 = cad2.toCharArray(); 
        char[] fras3 = a.toCharArray();
        System.out.print("La Frase Uno es:\n"+cad1+"\n");
        System.out.print("La Frase Dos es:\n"+cad2+"\n");
         for (int j = 0; j < longd2; j++)
          {
              for (int k = 0; k < longd1; k++) 
              {
                  if (fras1[k]== fras2[j] || fras1[k]== fras3[j]) 
                  {
                      fras1[k]=' ';
                  }
              }
          }             
        System.out.print("La Frase Uno sin los caracteres de la Frase Dos es: \n");
          for (int j = 0; j < longd1; j++) 
          {
              if (fras1[j]!=' ')
              {
                  System.out.print(fras1[j]+" ");
              }
          }System.out.print("\n ");
    }
}
