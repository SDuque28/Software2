/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Orden {
    private List<Computadora> computadores = new ArrayList<>();
    private EmpresaComputadoras empresaComputadoras = new EmpresaComputadoras();
 
    public void agregarComputador(String procesador, String tarjetaGrafica, int ram){
        Computadora computadora = empresaComputadoras.crearComputadores(procesador, tarjetaGrafica, ram);
        computadores.add(computadora);
    }

    public Orden() {
    }

    public List<Computadora> getComputadores() {
        return computadores;
    }

    public void setComputadores(List<Computadora> computadores) {
        this.computadores = computadores;
    }

    public EmpresaComputadoras getEmpresaComputadoras() {
        return empresaComputadoras;
    }

    public void setEmpresaComputadoras(EmpresaComputadoras empresaComputadoras) {
        this.empresaComputadoras = empresaComputadoras;
    }
    
}
