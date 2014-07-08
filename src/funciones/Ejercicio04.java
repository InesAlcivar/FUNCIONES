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
    public String ej4 (String cad1, String cad2 ) 
    {
        int tamano1,tamano2;

        cad1=cad1.toLowerCase();
        cad2=cad2.toLowerCase();
        tamano2=cad2.length();
        tamano1=cad1.length();
              
        char [] cadena1=cad1.toCharArray();
        char[] cadena2=cad2.toCharArray();
        //String cadenaSalida = null;
        
        for (int i = 0; i < tamano2; i++) {
            for (int j = 0; j < tamano1; j++) {
                if (cadena1[j]==cadena2[i]) {
                    cadena1[j]=' ';
                }
            }            
        }
        String salida="";
        for (int i=0;i<tamano1;i++)
               if (cadena1[i]!=' ') {
                   
                  salida=salida+cadena1[i]; 
                   //System.out.println(" " + cadenaS1[i]);
               }
        return salida;
      //  JOptionPane.showMessageDialog(null,salida,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }
}
