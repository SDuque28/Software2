/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class DescuentoTemporal implements Descuento{
    public double valor;

    @Override
    public double calcularDescuento(double precio) {
        return precio - valor;
    }
    
}
