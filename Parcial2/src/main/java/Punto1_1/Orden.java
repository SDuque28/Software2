/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_1;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Orden {
    private double precio;
    private double descuento;
    private CalculadoraImpuesto calculadoraImpuesto;

    public Orden(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
        this.calculadoraImpuesto = new CalculadoraImpuesto();
    }
    
    public double calcularTotal(){
        return calculadoraImpuesto.calcularTotalConImpuesto(calculadoraImpuesto.calcularDescuentoTotal(precio, descuento));
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public CalculadoraImpuesto getCalculadoraImpuesto() {
        return calculadoraImpuesto;
    }

    public void setCalculadoraImpuesto(CalculadoraImpuesto calculadoraImpuesto) {
        this.calculadoraImpuesto = calculadoraImpuesto;
    }
    
}
