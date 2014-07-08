/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Ines
 */
public class Ejercicio01 {
     public static void main(String[] args) 
    {        
        int y=0, z=0, a=7, b=6, r=0, m;
        int[] arreglo01=new int[128];
        int[] arreglo02=new int[127];
        int[] arreglo03=new int[255];
        
        for (int j = 0; j <= 127; j++) 
        {            
            arreglo01[j]=a;
            a=a+1;            
        }
        for (int k = 0; k < 126; k++) 
        {            
            arreglo02[k]=b;
            b=b-2;            
        }
        a=0;
        for (int j = 0; j < 255; j++) 
        {
            m=j % 2;
            if (m==0)
            {
             arreglo03[j]=arreglo01[a];             
            }
            else
            {                
                arreglo03[j]=arreglo02[a]; 
                a=a+1;
            }            
        }
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Z"));
        if (y<=0 || y>255 || z<=0 || z>255)
        {
            r=-1;
        }
        else
        {
            for (int j = 0; j <255; j++) 
            {
                if (y==(j+1))
                {
                    a=arreglo03[j];
                }
                else
                {
                    if (z==(j+1))
                    {
                        b=arreglo03[j];
                    }                    
                }
            }
            r=a+b;
        }
        JOptionPane.showMessageDialog(null, r);     
    }
}
