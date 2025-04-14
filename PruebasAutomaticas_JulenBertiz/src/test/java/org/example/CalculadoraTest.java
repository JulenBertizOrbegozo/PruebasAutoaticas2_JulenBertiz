package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {

    Calculadora calc;
    @BeforeEach
    void crear(){
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
        int multiplicacion = calc.multiplicacion(2,4);
        assertEquals(8, multiplicacion);
    }

    @Test
    void division() {
        double division = calc.division(6, 3);
        assertEquals(2, division);
    }

    @Test
    void divisionPorCero(){
        assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
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