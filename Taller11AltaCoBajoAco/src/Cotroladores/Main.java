/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cotroladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrudProducto crudProducto = new CrudProducto();

        Producto producto1 = new Producto("1", "producto 1", 100);
        Producto producto2 = new Producto("2", "producto 2", 1509);

        // Guardar productos
        System.out.println("\nSe guardan los productos en la base de datos:");
        crudProducto.guardar(producto1);
        crudProducto.guardar(producto2);

        // Obtener productos
        System.out.println("\nProductos en la base de datos:");
        crudProducto.obtenerTodos();

        // Ejemplo de uso con Persistencia para Cliente
        CrudCliente crudCliente = new CrudCliente();

        Cliente cliente1 = new Cliente("1", "Cliente 1", "Dirección 1");
        Cliente cliente2 = new Cliente("2", "Cliente 2", "Dirección 2");
        
        System.out.println("\nSe guardan los clientes en la base de datos:");
        crudCliente.guardar(cliente1);
        crudCliente.guardar(cliente2);

        // Obtener clientes
        System.out.println("\nClientes en la base de datos:");
        crudCliente.obtenerTodos();
        
        // Ejemplo de uso con Persistencia para Factura
        System.out.println("\nProcesamiento de factura:");
        CrudFactura crudFactura = new CrudFactura();
        ProcesadorFactura procesadorFactura = new ProcesadorFactura(crudFactura);
        
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        procesadorFactura.procesarFactura(cliente2, productos);
    }
    
}
