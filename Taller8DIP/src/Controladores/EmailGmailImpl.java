/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmailGmailImpl extends Gmail implements IEnviarEmail{

    public EmailGmailImpl(String image, String to, String subject, String body) {
        super(image, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Se envia un correo desde Gmail");
    }
    
}
