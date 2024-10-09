/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cotroladores;


/**
 *
 * @author Santiago
 * 
 */
public interface PersistenciaFactura{
    void guardar(Factura factura);
    void obtenerTodos();
    void eliminar(String id);
    void buscar(String id);
}

