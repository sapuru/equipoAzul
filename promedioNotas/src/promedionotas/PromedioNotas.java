/*
*Se procesan las notas de 5, alumnos, 
*de las cuales se desea saber cual es el promedio de esas 5 notas, 
*y cual fue la nota mayor y menor.
 */

package promedionotas;

import javax.swing.JOptionPane;


/**
 *
 * @author sapuru
 */
public class PromedioNotas {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    
    int nota;
    String cadenaNota;
    int notaA=0;
    int notaB=10;
    int promedio=0;
    int acumulador=0;
    int contador=0;
    
        for (int i = 1; i <= 5; i++) {
            cadenaNota=JOptionPane.showInputDialog(null,"Ingrese la nota: ");
            nota=Integer.parseInt(cadenaNota);
            if (nota>notaA) {
                notaA=nota;
            } else if (nota<=notaB) {
                notaB=nota;
            }
            acumulador=acumulador+nota;
            contador=i;
        }
        promedio=acumulador/contador;
        JOptionPane.showMessageDialog(null,"El promedio de notas es:"+promedio);
        JOptionPane.showMessageDialog(null,"La nota mayor es: "+notaA+"\n La nota menor es: "+notaB);
    }
    
}
