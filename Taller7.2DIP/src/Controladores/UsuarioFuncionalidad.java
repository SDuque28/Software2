package Controladores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SANTIAGO DUQUE
 */
public class UsuarioFuncionalidad {
    private IServicioNotificacion servicio;

    public UsuarioFuncionalidad(IServicioNotificacion servicio) {
        this.servicio = servicio;
    }
    
    public void enviarNotificacion(String mensaje){
        servicio.enviarNotificacion(mensaje);
    }
}
