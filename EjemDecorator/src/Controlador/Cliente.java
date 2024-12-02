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
        Bebida bebida = new Cafe();
        
        bebida = new Leche(bebida);
        bebida = new Azucar(bebida);
        
        System.out.println("Costo: " + bebida.costo());
        System.out.println("Descripcion: " + bebida.descripcion());
    }
    
}
