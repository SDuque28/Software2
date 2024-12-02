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
        // TODO code application logic here
        Light light = new Light();
        Fan fan = new Fan();
        
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);
        
        RemoteControl remoteControl = new RemoteControl();
        
        remoteControl.setCommand(fanOn);
        remoteControl.pressButton();
        
        remoteControl.setCommand(fanOff);
        remoteControl.pressButton();
        
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();
        
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
    
}
