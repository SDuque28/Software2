package Punto1_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Controlador controlador = new Controlador(libreria);
        
        Libro libro1 = new Libro("Titulo 1", "Autor 1", 15.20, 2002);
        Libro libro2 = new Libro("Titulo 2", "Autor 2", 18.20, 2002);
        
        controlador.añadirLibro(libro1);
        controlador.añadirLibro(libro2);
        
        System.out.println("El autor es: " + controlador.buscarLibroPorTitulo("Titulo 1").getTitulo());
        System.out.println("El titulo es: " + controlador.buscarLibroPorAutor("Autor 2").getTitulo());
        System.out.println("El precio del libro es: " + controlador.librosEntreDosPrecios(10, 16).get(0).getPrecio());
        System.out.println("El autor del libro 2 es: " + controlador.librosPorAño(2002).get(1).getAutor());
    }
}
