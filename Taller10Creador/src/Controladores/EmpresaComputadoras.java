/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class EmpresaComputadoras {

    public EmpresaComputadoras() {
    }
    
    public Computadora crearComputadores(String procesador, String tarjetaGrafica, int ram){
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}
