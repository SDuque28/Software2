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
public class CrudCliente implements PersistenciaCliente{
    private List<Cliente> clientes;

    public CrudCliente() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void guardar(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente agregado: " + cliente.getNombre());
    }

    @Override
    public void obtenerTodos() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
        }
    }

    @Override
    public void eliminar(String idCliente) {
       clientes.removeIf(c -> c.getIdCliente().equals(idCliente));
        System.out.println("Cliente eliminado");
    }

    @Override
    public void buscar(String idCliente) {
        Cliente buscado = clientes.stream()
            .filter(c -> c.getIdCliente().equals(idCliente))
            .findFirst()
            .orElse(null);

        if (buscado != null) {
            System.out.println("Cliente encontrado: " + buscado.getNombre());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
