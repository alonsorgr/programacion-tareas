package iesdonana.primitiva.utiles;

import java.util.Arrays;

public class Util {
    public static void generarAleatorio(int[] numeros, boolean ordenar) {
        int i = 0;
        boolean correcto = true;
        int aleatorio;
        while (i < 6) {
            aleatorio = (int) (Math.random() * 49);
            for (int j = 1; j < 6; j++)
                if (numeros[j] == aleatorio)
                    correcto = false;
            if (correcto) {
                numeros[i] = aleatorio;
                i++;
            }
            correcto = true;
        }

        if (ordenar)
            Arrays.sort(numeros);
    }
}
