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
        Orden orden = new Orden();
        
        orden.agregarComputador("intelI3", "Nvidia4070", 8 );
        orden.agregarComputador("intelI5", "Nvidia4080", 16);
        orden.agregarComputador("intelI7", "Nvidia4090", 32);
        
        for(Computadora computadora: orden.getComputadores()){
            System.out.println("Procesador: " + computadora.getProcesador());
            System.out.println("Tarjeta Grafica: " + computadora.getTarjetaGrafica());
            System.out.println("RAM: " + computadora.getRam());
        }
    }
    
}
