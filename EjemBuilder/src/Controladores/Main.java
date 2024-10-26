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
        Builder builder = new Builder().setMasa("Masa").setTamaño("Grande");
        Pizza pizza = builder.build();
        System.out.println(pizza.toString());
                
    }
    
}
