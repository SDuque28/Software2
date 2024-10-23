/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PagoPaypal implements MetodoDePago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando el pago de $" + cantidad + " con Paypal.");
    }
}
