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
        // Crear una fábrica moderna
        FabricaMuebles fabricaModerna = new FabricaModerna();
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mueble mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear(); // Salida: Creando una silla moderna.
        mesaModerna.crear();  // Salida: Creando una mesa moderna.
        
        // Crear una fábrica clásica
        FabricaMuebles fabricaClasica = new FabricaClasica();
        Silla sillaClasica = fabricaClasica.crearSilla();
        Mueble mesaClasica = fabricaClasica.crearMesa();
        sillaClasica.crear(); // Salida: Creando una silla clásica.
        mesaClasica.crear();  // Salida: Creando una mesa clásica.
    }
    
}
