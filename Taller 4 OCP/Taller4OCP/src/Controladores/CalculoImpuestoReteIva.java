/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CalculoImpuestoReteIva extends Calculo{
    private double valorImpuesto = 0.1;
    
    public CalculoImpuestoReteIva() {
    }

    public CalculoImpuestoReteIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    double calcularImpuesto() {
        return (cantidad*precio)*valorImpuesto;
    }
    
}
