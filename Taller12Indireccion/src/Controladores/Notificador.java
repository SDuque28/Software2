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
    private EnviarNotificaciones enviador;

    public Notificador(EnviarNotificaciones enviador) {
        this.enviador = enviador;
    }
    
    public void enviar(Correo correo, Usuario usuario) {
        getEnviador().enviar(correo, usuario);
    }

    /**
     * @return the enviador
     */
    public EnviarNotificaciones getEnviador() {
        return enviador;
    }

    /**
     * @param enviador the enviador to set
     */
    public void setEnviador(EnviarNotificaciones enviador) {
        this.enviador = enviador;
    }
    
}
