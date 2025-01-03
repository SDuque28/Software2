/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creador de pagos con tarjeta
        CreadorPago creadorTarjeta = new CreadorPagoTarjeta();
        MetodoDePago pagoTarjeta = creadorTarjeta.crearMetodoPago();
        pagoTarjeta.procesarPago(150.75);  
        
        // Creador de pagos con PayPal
        CreadorPago creadorPaypal = new CreadorPagoPaypal();
        MetodoDePago pagoPaypal = creadorPaypal.crearMetodoPago();
        pagoPaypal.procesarPago(150.75); 
    }
    
}
