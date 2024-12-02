/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        
        Transaccion compraTarjeta = new Compra(tarjeta);
        Transaccion reembolsoPayPal = new Reembolso(paypal);
        
        compraTarjeta.procesarPago(23.5);
        reembolsoPayPal.procesarPago(11.6);
    }
    
}
