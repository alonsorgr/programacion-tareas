package pro.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * REALIZAR METODOS (UNO POR TIPO DE EXCEPCION) DONDE SE LANCEN LOS SIGUIENTES TIPOS DE EXCEPCIONES (VER LISTA)
 *
 * PROVOCAR QUE SE PRODUZCAN DICHAS EXCEPCIONES MEDIANTE LA INVOCACIÓN DE DICHOS MÉTODOS CON ARGUMENTOS AL EFECTO.
 *
 * CAZAR DICHAS EXCEPCIONES:
 *
 * 1) EN EL MÉTODO LLAMANTE
 * 2) EN EL METODO QUE LLAMA AL LLAMANTE
 * 3) EN EL METODO MAIN
 *
 * NO ES NECESARIO HACER LOS PUNTOS 1-3 PARA CADA CASO DE LA LISTA DE TIPOS DE EXCEPCIONES DE ABAJO
 * PERO SI CUBRIR ESAS POSIBILIDADES EN LA TAREA
 *
 * ArithmeticException
 * InputMismatchException
 * IllegalStateException
 * IllegalArgumentException
 * NullPointerException
 */
public class Principal {

    public static void main(String[] args) {
        try {
            division(1, 0);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    // ArithmeticException
    private static int division(int numerador, int denominador) {
        if (denominador == 0)
            throw new ArithmeticException("Error: division por 0");
        return numerador / denominador;
    }

    // InputMismatchException
    private static void dividir() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int numerador;
        int denominador;
        try {
            System.out.println("Numerador: ");
            numerador = sc.nextInt();
            System.out.println("Denominador: ");
            denominador = sc.nextInt();
            System.out.println(division(numerador, denominador));
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    // NullPointerException
    private static Gato generar(String alias) {
        Gato gato = null;
        try {
            gato = new Gato(alias);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        return gato;
    }

    // IllegalArgumentException
    private static double media(int[] notas) throws NullPointerException, IllegalArgumentException {
        if (notas == null)
            throw new NullPointerException("Error: notas es nulo");
        if (notas.length <= 0)
            throw new IllegalArgumentException("Error: el array de notas no contiene elementos");

        double resultado = 0;

        for (int i = 0; i < notas.length; i++)
            resultado += notas[i];

        return resultado / notas.length;
    }


}
