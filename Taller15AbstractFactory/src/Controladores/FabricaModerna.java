/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class FabricaModerna implements FabricaMuebles{

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mueble crearMesa() {
        return new MesaModerna();
    }
    
}
