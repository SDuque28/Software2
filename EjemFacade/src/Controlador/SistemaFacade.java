/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class SistemaFacade {
    private SistemaDeConfirmacion confirmacion;
    private SistemaDeDisponibilidad disponibilidad;
    private SistemaDePago pago;

    public SistemaFacade() {
        confirmacion = new SistemaDeConfirmacion();
        disponibilidad = new SistemaDeDisponibilidad();
        pago = new SistemaDePago();
    }
    
    public void comprarBoleto(String evento, double monto){
        if(disponibilidad.verificarDisponibilidad(evento)){
            pago.procesarPago(monto);
            confirmacion.enviarConfirmacion(evento);
            System.out.println("Compra realizada con exito");
        }else{
            System.out.println("No hay disponibilidad");
        }
    }
}
