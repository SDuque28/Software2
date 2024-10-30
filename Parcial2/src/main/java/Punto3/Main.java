/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args) {
        Factura factura1 = new FacturaElectronica("NumElectronico", "Codigo", 10, new Cliente("I", "N", "C"));
        Factura factura2 = new FacturaFisica("Codigo", 10, new Cliente("I", "N", "C"));
        
        System.out.println("El total es:" + factura1.getTotal());
        System.out.println("El total es:" + factura2.getTotal());
    }
}
