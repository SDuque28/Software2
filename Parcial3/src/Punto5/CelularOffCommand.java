/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CelularOffCommand implements Command{
    private Celular celular;

    public CelularOffCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.apagar();
    }
}
