/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto1;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaServicio fabricaRegular = new FabricaRegular();
        FabricaServicio fabricaExpress = new FabricaExpress();
        
        Paquete paqueteRegular = fabricaRegular.crearPaquete();
        Paquete paqueteExpress = fabricaExpress.crearPaquete();
        
        paqueteExpress.enviar();
        paqueteRegular.enviar();
    }
    
}
