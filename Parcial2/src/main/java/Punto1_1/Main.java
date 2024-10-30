/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Punto1_1;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    public static void main(String[] args) {
        // Si el descuento es de 10.000, 110.000 - 10.000 = 100.000
        // Menos un impuesto del 10% nos deberia dar 90.000
        Orden orden = new Orden(110000, 10000); 
        System.out.println("El valor total de la orden es: " + orden.calcularTotal());
    }
}
