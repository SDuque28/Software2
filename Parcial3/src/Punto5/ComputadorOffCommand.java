/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class ComputadorOffCommand implements Command{
    private Computador computador;

    public ComputadorOffCommand(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        this.computador.apagar();
    }
}
