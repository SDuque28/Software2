/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ChatMediator implements Mediator{
    private List<Collage> collages;

    public ChatMediator() {
        this.collages = new ArrayList<>();
    }
    
    public void addCollage(Collage collage){
        this.collages.add(collage);
    }

    @Override
    public void send(String message, Collage collage) {
        for(Collage c: this.collages){
            if(c != collage){
                c.recive(message);
            }
        }
    }
    
}
