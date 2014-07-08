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
   public int ej2 (int x,int y)
        
        {
        long result = 0;
        
        
        if ((x<0)||(y<0)||(x>255)||(y>255)) 
        {
            result=-1;
        }
        else
        {
            long[] array=new long[y];
            array[0]=x;
            for (int i = 1; i < array.length; i++) {
                x=x*(i+1);
                array[i]=x;
            }
            for (int i = 0; i < array.length; i++) {
                do {
                    result=array[i];
                } while (i==y);
            }
        }
        return (int) result;
        }
}
