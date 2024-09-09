/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Sistema {
    private IEnviarEmail iEnviarEmail;

    public Sistema(IEnviarEmail iEnviarEmail) {
        this.iEnviarEmail = iEnviarEmail;
    }
    
    public void enviarEmail(){
       this.iEnviarEmail.enviarEmail();
    }
    
}
