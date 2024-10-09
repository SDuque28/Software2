/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Avion implements IServicioTransporte{

    public Avion() {
    }
    
    @Override
    public void accelerar() {
        System.out.println("El avion accelera");
    }

    @Override
    public void frenar() {
        System.out.println("El avion frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion avion");
    }
}
