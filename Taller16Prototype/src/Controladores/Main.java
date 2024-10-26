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
        Producto producto1 = new Producto("Manzana", 21500, "Fruta");
        Producto producto2 = (Producto) producto1.clone();
        producto1.getInfo();
        producto2.setNombre("Pera");
        producto2.getInfo();
    }
    
}
