package org.iesdonana;

import java.util.ArrayList;
import java.util.List;

/**
 * T166-IMPLEMENTAR EL CALCULO DE LA SUCESION DE FIBONACCI DE FORMA ITERATIVA EN VEZ DE RECURSIVA
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        List<Integer> lista = new ArrayList<>();
        System.out.println(fibonacci(lista, 10));
    }
    
    private static int fibonacci(int numero) {

        int resultado = 0;

        for (int i = 0; i < numero; i++)
            if (i < 2)
                resultado = 1;
            else
                resultado = (fibonacci(numero - 1) + fibonacci(numero - 2));

        return resultado;
    }

    private static List<Integer> fibonacci(List<Integer> resultado, int numero){

        for(int i = 0; i < numero; i++)
            if(i < 2)
                resultado.add(i, 1);
            else
                resultado.add(resultado.get(i-1) + resultado.get(i-2));

        return resultado;
    }
}
