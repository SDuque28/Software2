/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new Builder().setColor("Rojo").setTipo("Mazda").setPuertas("2");
        Vehiculo vehiculo = builder.build();
        vehiculo.infoVehiculo();
        
        Builder builder2 = new Builder().setColor("Verde").setTipo("Toyota").setPuertas("4");
        Vehiculo vehiculo2 = builder2.build();
        vehiculo2.infoVehiculo();
    }
    
}
