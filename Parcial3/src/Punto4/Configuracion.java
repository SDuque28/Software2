/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Configuracion {
    private static Configuracion instancia;
    private Map<String, String> configuraciones;
    
    private Configuracion(){
        this.configuraciones = new HashMap<>();
        
        this.configuraciones.put("url", "localhost:8080");
        this.configuraciones.put("usuario", "santiago");
        this.configuraciones.put("password", "1234");
    }
    
    public static Configuracion getInstancia(){
        if(instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }
    
    public String getConfiguracion(String key){
        return configuraciones.get(key);
    }
    
    public void setConfiguracion(String key, String value){
        configuraciones.put(key, value);
    }
}
