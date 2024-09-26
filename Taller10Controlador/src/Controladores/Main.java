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
        ControladorVenta controladorVenta =  new ControladorVenta();
        
        Entrada entrada1 = new Entrada("Tipo 1", 2500, true );
        Entrada entrada2 = new Entrada("Tipo 2", 3700, false);
        Entrada entrada3 = new Entrada("Tipo 3", 5600, true);
        
        controladorVenta.addEntrada(entrada1);
        controladorVenta.addEntrada(entrada2);
        controladorVenta.addEntrada(entrada3);
        
        controladorVenta.comprarEntrada("Tipo 1");
        controladorVenta.comprarEntrada("Tipo 2");
    }
    
}
