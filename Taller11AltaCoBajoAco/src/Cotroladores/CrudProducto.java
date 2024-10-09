/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotroladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CrudProducto implements PersistenciaProducto{
    private List<Producto> productos; //Simula ser la base de datos

    public CrudProducto() {
        this.productos = new ArrayList<>();
    }

    public void eliminarProducto(String idProducto) {
        productos.removeIf(p -> p.getIdProducto().equals(idProducto));
        System.out.println("Producto eliminado");
    }

    @Override
    public void guardar(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    @Override
    public void obtenerTodos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre());
        }
    }

    @Override
    public void eliminar(String idProducto) {
        productos.removeIf(p -> p.getIdProducto().equals(idProducto));
        System.out.println("Producto eliminado");
    }

    @Override
    public void buscar(String idProducto) {
        Producto buscado = productos.stream()
                .filter(p -> p.getIdProducto().equals(idProducto))
                .findFirst()
                .orElse(null);
        
        if (buscado != null) {
            System.out.println("Producto encontrado: " + buscado.getIdProducto() + " - " + buscado.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
