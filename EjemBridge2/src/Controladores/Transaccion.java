/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public abstract class Transaccion {
    protected MetodoPago metodoPago;

    public Transaccion(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public abstract void procesarPago(double monto);
}
