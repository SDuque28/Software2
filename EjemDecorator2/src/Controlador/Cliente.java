/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensaje mensajeSimple = new MensajeSimple("Este es el mensaje");
        
        mensajeSimple = new EncriptarMensaje(mensajeSimple);
        mensajeSimple = new ComprimirMensaje(mensajeSimple);
        mensajeSimple = new MensajeUrgente(mensajeSimple);
        
        System.out.println(mensajeSimple.obtenerContenido());
    }
    
}
