/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    
    public static void main(String args[]){
        CalculoImpuestoIva iva1 = new CalculoImpuestoIva("Papa", 12, 22);
        CalculoImpuestoIva iva2 = new CalculoImpuestoIva("Manzana", 22, 42);
        CalculoImpuestoIva iva3 = new CalculoImpuestoIva("Acetaminofen", 11, 4);
        Factura factura = new Factura();
        System.out.println(factura.calcularFactura(iva1)+"");
        System.out.println(factura.calcularFactura(iva2)+"");
        System.out.println(factura.calcularFactura(iva3)+"");
    }
}
