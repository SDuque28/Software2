/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neo4j;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String args[]){
        Neo4JConnection.connect();
        PersonaService personaService = new PersonaService();
        //Crear Personas
        personaService.crearPersona("123", "Santiago", 22);
        personaService.crearPersona("321", "Daniela", 20);
        personaService.crearPersona("753", "Juan", 24);
        System.out.println("Ejecución Exitosa");
        //Obtener personas
        Persona persona = personaService.obtenerPersona("123");
        if(persona != null){
            System.out.println("El nombre de la persona es:" + persona.getNombre());
        }
        //Modificar personas
        personaService.actualizarPersona("123", 18);
        System.out.println("Ejecucion Exitosa");
        //Eliminar persona
        personaService.eliminarPersona("123");
        System.out.println("Ejecucion Exitosa");
    }
}
