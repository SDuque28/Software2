/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private List<String> intereses;

    public Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = builder.intereses;
    }
    
    public void infoUsuario(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
