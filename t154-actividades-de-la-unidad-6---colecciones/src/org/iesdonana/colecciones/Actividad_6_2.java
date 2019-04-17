package org.iesdonana.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Actividad 6.2 Analizar y probar el código siguiente para ver si se da autoboxing o boxing.
 */
public class Actividad_6_2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(10);
        for (int i = 0; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(sumarPares(numeros));
    }
    public static int sumarPares(List<Integer> li) {
        int sum = 0;
        for (Integer i: li) // SE DA UNBOXING
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
}
