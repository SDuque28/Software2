/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CorreoElectronico implements PlataformaMensaje{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
    
}
