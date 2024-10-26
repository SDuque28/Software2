/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Titulo 1", "Autor 1");
        Libro libro2 = (Libro) libro1.clone();
        libro1.getInfo();
        libro2.setTitulo("Titulo 2");
        libro2.getInfo();
    }
    
}
