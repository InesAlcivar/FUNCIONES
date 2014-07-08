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
        Ejerci2();
        Ejerci3();
        Ejerci4();
        Ejerci5();
        Ejerci6();
        Ejerci7();
        Ejerci8();
        Ejerci9();
        Ejerci10();
        Ejerci11();
           
    }
    public static void Ejerci1(){
    Ejercicio01 eje1=new Ejercicio01();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje1.ej1(x, y));
    }
     public static void Ejerci2(){
    Ejercicio02 eje2=new Ejercicio02();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje2.ej2(x, y));
   }
    public static void Ejerci3(){
    Ejercicio03 eje3=new Ejercicio03();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje3.ej3(x, y));
    }
    public static void Ejerci4(){
    Ejercicio04 eje4=new Ejercicio04();
        String cad1=(JOptionPane.showInputDialog(null,"Ingrese cadena1"));
        String cad2=(JOptionPane.showInputDialog(null,"Ingrese cadena2"));
    JOptionPane.showMessageDialog(null, eje4.ej4(cad1, cad2));
    }
    public static void Ejerci5(){
    Ejercicio05 eje5=new Ejercicio05();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Dimension del vector"));
        int arreglo[]= new int [x];
    JOptionPane.showMessageDialog(null, eje5.ej5(arreglo));
    }
    public static void Ejerci6(){
    Ejercicio06 eje6=new Ejercicio06();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje6.ej6(x, y));
    }
    public static void Ejerci7(){
    Ejercicio07 eje7=new Ejercicio07();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje7.ej7(x, y));
    }
    public static void Ejerci8(){
    Ejercicio08 eje8=new Ejercicio08();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje8.ej8(x, y));
    }
    public static void Ejerci9(){
    Ejercicio09 eje9=new Ejercicio09();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje9.ej9(x, y));
    }
    public static void Ejerci10(){
    Ejercicio10 eje10=new Ejercicio10();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje10.ej10(x, y));
    }
    public static void Ejerci11(){
    Ejercicio11 eje11=new Ejercicio11();
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor X"));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Valor Y"));
    JOptionPane.showMessageDialog(null, eje11.ej11(x, y));
    }
}
