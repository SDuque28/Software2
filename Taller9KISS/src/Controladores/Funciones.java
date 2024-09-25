/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.Arrays;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Funciones {
    
    public Funciones() {
    }
    
    public void invertirCadena(String cadena){
        System.out.println("La cadena a invertir es 'Cadena' - '" + new StringBuilder(cadena).reverse().toString() + "'"); 
    }
    
    public void encontrarMayor(int[] numeros){
        System.out.println("El numero mayor es: " + Arrays.stream(numeros).max().getAsInt());
    }
}
