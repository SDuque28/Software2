/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double tamañoArchivo;

    /**
     * @param nombre
     * @param precio
     * @param cantidad
     * @param peso
     * @param tamañoArchivo 
     */
    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return precio*cantidad*peso*tamañoArchivo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public void enviarCorreo() {
        System.out.println("Envio correo mixto");
    }
    
}
