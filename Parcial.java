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
            default:
                throw new AssertionError();
        }
    }
    
}
