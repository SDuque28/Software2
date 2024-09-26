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
        Carrito carrito = new Carrito();
        
        Libro libro1 = new Libro("Titulo1", "Autor1", "Isbn1", 2500);
        Libro libro2 = new Libro("Titulo2", "Autor2", "Isbn2", 1120.5);
        Libro libro3 = new Libro("Titulo3", "Autor3", "Isbn3", 3760.8);
        
        carrito.addLibros(libro1);
        carrito.addLibros(libro2);
        carrito.addLibros(libro3);
        
        System.out.println("EL total del carrito es: " + carrito.calcularPrecioTotal());
    }
    
}
