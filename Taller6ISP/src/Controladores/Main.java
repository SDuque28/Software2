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
        Libro libro = new Libro();
        Cartilla cartilla = new Cartilla();
        DVD dvd = new DVD();
        
        dvd.devolver();
        cartilla.mantenimientoHojas();
        libro.renovarPortada();
    }
    
}
