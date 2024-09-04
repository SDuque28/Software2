/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

import java.util.Date;

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
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenUPS, procesarOrdenDHL);
        Orden orden = new Orden(null, "Manizales", "Pereira");
        sistemaEnvios.enviarOrdenDHL(orden);
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
    }
    
}
