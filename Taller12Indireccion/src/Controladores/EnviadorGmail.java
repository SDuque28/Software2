/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EnviadorGmail implements EnviarNotificaciones {
    @Override
    public void enviar(Correo correo, Usuario usuario) {
        System.out.println("Enviando correo a Gmail para " + usuario.getNombre() + ": " + correo.getAsunto());
    }
}
