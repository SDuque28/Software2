/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EnviadorOutlook implements EnviarNotificaciones {
    @Override
    public void enviar(Correo correo, Usuario usuario) {
        System.out.println("Enviando correo a Outlook para " + usuario.getNombre() + ": " + correo.getAsunto());
        // Lógica para enviar correo usando Outlook
    }
}
