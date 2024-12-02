/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmpleadoIndividual implements Empleado{
    private String nombre;
    private String puesto;

    public EmpleadoIndividual(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " Puesto: " + puesto);
    }
    
}
