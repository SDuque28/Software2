/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("Mensaje");
        
        IServicioNotificacion servicio1 = new ServicioNotificacionSMS();
        IServicioNotificacion servicio2 = new ServicioNotificacionWhatsapp();
        
        Tarea tarea = new Tarea("Descripcion");
        TareaDAO tareaDAO = new TareaDAO();
        
        Sistema sistema1 = new Sistema(servicio1, tareaDAO);
        Sistema sistema2 = new Sistema(servicio2, tareaDAO);
        
        sistema1.enviarNotificacion(notificacion);
        sistema2.enviarNotificacion(notificacion);
        
        sistema1.guardarTarea(tarea);
        sistema1.leerTarea();
    }
}
