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
   public int ej3(int x,int y){
        int[] f1=new int[y];
        int result = 0;
        if (x<=0 ||y<=0 || x>255||y>255 )
        {
            result= -1;
        }
        else
        {
             
             f1[0]=x;
             int n1;
            
            for (int i = 1;i<f1.length; i++) 
            {
               n1=x/(i+1);
               f1[i]=n1;           
            }
            for (int i = 0; i < f1.length; i++) 
            { 
              if(i==(y-1))
                {
                    result= (f1[i]);
                   
                }  
              
            }
        }
       return (int) result ;
    }
}
