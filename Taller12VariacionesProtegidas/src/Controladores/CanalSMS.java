/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CanalSMS implements CanalNotificacion{

    @Override
    public void enviarNotificaion(Notificacion notificacion) {
        System.out.println("Enviar notificacion por SMS: " + notificacion.getTitulo());
    }
}
