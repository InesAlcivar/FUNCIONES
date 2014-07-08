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
public class Ejercicio06 {
    public static void main(String[] args)
    {
        String f="";
        String palabra=JOptionPane.showInputDialog(null,"Ingrese una Frase : ");
        String []frase=palabra.split(" ");
        System.out.print("La Frase Ingresda es : \n" +palabra+"\n");
        for(int j = frase.length-1; j >= 0; j--)
        {
            f=f+frase[j]+" ";            
        }
        System.out.print("La Frase en orden inverso es:\n"+f+"\n");
    }
}
