/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoIndividual empleado1 = new EmpleadoIndividual("nombre 1", "puesto 1");
        EmpleadoIndividual empleado2 = new EmpleadoIndividual("nombre 2", "puesto 2");
        EmpleadoIndividual empleado3 = new EmpleadoIndividual("nombre 3", "puesto 3");
        
        Gerente gerente1 = new Gerente("Pablo", "gerente 1");
        Gerente gerente2 = new Gerente("Pedro", "gerente 2");
        
        gerente1.agregar(empleado1);
        gerente1.agregar(empleado2);
        gerente2.agregar(empleado3);
        
        Gerente gerentePrincipal = new Gerente("Principal", "Admin");
        
        gerentePrincipal.agregar(gerente1);
        gerentePrincipal.agregar(gerente2);
        
        gerentePrincipal.mostrarDetalles();
    }
    
}
