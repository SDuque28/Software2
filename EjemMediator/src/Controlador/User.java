/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class User extends Collage{
    private String name;

    public User(String name, Mediator mediator) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(name + " is sending this message: " + message);
    }

    @Override
    public void recive(String message) {
        System.out.println(name + " is reciving this message: " + message);
    }
    
}
