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
    public int eje2 (int y, int z)
    {  
        long r = 0;
        if (y<=0 || y>255)
        {
            r=-1;
           
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
                    
                }
            }
        }
                  
            return (int) r;

    }
}
