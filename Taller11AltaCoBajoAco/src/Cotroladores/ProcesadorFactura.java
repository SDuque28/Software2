/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotroladores;

import java.util.List;

/**
 *
 * @author Santiago
 */
public class ProcesadorFactura {
    private final CrudFactura facturas;
    private final TotalServiceImpl facturaService;

    public ProcesadorFactura(CrudFactura facturas) {
        this.facturas = facturas;
        this.facturaService = new TotalServiceImpl();
    }

    public void procesarFactura(Cliente cliente, List<Producto> listaProducto) {
        Factura factura = new Factura();
        
        factura.setCliente(cliente);
        factura.setProductos(listaProducto);
        factura.setNumeroFactura(factura.generarNumeroFactura());
        
        double total = facturaService.CalcularTotal(factura);
        factura.setTotal(total);

        // Guardando la factura una vez procesada
        facturas.guardar(factura);
        facturas.buscar(factura.getNumeroFactura());
    }
}
