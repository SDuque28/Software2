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
        // TODO code application logic here
        ServicioMail servicioMail1 = new ServicioMail();
        ServicioMail servicioMail2 = new ServicioMail();
        
        servicioMail1.verificarEmail("Email@Ejemplo1.");
        servicioMail2.verificarEmail("Email@Ejemplo2");
    }
    
}
