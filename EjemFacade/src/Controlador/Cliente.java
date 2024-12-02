/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaFacade sistemaFacade = new SistemaFacade();
        
        sistemaFacade.comprarBoleto("Hard Rock", 23.56);
        sistemaFacade.comprarBoleto("Feid", 85.3);
    }
    
}
