/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Controlador {
    private Libreria libreria;

    public Controlador(Libreria libreria) {
        this.libreria = libreria;
    }
    
    public void añadirLibro(Libro libro){
        this.libreria.getLibros().add(libro);
    }
    
    public Libro buscarLibroPorTitulo(String titulo){
        boolean bandera = false;
        Libro resultado = new Libro();
        for (Libro libro:libreria.getLibros()){
            if(libro.getTitulo().equals(titulo)){
                bandera = true;
                resultado = libro;
            }
        }
        return (!bandera)? null:resultado;
    }
    
    public Libro buscarLibroPorAutor(String autor){
        boolean bandera = false;
        Libro resultado = new Libro();
        for (Libro libro:libreria.getLibros()){
            if(libro.getAutor().equals(autor)){
                bandera = true;
                resultado = libro;
            }
        }
        return (!bandera)? null:resultado;
    }

    public List<Libro> librosEntreDosPrecios(int precioI,int precioF){
        List<Libro> libros = new ArrayList<>();
        for (Libro libro:libreria.getLibros()){
            if(libro.getPrecio()>precioI && libro.getPrecio()< precioF){
                libros.add(libro);
            }
        }
        return libros;
    }
    
    public List<Libro> librosPorAño(int fecha){
        List<Libro> libros = new ArrayList<>();
        for (Libro libro:libreria.getLibros()){
            if(libro.getAño() == fecha){
                libros.add(libro);
            }
        }
        return libros;
    }
}
