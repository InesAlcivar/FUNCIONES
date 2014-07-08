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
public class Ejercicio02 {
    public static void main(String[] args) 
    {                        
        int z;
        long y, r;
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Z"));
        if (y<=0 || y>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            long[] arreglo=new long[z];
            arreglo[0]=y;
            for (int j = 1; j < arreglo.length; j++) 
            {
               y=y*(j+1);
               arreglo[j]=y;
                System.out.println(j+" "+arreglo[j]);               
            }
            for (int j = 0; j < arreglo.length; j++) 
            {
                if(j==(z-1))
                {
                    r=arreglo[j];
                    JOptionPane.showMessageDialog(null,"Resultado "+r);
                }
            }
        }
    }
}
