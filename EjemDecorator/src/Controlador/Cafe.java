/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cafe implements Bebida{

    @Override
    public double costo() {
        return 2.5;
    }

    @Override
    public String descripcion() {
        return "Cafe negro";
    }
    
}
