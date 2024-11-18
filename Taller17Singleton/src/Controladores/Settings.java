/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;

    //Constructor privado
    private Settings() {
        configuraciones = new HashMap<>();
        //Cargar configuraciones predeterminadas
        configuraciones.put("theme", "light");
        configuraciones.put("language", "en");
    }
    
    public static Settings getInstancia(){
        if(instancia == null){
            instancia = new Settings();
        }
        return instancia;
    }
    
    public String getConfiguracion(String clave){
        return configuraciones.get(clave);
    }
    
    public void setConfiguraciones(String clave, String valor){
        configuraciones.put(clave, valor);
    }
}
