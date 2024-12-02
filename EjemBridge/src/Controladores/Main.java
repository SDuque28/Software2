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
        PlataformaMensaje correo = new CorreoElectronico();
        PlataformaMensaje sms = new SMS();
        
        MensajeNormal mensajeNormal = new MensajeNormal(correo);
        mensajeNormal.enviar("Holaa");
        
        MensajeUrgente mensajeUrgente = new MensajeUrgente(sms);
        mensajeUrgente.enviar("Adioss");
    }
    
}
