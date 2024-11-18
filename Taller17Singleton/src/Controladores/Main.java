/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Settings settings = Settings.getInstancia();
        
        //Mostramos las configuraciones
        System.out.println("El tema actual es: " + settings.getConfiguracion("theme"));
        System.out.println("El idioma actual es: " + settings.getConfiguracion("language"));
        
        //Cambiar configuracion
        settings.setConfiguraciones("theme", "dark");
        settings.setConfiguraciones("language", "us");
        
        //Mostramos las configuraciones
        System.out.println("El nuevo tema es: " + settings.getConfiguracion("theme"));
        System.out.println("El nuevo idioma es: " + settings.getConfiguracion("language"));
        
        //Verificamos que las nuevas que se creen sean iguales
        Settings nuevoSettings = Settings.getInstancia();
        System.out.println("Las instancias son iguales: " + (nuevoSettings == settings));
    }
    
}
