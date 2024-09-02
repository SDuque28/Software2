/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso{
    private String etiquetaPeligro;
    private boolean embalajeE;

    public PaquetePeligroso() {
    }

    public PaquetePeligroso(String etiquetaPeligro, boolean embalajeE, float peso, int dimenciones) {
        super(peso,dimenciones);
        this.etiquetaPeligro = etiquetaPeligro;
        this.embalajeE = embalajeE;
    }

    public String getEtiquetaPeligro() {
        return etiquetaPeligro;
    }

    public void setEtiquetaPeligro(String etiquetaPeligro) {
        this.etiquetaPeligro = etiquetaPeligro;
    }

    public boolean isEmbalajeE() {
        return embalajeE;
    }

    public void setEmbalajeE(boolean embalajeE) {
        this.embalajeE = embalajeE;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificar Costo Peligroso");
    }

    @Override
    public void aegurarPaquetePeligroso() {
        System.out.println("Asegurar Peligroso");
    }
    
}
