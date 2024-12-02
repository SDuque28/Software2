/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3;

/**
 *
 * @author SANTIAGO DUQUE
 */
public interface SistemaDePago {
    public void cerrarSesion(String nombre);
    public void validarCorreo(String correo);
    public void validarAutorizacion();
    public void realizarPago();
    
    
}
