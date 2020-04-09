package org.cuatrovientos.ed20_Ejercicio1_Cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;


class TestCadena {

    private Cadena target;

    @BeforeEach
    void setUp() throws Exception {
        target = new Cadena();
    }
@Test
    void testLongitud() {
        int expected = 4;
        int actual = target.longitud("TEST");
        assertEquals(expected, actual, "TEST LONGITUD");
    }
@Test
    void testVocales() {
        int expected = 2;
        int actual = target.vocales("pablo");
        assertEquals(expected, actual, "TEST VOCAL");
    }
@Test
    void testInvertir() {
        String expected = "olbap";
        String actual = target.invertir("pablo");
        assertEquals(expected, actual, "TEST INVERTIR");
    }
@Test
    void testContarLetra() {
        int expected = 1;
        int actual = target.contarLetra("PABLO", 'A');
        assertEquals(expected, actual, "TEST CONTAR LETRA");

    }

}