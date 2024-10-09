/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Notificador {
    private CanalNotificacion canalNotificacion;

    public Notificador(CanalNotificacion canalNotificacion) {
        this.canalNotificacion = canalNotificacion;
    }
    
    public void enviarNotificacion(Notificacion notificacion){
        getCanalNotificacion().enviarNotificaion(notificacion);
    }

    /**
     * @return the canalNotificacion
     */
    public CanalNotificacion getCanalNotificacion() {
        return canalNotificacion;
    }

    /**
     * @param canalNotificacion the canalNotificacion to set
     */
    public void setCanalNotificacion(CanalNotificacion canalNotificacion) {
        this.canalNotificacion = canalNotificacion;
    }
    
}
