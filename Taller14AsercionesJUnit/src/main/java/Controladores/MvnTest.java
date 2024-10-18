/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class MvnTest {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Santiago", 22);
        
        estudiante.agrgarCalificacion(7.5);
        
        System.out.println(estudiante.getCalificaciones().size());
    }
}
