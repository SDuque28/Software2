/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex{

    @Override
    public void enviarOrdenFedex(Orden orden) {
        System.out.println(orden.getLugarOrigen() + " a " + orden.getLugarDestino() + " Fedex ");
    }
    
}
