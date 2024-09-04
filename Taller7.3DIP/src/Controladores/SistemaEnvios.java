/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class SistemaEnvios {
    private IProcesarOrdenUPS procesarOrdenUPS;
    private IProcesarOrdenDHL procesarOrdenDHL;
    private IProcesarOrdenFedex procesarOrdenFedex;

    public SistemaEnvios() {
    }

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrdenDHL procesarOrdenDHL){
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenUPS = procesarOrdenUPS;
        this.procesarOrdenDHL = procesarOrdenDHL;
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
    
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
