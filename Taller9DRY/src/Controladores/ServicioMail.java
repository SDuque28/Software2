/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ServicioMail {

    public ServicioMail() {
    }
    
    public void verificarEmail(String email){
        if(!email.contains("@") || !email.contains(".")){
            System.out.println("Email Invalido");
        }
    }
}
