/**
 * T128-ANALIZAR EL ALGORITMO DE LA BURBUJA DIBUJANDO UNA TABLA DE ANALISIS DE BUCLES.
 * USAR EL DEPURADOR PARA VER LOS CAMBIOS DE VARIABLES
 */
public class Principal {
    public static void main(String[] args) {
        int[] numeros = {4, 15, -12, 3, 1, -1};
        ordenarBurbuja(numeros);
        mostrar(numeros, "; ",false);
    }

    private static void ordenarBurbuja(int[] numeros) {
        assert numeros != null : "Error: el array de numeros no puede ser nulo";

        if (numeros.length <= 1)
            return;

        boolean hayIntercambio;

        do {
            hayIntercambio = false;
            for (int i = 0; i <= numeros.length - 2; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    intercambiar(numeros, i, i + 1);
                    hayIntercambio = true;
                }
            }
        } while (hayIntercambio);
    }

    private static void intercambiar(int[] numeros, int a, int b) {
        assert numeros != null : "Error: el array de numeros no puede ser nulo";
        int aux = numeros[a];
        numeros[a] = numeros[b];
        numeros[b] = aux;
    }

    private static void mostrar(int[] valores, String separador, boolean saltoLinea) {
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
