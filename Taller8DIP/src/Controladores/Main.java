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
        Sistema sistema1 = new Sistema(new EmailGmailImpl(null, null, null, null));
        Sistema sistema2 = new Sistema(new EmailOutlookImpl(null, null, null));
        Sistema sistema3 = new Sistema(new EmailYahooImpl(null, null, null,null));
        sistema1.enviarEmail();
        sistema2.enviarEmail();
        sistema3.enviarEmail();
    }
    
}
