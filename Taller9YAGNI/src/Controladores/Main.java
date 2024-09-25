/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

import java.util.List;

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
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarLibro(new Libro("Titulo1", "Autor1", 2002));
        biblioteca.agregarLibro(new Libro("Titulo2", "Autor2", 2003));
        biblioteca.agregarLibro(new Libro("Titulo3", "Autor3", 2011));
        
        List<Libro> libros = biblioteca.getLibros();
        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Ano de Publicacion: " + libro.getAñoPublicacion());
            System.out.println("-------------------------");
        }
    }
    
}
