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
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        Notificador notificador = new Notificador(canalCorreo);
        
        Notificacion notificacion = new Notificacion("T-Notificacion", "Cuerpo del correo");
        notificador.enviarNotificacion(notificacion);
    }
    
}
