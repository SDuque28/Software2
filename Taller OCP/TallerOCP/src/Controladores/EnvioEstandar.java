/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EnvioEstandar implements Envio{

    @Override
    public double calcularCosto(double distancia, double peso) {
        return peso * 0.5 + distancia * 0.1;
    }
    
}
