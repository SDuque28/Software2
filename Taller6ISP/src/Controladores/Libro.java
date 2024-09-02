/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Libro implements LibLibros, Libreria{
    private String nombre;
    private int numHojas;
    private int version;

    public Libro() {
    }

    public Libro(String nombre, int numHojas, int version) {
        this.nombre = nombre;
        this.numHojas = numHojas;
        this.version = version;
    }

    @Override
    public void renovarPortada() {
        System.out.println("Se renovo la portada al libro");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Se mantuvieron las hojas de la cartilla");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Se solicito nueva version libro");
    }

    @Override
    public void prestar() {
        System.out.println("Se presto libro");
    }

    @Override
    public void devolver() {
        System.out.println("Se devolvio libro");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }    
}
