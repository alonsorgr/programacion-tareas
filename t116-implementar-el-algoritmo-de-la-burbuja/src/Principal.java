import java.util.Arrays;

/**
 * T116-IMPLEMENTAR EL ALGORITMO DE LA BURBUJA. REALIZAR PRUEBAS
 * Y ANALIZAR PARA EL CASO DE UNA ARRAY DE ENTEROS CON NUMEROS REPETIDOS
 *
 * IDEM PARA EL CASO DE UN ARRAY DE OBJETOS PENSADO POR EL ALUMNO
 */
public class Principal {

    public static void main(String[] args) {
        int[] numeros = {3, 5, 4, 9, 1, 2, 0, 8};
        ordenarBurbuja(numeros);
        System.out.println(Arrays.toString(numeros));

        int[] alturas = {170, 175, 180, 190, 172, 169};
        String[] nombres = {"Alonso","Enrique","Florido","Saborido","Jeréz","Hector"};
        Persona[] personas = new Persona[alturas.length];
        for (int i = 0; i < alturas.length; i++) {
            personas[i] = new Persona(nombres[i], alturas[i]);
        }

        System.out.println(Arrays.toString(personas));
        ordenarBurbuja(personas);
        System.out.println(Arrays.toString(personas));
    }

    private static void ordenarBurbuja(int[] numeros) {
        assert numeros != null : "Error: el array de numeros no puede ser nulo";

        if (numeros.length <= 1)
            return;

        boolean hayIntercambio = false;

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

    private static void ordenarBurbuja(Persona[] personas) {
        assert personas != null : "Error: el array de numeros no puede ser nulo";

        if (personas.length <= 1)
            return;

        boolean hayIntercambio = false;

        do {
            hayIntercambio = false;
            for (int i = 0; i <= personas.length - 2; i++) {
                if (personas[i].compareTo(personas[i + 1]) > 0) {
                    intercambiar(personas, i, i + 1);
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

    private static void intercambiar(Persona[] numeros, int a, int b) {
        assert numeros != null : "Error: el array de numeros no puede ser nulo";
        Persona aux = numeros[a];
        numeros[a] = numeros[b];
        numeros[b] = aux;
    }
}
