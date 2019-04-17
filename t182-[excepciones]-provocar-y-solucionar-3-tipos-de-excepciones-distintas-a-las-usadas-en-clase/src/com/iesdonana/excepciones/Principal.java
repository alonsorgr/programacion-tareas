package com.iesdonana.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * T182-[EXCEPCIONES] PROVOCAR Y SOLUCIONAR 3 TIPOS DE EXCEPCIONES DISTINTAS A LAS USADAS EN CLASE
 */
public class Principal {

    public static void main(String[] args) {

        // ARITHMETICEXCEPTION
        try {
            System.out.println(division(1, 0));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        // INPUTMISMATCHEXCEPTION
        boolean correcto = false;

        do {
            try {
                System.out.print("\nIntroduzca una edad: ");
                leerEdad();
                correcto = true;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        } while (!correcto);

        // NULLPOINTEREXCEPTION
        Persona p = generar(null);

    }

    private static int division(int numerador, int denominador) {
        return numerador / denominador;
    }

    private static int leerEdad() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static Persona generar(String alias) {
        Persona p = null;

        try {
            p = new Persona(alias);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        return p;
    }

}
