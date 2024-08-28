/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto fisico = new ProductoFisico("Carro", 15.3, 2, 23.5);
        Producto digial = new ProductoDigital("Juego", 7.89, 56, 12.56);
        Producto mixto = new ProductoMixto("Consola", 55.8, 1, 5,8.69);
        
        ProductoFisico fisico2 = new ProductoFisico("", 0.1, 0, 0);
        ProductoMixto mixto2 = new ProductoMixto("", 0, 0, 0, 0);
        
        Factura factura = new Factura();
        
        System.out.println("Costo Fisico: " + factura.costo(fisico));
        System.out.println("Costo Digital: " + factura.costo(digial));
        System.out.println("Costo Mixto: " + factura.costo(mixto));
        
        fisico2.enviarCorreo();
        mixto2.enviarCorreo();
    }

    public Main() {
    }
    
}
