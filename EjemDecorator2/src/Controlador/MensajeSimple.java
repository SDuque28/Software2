/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class MensajeSimple implements Mensaje{
    private String contenido;

    public MensajeSimple(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }
    
}
