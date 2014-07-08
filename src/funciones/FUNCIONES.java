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
public class FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejerci1();
        
    }
    
    
    
    
    public static void Ejerci1(){
    Ejercicio01 eje1=new Ejercicio01();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje1.ej1(x, y));
        
    
    
    
    }
}
