/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNotificacion canalCorreo1 = new CanalCorreoElectronico();
        CanalNotificacion canalCorreo2 = new CanalSMS();
        CanalNotificacion canalCorreo3 = new CanalWhatsapp();
        
        Notificador notificador1 = new Notificador(canalCorreo1);
        Notificador notificador2 = new Notificador(canalCorreo2);
        Notificador notificador3 = new Notificador(canalCorreo3);
        
        Notificacion notificacion = new Notificacion("T-Notificacion", "Cuerpo del correo");
        
        notificador1.enviarNotificacion(notificacion);
        notificador2.enviarNotificacion(notificacion);
        notificador3.enviarNotificacion(notificacion);
    }
    
}
