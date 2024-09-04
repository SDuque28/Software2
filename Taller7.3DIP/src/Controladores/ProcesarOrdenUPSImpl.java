/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ProcesarOrdenUPSImpl implements IProcesarOrdenUPS{

    @Override
    public void enviarOrdenUPS(Orden orden) {
        System.out.println(orden.getLugarOrigen() + " a " + orden.getLugarDestino() + " UPS ");
    }
    
}
