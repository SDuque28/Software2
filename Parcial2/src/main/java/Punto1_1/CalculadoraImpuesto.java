/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_1;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CalculadoraImpuesto {
    public double calcularTotalConImpuesto(double precio){
        return precio * 0.9; // 10% de impuesto
    }
    
    public double calcularDescuentoTotal(double precio, double descuento){
        return precio - descuento;
    }
}
