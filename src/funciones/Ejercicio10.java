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
public class Ejercicio10 {
    public static void main(String[] args) 
    {        
        int y,z,S=0;
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número inicial"));
        z=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese otro número final"));         
        for (int j = y; j <= z; j++) 
        {
            S=0; 
            for (int k = 1  ; k < j; k++) 
            {
                if ((j % k)==0) 
                {
                    S =S+k;
                }
                if ((j==z)&&((j%k)!=0)) 
                {
                    S=0; 
                }
            }
            if (S==j) 
            {
                JOptionPane.showMessageDialog(null, "El primer número perfecto menor entre "+ y+" y "+z+ " es = " +S);
                j=z;
            }
        }
        if(S==0) 
        {
            JOptionPane.showMessageDialog(null, "No hay números perfectos entre "+ y+" y "+z);
        }    
    }
}
