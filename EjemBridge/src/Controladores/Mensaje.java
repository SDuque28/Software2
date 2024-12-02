/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public abstract class Mensaje {
    protected PlataformaMensaje plataformaMensaje;

    public Mensaje(PlataformaMensaje plataformaMensaje) {
        this.plataformaMensaje = plataformaMensaje;
    }
    
    public abstract void enviar(String contenido);
}
