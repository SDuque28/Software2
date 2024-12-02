/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PantallaTablet implements Observer{

    @Override
    public void actualizar(String condicionClimatica) {
        System.out.println("Pantalla tablet, la condicion climatica es: " + condicionClimatica);
    }
}
