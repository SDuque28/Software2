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
public class DatosClimaticos {
    private List<Observer> observers;
    private String condicionesClimaticas;

    public DatosClimaticos() {
        this.observers = new ArrayList<>();
    }
    
    public void agregarObservador(Observer observer){
        this.observers.add(observer);
    }
    
    public void eliminarObservador(Observer observer){
        this.observers.remove(observer);
    }

    public void setCondicionesClimaticas(String condicionesClimaticas) {
        this.condicionesClimaticas = condicionesClimaticas;
    }
    
    public void notificarObservadores(){
        for(Observer observer: this.observers){
            observer.actualizar(condicionesClimaticas);
        }
    }
}
