/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class DescuentoPorcentaje implements Descuento{
    public double porcentaje;

    @Override
    public double calcularDescuento(double precio) {
        return precio - (precio*porcentaje/100);
    }
}
