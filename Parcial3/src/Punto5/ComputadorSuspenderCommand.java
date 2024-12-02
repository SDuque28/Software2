/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ComputadorSuspenderCommand implements Command{
    private Computador computador;

    public ComputadorSuspenderCommand(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        this.computador.suspender();
    }
}
