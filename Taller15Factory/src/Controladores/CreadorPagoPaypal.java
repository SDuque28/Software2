/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CreadorPagoPaypal extends CreadorPago{

    @Override
    public MetodoDePago crearMetodoPago() {
        return new PagoPaypal();
    }
    
}
