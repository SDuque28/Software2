/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ServicioNotificacionSMS implements IServicioNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Se envia la notificacion por SMS");
    }
    
}
