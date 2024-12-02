/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PayPal implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago: " + monto + ", PayPal");
    }
    
}
