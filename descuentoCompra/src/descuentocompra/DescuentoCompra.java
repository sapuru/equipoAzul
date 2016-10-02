/*
En un supermercado, se  realizan descuentos por las compras a partir de unas bolitas de colores. 
Si el cliente saca una bolita color azul, tiene un descuento del 20%, 
si la bolita es roja, se aplica un descuento del 30% 
y si saca una bolita color blanca, no se aplica ningún descuento. 
Diseñe un programa que a partir del importe de la compra y el color de la bolita, 
muestre lo que debe pagar dicho cliente.
 */
package descuentocompra;

import javax.swing.JOptionPane;

/**
 *
 * @author sapuru
 */
public class DescuentoCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int color;
        double compra;
        double descuento;
        double total;
        String cadenaColor;
        String cadenaCompra;
        

        cadenaColor=JOptionPane.showInputDialog("MENU \n Ingrese el color de bolilla: \n 1- azul: "
                + "\n 2- Rojo"
                + "\n 3- Blanco");
        color=Integer.parseInt(cadenaColor);
        
        switch (color) {
            case 1:
                cadenaCompra=JOptionPane.showInputDialog(null,"Ingrese el monto total de la compra");
                compra=Double.parseDouble(cadenaCompra);
                descuento=compra*0.2;
                total=compra-descuento;
                JOptionPane.showMessageDialog(null, "El monto a abonar es: "+total);
                break;
            case 2:
                cadenaCompra=JOptionPane.showInputDialog(null,"Ingrese el monto total de la compra");
                compra=Double.parseDouble(cadenaCompra);
                descuento=compra*0.3;
                total=compra-descuento;
                JOptionPane.showMessageDialog(null, "El monto a abonar es: "+total);
                break;
            case 3:
                cadenaCompra=JOptionPane.showInputDialog(null,"Ingrese el monto total de la compra");
                compra=Double.parseDouble(cadenaCompra);
                JOptionPane.showMessageDialog(null, "El monto a abonar es: "+compra);
                break;
            default:
            JOptionPane.showMessageDialog(null,"Opción No válida");
        }
        
    }
    
}
