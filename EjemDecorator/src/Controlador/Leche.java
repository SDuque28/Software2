/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Leche extends BebidaDecorator{

    public Leche(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public double costo() {
        return bebida.costo() + 0.3;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " con leche";    
    }
}
