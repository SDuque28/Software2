/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PagoTarjetaAdapter implements SistemaDePago{
    private PagoTarjeta pagoTarjeta;

    public PagoTarjetaAdapter(PagoTarjeta pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    @Override
    public void cerrarSesion(String nombre) {
        pagoTarjeta.cerrarSecion();
    }

    @Override
    public void validarCorreo(String correo) {
        pagoTarjeta.validarCorreo();
    }

    @Override
    public void validarAutorizacion() {
        pagoTarjeta.validarAutorizacion();
    }

    @Override
    public void realizarPago() {
        pagoTarjeta.realizarPago();
    }
}
