/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Carrito {
    private List<Libro> libros = new ArrayList<>();

    public Carrito() {
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void addLibros(Libro libro){
        this.libros.add(libro);
    }
    
    public double calcularPrecioTotal(){
        double total = 0.0;
        for(Libro libro : libros){
            total += libro.getPrecio();
        }
        return total;
    }
}
