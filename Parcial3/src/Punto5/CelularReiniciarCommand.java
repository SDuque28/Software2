/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class CelularReiniciarCommand implements Command{
    private Celular celular;

    public CelularReiniciarCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.reiniciar();
    }
}
