/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Builder {
    public String tomate;
    public String queso;
    public String pan;
    public String carne;

    public Builder setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public Builder setQueso(String queso) {
        this.queso = queso;
        return this;
    }

    public Builder setTomate(String tomate) {
        this.tomate = tomate;
        return this;
    }

    public Builder setPan(String pan) {
        this.pan = pan;
        return this;
    }   
    
    public Hamburguesa build(){
        return new Hamburguesa(this);
    }
}
