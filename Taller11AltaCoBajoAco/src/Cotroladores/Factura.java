/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotroladores;

import java.util.Date;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Factura {
    private String numeroFactura;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;
    private double descuento;
    private Date fechaFactura; 

    public Factura() {
        this.numeroFactura = null;
        this.cliente = null;
        this.productos = null;
        this.total = 0;
        this.descuento = 0;
        this.fechaFactura = new Date();
    }
    
    public String generarNumeroFactura() {
        // Lógica para generar un número único (por ejemplo, usando timestamp)
        return "FACT-" + System.currentTimeMillis();
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public double getDescuento() {
        return descuento;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}
