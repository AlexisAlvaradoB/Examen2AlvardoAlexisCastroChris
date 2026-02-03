package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class CalculadoraTest {

    //1era pruebas unitarias
    // PRUEBAS convertirNumero()

    @Test
    public void testConvertirNumeroBinario() {
        int resultado = Calculadora.convertirNumero("1010", 0); // Binario
        assertEquals(10, resultado);
    }

    @Test
    public void testConvertirNumeroHexadecimal() {
        int resultado = Calculadora.convertirNumero("A", 3); // Hexadecimal
        assertEquals(10, resultado);
    }


    // PRUEBAS realizarOperacion()


    @Test
    public void testRealizarOperacionSuma() {
        int resultado = Calculadora.realizarOperacion(5, 3, "+");
        assertEquals(8, resultado);
    }

    @Test
    public void testRealizarOperacionMultiplicacion() {
        int resultado = Calculadora.realizarOperacion(4, 2, "*");
        assertEquals(8, resultado);
    }


    // PRUEBAS convertirADestino()


    @Test
    public void testConvertirADestinoBinario() {
        String resultado = Calculadora.convertirADestino(10, 0);
        assertEquals("1010", resultado);
    }

    @Test
    public void testConvertirADestinoHexadecimal() {
        String resultado = Calculadora.convertirADestino(10, 3);
        assertEquals("a", resultado);
    }



    // 2das pruebas unitarias

    // convertirNumero: octal y entrada inválida
    @Test
    public void testConvertirNumeroOctal() {
        int resultado = Calculadora.convertirNumero("12", 1); // octal 12 = 10
        assertEquals(10, resultado);
    }

    @Test
    public void testConvertirNumeroInvalido() {
        int resultado = Calculadora.convertirNumero("2", 0); // '2' no es válido en binario
        assertEquals(-1, resultado);
    }

    // realizarOperacion: resta y división
    @Test
    public void testRealizarOperacionResta() {
        int resultado = Calculadora.realizarOperacion(10, 3, "-");
        assertEquals(7, resultado);
    }

    @Test
    public void testRealizarOperacionDivision() {
        int resultado = Calculadora.realizarOperacion(9, 3, "/");
        assertEquals(3, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void testRealizarOperacionDivisionPorCero() {
        Calculadora.realizarOperacion(1, 0, "/");
    }

    // convertirADestino: octal y decimal
    @Test
    public void testConvertirADestinoOctal() {
        String resultado = Calculadora.convertirADestino(10, 1);
        assertEquals("12", resultado);
    }

    @Test
    public void testConvertirADestinoDecimal() {
        String resultado = Calculadora.convertirADestino(10, 2);
        assertEquals("10", resultado);
    }

    // Prueba Encuentra()
    @Test
    public void testEncuentraElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Calculadora.Encuentra(lista, "a"));
    }
}