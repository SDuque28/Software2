/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public abstract class CreadorPago {
    public abstract MetodoDePago factoryMethod();

    public void realizarPago(double cantidad) {
        MetodoDePago metodo = factoryMethod();
        metodo.procesarPago(cantidad);
    }
}
