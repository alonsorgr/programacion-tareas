/**
 * T118-ANALIZAR EL ALGORITMO DE ORDENACION POR SELECCION DIRECTA PARA EL ARRAY 4, 15, -12, 3, 1, -1.
 * USAR UNA TABLA DE ANALISIS DE BUCLES Y EL DEPURADOR
 */
public class Principal {

    public static void main(String[] args) {
        int[] numeros = {4, 15, -12, 3, 1, -1};
        ordenarSeleccionDirecta(numeros);
        mostrar(numeros, ", ", false);
    }

    private static void ordenarSeleccionDirecta(int[] numeros) {
        assert numeros != null : "Error: el array de numeros no puede ser nulo";

        if (numeros.length <= 1)
            return;

        int posmin, aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < numeros.length; j++)
                if (numeros[j] < numeros[posmin])
                    posmin = j;

            aux = numeros[posmin];
            numeros[posmin] = numeros[i];
            numeros[i] = aux;
        }
    }

    public static void mostrar(int[] valores, String separador, boolean saltoLinea) {
        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length; i++) {
            String sep = (i != 0) ? separador : "";
            System.out.print(sep + valores[i]);
        }
        if (saltoLinea)
            System.out.println();
    }
}
