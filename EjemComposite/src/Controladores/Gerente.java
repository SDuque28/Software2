/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Gerente implements Empleado{
    private String nombre;
    private String puesto;
    private List<Empleado> empleados = new ArrayList<>();

    public Gerente(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    public void agregar(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: " + nombre + ", Puesto: " + puesto);
        for(Empleado empleado: empleados){
            empleado.mostrarDetalles();
        }
    }
}
