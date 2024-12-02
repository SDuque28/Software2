/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.neo4j;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.Values;
import static org.neo4j.driver.Values.parameters;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PersonaService {
    private static final Driver driver = Neo4JConnection.getDriver();
    private Session session;

    public PersonaService() {
        session = driver.session(SessionConfig.forDatabase("bd2"));
    }
    
    public void crearPersona(String identificacion,String nombre, int edad){
        String cypherQuery = "CREATE (p:Persona (identificacion: $identificacion, nombre: $nombre, edad: $edad))";
        session.run(cypherQuery,parameters("id",identificacion,"nombre",nombre,"edad",edad));
        System.out.println("Persona creada: " + nombre);   
    }
    
    public Persona obtenerPersona(String identificaion){
        String cypherQuery = "MATCH (p:Persona (identificacion: $identificacion)) RETURN p.identificacion AS identificacion, p.nombre AS nombre, p.edad AS edad";
        org.neo4j.driver.Record record = session.run(cypherQuery,parameters("identificacion",identificaion)).single();
        if(record != null){
            return new Persona(
                    record.get("identificaion").asString(), 
                    record.get("nombre").asString(),
                    record.get("edad").asInt());
        }else{
            return null;
        }
    }
    
    public void actualizarPersona(String identificacion, int nuevaEdad){
        String cypherQuery = "MATCH (p:Persona (identificacion: $identificacion)) SET p.edad = $nuevaEdad";
        session.run(cypherQuery,parameters("identificacion",identificacion,"nuevaEdad",nuevaEdad));
        System.out.println("Persona actualizada");
    }
    
    public void eliminarPersona(String identificacion){
        String cypherQuery = "MATCH (p:Persona (identificacion: $identificacion)) DELETE p";
        session.run(cypherQuery,parameters("identificacion",identificacion));
        System.out.println("Persona eliminada");
    }
    
    public void crearRelacion(String id1, String id2){
        String cypherQuery = "MERGE (p1:Persona (identificacion: $identificacion))" + 
                             "";
    }
}
