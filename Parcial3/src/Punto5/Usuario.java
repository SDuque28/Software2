/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Usuario {
    private Command command;
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    public void action(){
        this.command.execute();
    }
}
