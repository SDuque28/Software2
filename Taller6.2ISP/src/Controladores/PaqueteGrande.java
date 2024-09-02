/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PaqueteGrande extends Paquete implements IPaqueteGrande{
    private float volumen;
    private String transporte;

    public PaqueteGrande() {
    }

    public PaqueteGrande(float volumen, String transporte, float peso, int dimenciones) {
        super(peso, dimenciones);
        this.volumen = volumen;
        this.transporte = transporte;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("Costo Grande");
    }
    
}
