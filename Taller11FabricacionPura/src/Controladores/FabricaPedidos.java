/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.Date;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class FabricaPedidos {
    private int contadorPedidos = 0; 

    public Pedido crearPedido(Cliente cliente) {
        int nuevoId = generarNuevoId();
        Date fechaActual = new Date(); 
        return new Pedido(nuevoId, fechaActual, cliente);
    }

    private int generarNuevoId() {
        return ++contadorPedidos;
    }
}
