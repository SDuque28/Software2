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
public class CrudFactura implements PersistenciaFactura{
    private List<Factura> facturas; //Simula la base de datos

    public CrudFactura() {
        this.facturas = new ArrayList<>();
    }

    @Override
    public void guardar(Factura factura) {
        facturas.add(factura);
        System.out.println("Factura agregada: " + factura.getNumeroFactura());
    }

    @Override
    public void obtenerTodos() {
        for (Factura factura : facturas) {
            System.out.println("Factura: " + factura.getNumeroFactura());
        }
    }

    @Override
    public void eliminar(String numeroFactura) {
        facturas.removeIf(f -> f.getNumeroFactura().equals(numeroFactura));
        System.out.println("Factura eliminada");
    }

    @Override
    public void buscar(String numeroFactura) {
        Factura buscada = facturas.stream()
                .filter(f -> f.getNumeroFactura().equals(numeroFactura))
                .findFirst()
                .orElse(null);
        
        if (buscada != null) {
            System.out.println("Factura encontrada: " + buscada.getNumeroFactura() + " | " + buscada.getTotal() + " | " + buscada.getFechaFactura() );
        } else {
            System.out.println("Factura no encontrada.");
        }
    }
}
