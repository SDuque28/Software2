/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CelularSuspenderCommand implements Command{
    private Celular celular;

    public CelularSuspenderCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
}
