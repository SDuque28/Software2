/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ChatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChatMediator mediator = new ChatMediator();
        
        Collage user1 = new User("Santiago", mediator);
        Collage user2 = new User("Daniela", mediator);
        Collage user3 = new User("Juan", mediator);
        
        mediator.addCollage(user1);
        mediator.addCollage(user2);
        mediator.addCollage(user3);
       
        user1.send("Hi everyone");
        user2.send("Whats the homework");
        user3.send("Just checking");
        
        mediator.send("Santiago checks", user1);
        
    }
    
}
