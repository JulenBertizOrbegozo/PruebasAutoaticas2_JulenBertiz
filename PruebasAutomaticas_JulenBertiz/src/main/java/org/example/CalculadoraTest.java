package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.Assert.*;


class CalculadoraTest {
    Calculadora calc;

    @BeforeEach
    void antesDeCadaUno(){
        calc = new Calculadora();
    }

    @Test
    void suma() {
        int suma = calc.suma(1,2);
        assertEquals(3, suma);
    }

    @Test
    void resta() {
        int resta = calc.resta(34,3);
        assertEquals(31,resta);
    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }

    @Test
    void esPar() {
    }

    @Test
    void maximo() {
    }

    @Test
    void esDivisible() {
    }
}