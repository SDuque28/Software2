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
        FabricaPedidos fabrica = new FabricaPedidos();

        Cliente cliente = new Cliente("Santiago", "Direccion 1");

        Producto producto1 = new Producto("Laptop ", 150.2, 1);
        Producto producto2 = new Producto("Mouse  ", 250.7, 2);
        Producto producto3 = new Producto("Teclado", 100.3, 3);

        Pedido nuevoPedido = fabrica.crearPedido(cliente);
        
        nuevoPedido.addProductos(producto1);
        nuevoPedido.addProductos(producto2);
        nuevoPedido.addProductos(producto3);

        System.out.println("Detalles del pedido:");
        System.out.println("ID del pedido: " + nuevoPedido.getId());
        System.out.println("Fecha del pedido: " + nuevoPedido.getFecha());
        System.out.println("Cliente: " + nuevoPedido.getCliente().getNombre());
        System.out.println("Dirección: " + nuevoPedido.getCliente().getDireccion());

        System.out.println("Productos en el pedido:");
        for (Producto producto : nuevoPedido.getProductos()) {
            System.out.println("- " + producto.getNombre() + " | Precio: $" + producto.getPrecio() + " | Cantidad: " + producto.getCantidad());
        }
    }
    
}
