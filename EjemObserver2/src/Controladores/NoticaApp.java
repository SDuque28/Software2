/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class NoticaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNoticia canalNoticia = new CanalNoticia();
        
        Observer usuario1 = new Usuario("Santiago");
        Observer usuario2 = new Usuario("Daniela");
        Observer usuario3 = new Usuario("Juan");
        
        canalNoticia.agregarSubscriptor(usuario1);
        canalNoticia.agregarSubscriptor(usuario2);
        canalNoticia.agregarSubscriptor(usuario3);
        
        canalNoticia.publicarNotica("A ocurrido un derrumbe");
        canalNoticia.publicarNotica("La ciudad cumple 50");
    }
    
}
