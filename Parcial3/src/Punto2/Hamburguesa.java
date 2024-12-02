/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Hamburguesa {
    private String tomate;
    private String queso;
    private String pan;
    private String carne;

    public Hamburguesa(Builder builder) {
        this.carne = builder.carne;
        this.queso = builder.queso;
        this.pan = builder.pan;
        this.tomate = builder.tomate;
    }
    
    public void infoHamburguesa(){
        System.out.println("Carne: " + carne + ", Pan: " + pan);
    }
    
}
