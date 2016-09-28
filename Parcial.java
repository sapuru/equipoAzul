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
                break;
            case 3:
                //perimetro del cuadrado
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
