/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmailOutlookImpl extends Outlook implements IEnviarEmail{

    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }
   
    @Override
    public void enviarEmail() {
        System.out.println("Se envia un correo desde Outlook");
    }
    
}
