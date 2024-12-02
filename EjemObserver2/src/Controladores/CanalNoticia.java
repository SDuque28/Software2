/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CanalNoticia {
    private List<Observer> subscriptores;
    private String ultimaNoticia;

    public CanalNoticia() {
        this.subscriptores = new ArrayList<>();
    }
    
    public void agregarSubscriptor(Observer observer){
        this.subscriptores.add(observer);
    }
    
    public void publicarNotica(String noticia){
        this.ultimaNoticia = noticia;
        notificarSubscriptores();
    }
    
    public void notificarSubscriptores(){
        for(Observer observer: this.subscriptores){
            observer.actualizar(ultimaNoticia);
        }
    }
}
