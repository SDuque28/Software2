/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Sistema {
    private IServicioNotificacion servicioNotificacion;
    private TareaDAO tareaDAO;

    public Sistema(IServicioNotificacion servicioNotificacion, TareaDAO tareaDAO) {
        this.servicioNotificacion = servicioNotificacion;
        this.tareaDAO = tareaDAO;
    }
    
    public void enviarNotificacion(Notificacion notificacion){
        servicioNotificacion.enviarNotificacion(notificacion);
    }
    
    public void leerTarea(){
        this.tareaDAO.leerTarea();
    }
    
    public void guardarTarea(Tarea tarea){
        this.tareaDAO.guardarTarea(tarea);
    }
    
}
