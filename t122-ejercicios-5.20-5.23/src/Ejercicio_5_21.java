import java.util.Arrays;

/**
 * Ejer. 5.21. Modifica el método de ordenación por inserción directa para ordenar un array de objetos String
 */
public class Ejercicio_5_21 {

    public static void main(String[] args) {
        String[] letras = {"o","x","a","n","m"};
        ordenarInsercionDirecta(letras);
        System.out.println(Arrays.toString(letras));
    }

    private static void ordenarInsercionDirecta(String[] array) {
        assert array != null : "Error: el array a ordenar no puede ser nulo";

        if (array.length <=1)
            return;

        int j;
        String aux;
        for ( int i = 1; i < array.length; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && array[j].compareTo(aux) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
}
