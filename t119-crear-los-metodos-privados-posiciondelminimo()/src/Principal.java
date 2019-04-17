import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int[] array = {5, 6, 2, 8, 7, 9, 3, 4, 5, 8};
        ordenarSeleccionDirecta(array);
        System.out.println(Arrays.toString(array));
    }


    private static void ordenarSeleccionDirecta(int[] array) {
        assert array != null : "Error: el array a ordenar no puede ser nulo";

        if (array.length <= 1)
            return;

        int posmin;
        for (int i = 0; i < array.length - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < array.length; j++)
                posmin = posicionDelMinimo(array, j, posmin);

            intercambiar(array, posmin, i);
        }
    }

    private static void intercambiar(int[] numeros, int a, int b) {
        assert numeros != null : "Error: el array de colores no puede ser nulo";
        int aux = numeros[a];
        numeros[a] = numeros[b];
        numeros[b] = aux;
    }

    private static int posicionDelMinimo(int[] array, int a, int b) {
        assert array != null : "Error: el array a ordenar no puede ser nulo";
        return (array[a] < array[b]) ? a : b;
    }
}
