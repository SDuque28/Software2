/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ServicioNotificacionesImpl implements IServicioNotificacion{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Se envio el correo con el mensaje: " + mensaje);
    }
    
}
