/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class AppClimatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosClimaticos datosClimaticos = new DatosClimaticos();
        
        Observer pantallaTelefono =  new PantallaTelefono();
        Observer pantallaTablet =  new PantallaTablet();
        
        datosClimaticos.agregarObservador(pantallaTablet);
        datosClimaticos.agregarObservador(pantallaTelefono);
        
        datosClimaticos.setCondicionesClimaticas("Soleado");
        datosClimaticos.notificarObservadores();
        datosClimaticos.setCondicionesClimaticas("Lluvioso");
        datosClimaticos.notificarObservadores();
    }
    
}
