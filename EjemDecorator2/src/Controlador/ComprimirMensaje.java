/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ComprimirMensaje extends MensajeDecorator{

    public ComprimirMensaje(Mensaje mensaje) {
        super(mensaje);
    }
    
    @Override
    public String obtenerContenido() {
        return "Comprimir " + mensaje.obtenerContenido();
    }
}
