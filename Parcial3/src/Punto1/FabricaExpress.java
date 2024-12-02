/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class FabricaExpress implements FabricaServicio{

    @Override
    public Paquete crearPaquete() {
        return new PaqueteExpress();
    }
    
}
