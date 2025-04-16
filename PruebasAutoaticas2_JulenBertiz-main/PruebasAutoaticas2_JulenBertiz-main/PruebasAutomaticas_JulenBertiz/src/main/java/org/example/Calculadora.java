package org.example;

public class Calculadora {

    //Complejidad 1
    public int suma(int a, int b) {
        return a + b;
    }

    //Complejidad 1
    public int resta(int a, int b) {
        return a - b;
    }

    //Complejidad 1
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    //Complejidad 2
    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    //Complejidad 1
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    //Complejidad 5
    public int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    //Complejidad 3
    public boolean esDivisible(int numero, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        if (numero % divisor == 0) {
            return true;
        }
        return false;
    }
}
