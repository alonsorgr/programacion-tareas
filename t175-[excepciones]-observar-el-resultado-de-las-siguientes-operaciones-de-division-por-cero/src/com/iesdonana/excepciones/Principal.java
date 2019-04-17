package com.iesdonana.excepciones;

/**
 * T175-[EXCEPCIONES] OBSERVAR EL RESULTADO DE LAS SIGUIENTES OPERACIONES DE DIVISION POR CERO
 *
 * Crear dos métodos (uno para el caso entero y otro para el caso float).
 * Tras finalizar las operaciones de la lista crear un tercer método double y realizar y observar los resultados.
 *
 * Usar asimismo los métodos isNan, isInfinity para mostrar si los resultados no son un número o si son infinito.
 *
 */
public class Principal {

    public static void main(String[] args) {

        /*
	    // 1/0 (DIVISION ENTERA)
        System.out.println(divisionEntera(1,0));
        // -0/0 (DIVISION ENTERA)
        System.out.println(divisionEntera(-0,0));
        */

        // 0.0/0.0 (DIVISION REAL - FLOAT)
        // E isNaN indica si el resultado es un número
        System.out.println(Float.isNaN(divisionReal(0.0F, 0.0F)));
        // 0.0/-0.0 (DIVISION REAL - FLOAT)
        // El infinite indica que si el resultado de la division es infinito
        System.out.println(Float.isInfinite(divisionReal(-0.0F, 0.0F)));

        // 0.0/0.0 (DIVISION REAL - DOUBLE)
        // E isNaN indica si el resultado es un número
        System.out.println(Double.isNaN(divisionRealD(0.0, 0.0)));
        // 0.0/-0.0 (DIVISION REAL - DOUBLE)
        // El infinite indica que si el resultado de la division es infinito
        System.out.println(Double.isInfinite(divisionRealD(-0.0, 0.0)));

    }

    private static int divisionEntera(int numerador, int denominador) {
        return numerador / denominador;
    }

    private static float divisionReal(float numerador, float denominador) {
        return numerador / denominador;
    }

    private static double divisionRealD(double numerador, double denominador) {
        return numerador / denominador;
    }
}
