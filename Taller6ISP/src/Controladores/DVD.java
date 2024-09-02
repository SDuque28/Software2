/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class DVD implements Libreria{
    private String nombre;
    private int stock;

    public DVD() {
    }

    public DVD(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    @Override
    public void prestar() {
        System.out.println("Se presto el DVD");
    }

    @Override
    public void devolver() {
        System.out.println("Se devuelve el DVD");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
