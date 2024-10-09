/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Garage {

    public Garage() {
    }
    
    public void estacionar(IServicioTransporte iServicioTransporte){
        System.out.println("Se esta estacionando el Transporte");
        iServicioTransporte.accelerar();
        iServicioTransporte.frenar();
        iServicioTransporte.mostrarInformacion();
    }
}
