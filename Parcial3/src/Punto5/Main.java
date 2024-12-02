/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
    public static void main(String[] args){
        Computador computador = new Computador();
        Celular celular = new Celular();
        
        Command PrenderCelular = new CelularOnCommand(celular);
        Command ApagarCelular = new CelularOffCommand(celular);
        Command PrenderComputador = new ComputadorOnCommand(computador);
        Command ApagarComputador = new ComputadorOffCommand(computador);
        
        Usuario usuario = new Usuario();
        
        usuario.setCommand(PrenderCelular);
        usuario.action();
        
        usuario.setCommand(ApagarCelular);
        usuario.action();
        
        usuario.setCommand(PrenderComputador);
        usuario.action();
        
        usuario.setCommand(ApagarComputador);
        usuario.action();
    }
}
