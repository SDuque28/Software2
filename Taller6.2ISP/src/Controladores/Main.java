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
        // TODO code application logic here
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso();
        PaquetePequeño paquetePequeño = new PaquetePequeño();
        PaqueteGrande paqueteGrande = new PaqueteGrande();
        
        paqueteGrande.calcularCostoEnvioGrande();
        paquetePequeño.calcularCostoEnvioPequeño();
        paquetePeligroso.aegurarPaquetePeligroso();
        paquetePeligroso.verificarContenidoPeligroso();
    }
    
}
