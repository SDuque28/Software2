/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cotroladores;

/**
 *
 * @author SANTIAGO DUQUE
 * 
 */
public interface PersistenciaProducto{
    void guardar(Producto producto);
    void obtenerTodos();
    void eliminar(String id);
    void buscar(String id);
}

