/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CreadorPagoTarjeta extends CreadorPago{

    @Override
    public MetodoDePago crearMetodoPago() {
        return new PagoTarjeta();
    }
    
}