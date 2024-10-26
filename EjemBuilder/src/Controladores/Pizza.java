/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Pizza {
    private String masa;
    private String tamaño;
    private List<String> ingredientes;

    public Pizza(Builder builder) {
        this.masa = builder.masa;
        this.tamaño = builder.tamaño;
        this.ingredientes = builder.ingredientes;
    }
    
    @Override
    public String toString(){
        return masa + " - " + tamaño;
    }
    
}
