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
        
        //Ejerci1();
//        Ejerci2();
//        Ejerci3();
        Ejerci4
        ();
    }
    
    
    
    
    public static void Ejerci1(){
    Ejercicio01 eje1=new Ejercicio01();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje1.ej1(x, y));    
    }
    public static void Ejerci2(){
    Ejercicio02 eje2=new Ejercicio02();
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
        int z=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Z"));
    JOptionPane.showMessageDialog(null, eje2.eje2(y, z)); 
    }
     public static void Ejerci3(){
    Ejercicio03 ejer3=new Ejercicio03();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, ejer3.ej3(x, y)); 
    }
      public static void Ejerci4(){
    Ejercicio04 ejer4=new Ejercicio04();
       String cad1=(JOptionPane.showInputDialog(null,"Ingrese cadena1"));
        String cad2=(JOptionPane.showInputDialog(null,"Ingrese cadena2"));
    JOptionPane.showMessageDialog(null, ejer4.ej4(cad1, cad2)); 
    }
}
