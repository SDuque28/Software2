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
        Notificador notificadorGmail = new Notificador(new EnviadorGmail());
        Usuario usuario1 = new Usuario("Juan", "123456", notificadorGmail);
        usuario1.generarCorreo();

        Notificador notificadorOutlook = new Notificador(new EnviadorOutlook());
        Usuario usuario2 = new Usuario("Ana", "654321", notificadorOutlook);
        usuario2.generarCorreo();
    }
    
}
