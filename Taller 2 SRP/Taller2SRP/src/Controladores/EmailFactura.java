/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmailFactura {
    private Factura factura;

    /** 
     * @param factura 
     */
    public EmailFactura(Factura factura) {
        this.factura = factura;
    }

    public EmailFactura() {
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public void enviarEmail(){}
}
