/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class MensajeUrgente extends Mensaje{

    public MensajeUrgente(PlataformaMensaje plataformaMensaje) {
        super(plataformaMensaje);
    }

    @Override
    public void enviar(String contenido) {
        System.out.println("Mensaje urgente: ");
        plataformaMensaje.enviarMensaje(contenido);
    }
}
