/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PagoPayPalAdapter implements SistemaDePago{
    private PagoPayPal pagoPayPal;

    public PagoPayPalAdapter(PagoPayPal pagoPayPal) {
        this.pagoPayPal = pagoPayPal;
    }

    @Override
    public void cerrarSesion(String nombre) {
        pagoPayPal.cerrarSecion();
    }

    @Override
    public void validarCorreo(String correo) {
        pagoPayPal.validarCorreo();
    }

    @Override
    public void validarAutorizacion() {
        pagoPayPal.validarAutorizacion();
    }

    @Override
    public void realizarPago() {
        pagoPayPal.realizarPago();
    }
}
