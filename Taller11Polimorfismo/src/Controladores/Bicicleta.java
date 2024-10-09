/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Bicicleta implements IServicioTransporte{

    public Bicicleta() {
    }
    
    @Override
    public void accelerar() {
        System.out.println("El bicicleta accelera");
    }

    @Override
    public void frenar() {
        System.out.println("El bicicleta frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion bicicleta");
    }
}
