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
public class Ejercicio03 {
    public static void main(String[] args) 
    {        
        int y,z,r;
        double proc,c=1,c1=1;
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Z"));
        double a=(double)y;
        if (y<=0 || y>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            double[] arreglo=new double[z];
            arreglo[0]=a;              
            for (int j = 1;j<arreglo.length; j++) 
            {                
                c=c+1;
               proc=y*(1/c);
               arreglo[j]=proc;           
            }
            for (int j = 0; j < arreglo.length; j++) 
            { 
              if(j==(y-1))
                {                    
                    JOptionPane.showMessageDialog(null,"Resultado "+arreglo[j]);
                }  
            }
        }
    }
}
