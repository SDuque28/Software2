/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class MensajeNormal extends Mensaje{

    public MensajeNormal(PlataformaMensaje plataformaMensaje) {
        super(plataformaMensaje);
    }

    @Override
    public void enviar(String contenido) {
        System.out.println("Mensaje normal: ");
        plataformaMensaje.enviarMensaje(contenido);
    }
    
}
