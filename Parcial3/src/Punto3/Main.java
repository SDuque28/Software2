/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args){
        PagoPayPal pagoPayPal = new PagoPayPal();
        PagoTarjeta pagoTarjeta = new PagoTarjeta();
        
        PagoPayPalAdapter pagoPayPalAdapter = new PagoPayPalAdapter(pagoPayPal);
        PagoTarjetaAdapter pagoTarjetaAdapter = new PagoTarjetaAdapter(pagoTarjeta);
        
        pagoPayPalAdapter.realizarPago();
        pagoTarjetaAdapter.realizarPago();
    }
}
