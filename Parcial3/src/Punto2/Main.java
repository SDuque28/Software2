/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {
   public static void main(String[] args){
       Builder builder = new Builder().setCarne("Angus").setPan("Integral");
       Hamburguesa hamburguesa = builder.build();
       hamburguesa.infoHamburguesa();
   }
}
