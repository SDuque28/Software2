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
public class Estudiante {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }
    
    public void agrgarCalificacion(double calificacion){
        if (calificacion < 0 || calificacion > 10){
            throw new IllegalArgumentException("La calificacion debe estar entre 0 y 10");
        }else{
            calificaciones.add(calificacion);
        }
    }
    
    public double obtenerPromedio(){
        return getCalificaciones().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the calificaciones
     */
    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    /**
     * @param calificaciones the calificaciones to set
     */
    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public int getNumeroCalificaciones(){
        return calificaciones.size();
    }
}
