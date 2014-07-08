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
public class Ejercicio09 {
    public static void main(String[] args) 
    {
        int num=0,c=0,k=0,b=0,d=0;
        
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
            while(b==0){
            if (num>=0)
                {
                    for (int j = 1; j < num+1 ;j++ ){
                      k = j*j; 
                      if(k==num){
                        c=1;
                        b=1;
                      }
                      else{
                        b=1;
                        d=2;
                      }
                    }
                }
            else
                {
                    JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos es decir Números Mayores a 0" );
                    num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
                }  
            }
        if (c==1&&d==1)
            {
                JOptionPane.showMessageDialog(null, "TRUE" );
            }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }        
    }
}
