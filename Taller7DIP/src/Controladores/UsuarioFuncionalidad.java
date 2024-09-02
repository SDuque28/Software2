/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class UsuarioFuncionalidad {
    private String nombre;
    private String identificacion;
    
    ServicioDeCorreo servicio = new ServicioDeCorreo();
    
    public void enviarNotificacion(String mensaje){
        servicio.enviarCorreo(mensaje);
    }
}
