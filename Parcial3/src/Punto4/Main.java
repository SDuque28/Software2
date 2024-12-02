/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args){
        Configuracion configuracion = Configuracion.getInstancia();
        
        System.out.println("La url del sistema es: " + configuracion.getConfiguracion("url"));
        System.out.println("El usuario del sistema es: " + configuracion.getConfiguracion("usuario"));
        
        configuracion.setConfiguracion("usuario", "pedro");
        
        System.out.println("El nuevo nombre de usuario es: " + configuracion.getConfiguracion("usuario"));
    }
}
