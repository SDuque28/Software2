/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmailYahooImpl extends Yahoo implements IEnviarEmail{

    public EmailYahooImpl(String archivo, String to, String subject, String body) {
        super(archivo, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Se envia un correo por yahoo");
    }
    
}
