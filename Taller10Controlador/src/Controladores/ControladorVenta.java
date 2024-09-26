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
public class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public ControladorVenta() {
    }
    
    public void comprarEntrada(String tipoEntrada){
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if(entrada.isDisponible()){
            entrada.setDisponible(false);
            System.out.println("Entrada comprada");
        }else{
            System.out.println("Entrada no disponible");
        }
    }
    
    private Entrada encontrarEntrada(String tipoEntrada){
        for(Entrada entrada:getEntradas()){
            if(entrada.getTipo().equals(tipoEntrada)){
                return entrada;
            }
        }
        return null;
    }
    
    public void addEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    /**
     * @return the entradas
     */
    public List<Entrada> getEntradas() {
        return entradas;
    }

    /**
     * @param entradas the entradas to set
     */
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    
}
