/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroSw;
        String cadenaNumeroSw;
        
        cadenaNumeroSw=JOptionPane.showInputDialog("MENU\n 1-Calcule perímetro de un triángulo "
                + "\n 2- Calcule superficie de un triángulo"
                + "\n 3- Calcule perímetro de un cuadrado"
                + "\n 4- Calcule superficie de un cuadrado"
                + "\n 5- Salir"    );
        numeroSw=Integer.parseInt(cadenaNumeroSw);
        
        switch (numeroSw) {
            case 1:
                //perimetro del triangulo
                int lado1;
                int lado2;
                int lado3;
                String cadenaLado1;
                String cadenaLado2;
                String cadenaLado3;
                int perimetro;

                cadenaLado1 = JOptionPane.showInputDialog(null, "Ingrese longitud del lado 1: ");
                lado1 = Integer.parseInt(cadenaLado1);
                cadenaLado2 = JOptionPane.showInputDialog(null, "Ingrese longitud del lado 1: ");
                lado2 = Integer.parseInt(cadenaLado2);
                cadenaLado3 = JOptionPane.showInputDialog(null, "Ingrese longitud del lado 1: ");
                lado3 = Integer.parseInt(cadenaLado3);
                perimetro=lado1+lado2+lado3;
                
                JOptionPane.showMessageDialog(null, "El perímetro del triángulo es: "+perimetro);
               
                break;
            case 2:
                //superficie del triangulo
                float base;
                float altura;
                String cadenaBase;
                String cadenaAltura;
                float superficie;
                
                cadenaBase = JOptionPane.showInputDialog(null, "Ingresa la base del triangulo");
                base = Float.parseFloat (cadenaBase);
                cadenaAltura = JOptionPane.showInputDialog(null, "Ingresa la altura del triangulo");
                altura = Float.parseFloat(cadenaAltura);
                superficie = base + altura / 2 ;
                
                JOptionPane.showMessageDialog(null, "Esta es la superficie del triangulo = "+superficie);
                
                break;
            case 3:
                //perimetro del cuadrado
                double lado1;
                double lado2;
                double lado3;
                double lado4;
                double perimetro;
                
                String cadenaLado1;
                String cadenaLado2;
                String cadenaLado3;
                String cadenaLado4;
                
                cadenaLado1=JOptionPane.showInputDialog(null,"Ingresar el lado 1 del cuadrado");
                lado1=Double.parseDouble(cadenaLado1);
                cadenaLado2=JOptionPane.showInputDialog(null,"Ingresar el lado 2 del cuadrado");
                lado2=Double.parseDouble(cadenaLado2);
                cadenaLado3=JOptionPane.showInputDialog(null,"Ingresar el lado 3 del cuadrado");
                lado3=Double.parseDouble(cadenaLado3);
                cadenaLado4=JOptionPane.showInputDialog(null,"Ingresar el lado 4 del cuadrado");
                lado4=Double.parseDouble(cadenaLado4);
                
                perimetro=lado1+lado2+lado3+lado4;
                
                JOptionPane.showMessageDialog(null,"El perimetro del cuadrado es: "+perimetro);
                
                break;
            case 4:
                //superficie del cuadrado
                break;
            case 5:
                //salir
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción No válida");
        }
    }
    
}
