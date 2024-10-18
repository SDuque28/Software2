/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controladores.Estudiante;
import org.junit.jupiter.api.*;

//@SpringBootTest
class EstudianteTest {

    static Estudiante estudiante;

    @BeforeAll
    static void beforeAll() {
        estudiante = new Estudiante("Juan", 20);
        System.out.println("Inicializando recursos para los tests...");
    }

    @AfterAll
    static void afterAll() {
        estudiante = null;
        System.out.println("Liberando recursos después de los tests...");
    }

    @Test
    void agregarCalificacionTest() {
        estudiante.agrgarCalificacion(8.5);
        Assertions.assertEquals(1, estudiante.getNumeroCalificaciones());
    }

    @Test
    void obtenerPromedioTest() {
        estudiante.agrgarCalificacion(7.0);
        estudiante.agrgarCalificacion(9.0);
        double promedioEsperado = (8.5 + 7.0 + 9.0) / 3; // promedio esperado de las tres calificaciones
        Assertions.assertEquals(promedioEsperado, estudiante.obtenerPromedio());
    }

    @Test
    void agregarCalificacionInvalidaTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> estudiante.agrgarCalificacion(12.0));
    }
}
