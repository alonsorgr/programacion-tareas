/**
 * T117-ANALIZAR EL ALGORITMO DE ORDENACION POR INSERCION DIRECTA PARA EL ARRAY: 4, 15, -12, 3, 1, -1
 */
public class Principal {

    public static void main(String[] args) {
        int[] numeros = {4, 15, -12, 3, 1, -1};
        ordenarInsercionDirecta(numeros);
        mostrar(numeros, "; ", false);
    }

    private static void ordenarInsercionDirecta(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no pude ser nulo";

        if (numeros.length <= 1)
            return;

        int aux, j;

        for (int i = 1; i < numeros.length; i++) {
            aux = numeros[i];
            j = i - 1;
            while (j >= 0 && numeros[j] > aux) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = aux;
        }
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
