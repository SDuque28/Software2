/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controladores.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    static void inicializar() {
        calculadora = new Calculadora(); 
    }

    @Test
    void sumaTest() {
        int resultado = calculadora.suma(2, 3);
        Assertions.assertEquals(5, resultado);
    }

    @Test
    void restaTest() {
        int resultado = calculadora.resta(4, 2);
        Assertions.assertNotEquals(3, resultado);
    }

    @Test
    void multiplicacionTest() {
        int resultado = calculadora.multiplicacion(4, 2);
        Assertions.assertTrue(resultado == 8);
    }

    @RepeatedTest(3)  
    void divisionTest() {
        float resultado = calculadora.division(4, 2);
        Assertions.assertFalse(resultado == 8);
    }
}
