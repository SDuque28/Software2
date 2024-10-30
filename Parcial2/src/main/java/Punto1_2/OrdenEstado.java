/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class OrdenEstado {

    public OrdenEstado() {
    }
    
    public String obtenerEstado(int ordenId){
        return (ordenId < 0)?"Orden Invalida":(ordenId == 0 || (ordenId >= 50 && ordenId <= 100))?"Pendiente":(ordenId > 100)?"Completada":"En Progreso";
    }
}
