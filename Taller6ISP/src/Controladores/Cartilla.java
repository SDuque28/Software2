/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cartilla implements LibCartilla, Libreria{
    private int numHojas;

    public Cartilla() {
    }

    public Cartilla(int numHojas) {
        this.numHojas = numHojas;
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Se mantuvieron las hojas de cartilla");
    }

    @Override
    public void prestar() {
        System.out.println("Se presto cartilla");
    }

    @Override
    public void devolver() {
        System.out.println("Se devolvio cartilla");
    }

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }    
}
