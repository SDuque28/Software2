/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Reembolso extends Transaccion{

    public Reembolso(MetodoPago metodoPago) {
        super(metodoPago);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Realizando reembolso: ");
        metodoPago.procesarPago(monto);
    }
    
}
