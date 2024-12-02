/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public abstract class Collage {
    protected Mediator mediator;

    public Collage(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public abstract void send(String message);
    public abstract void recive(String message);
}
