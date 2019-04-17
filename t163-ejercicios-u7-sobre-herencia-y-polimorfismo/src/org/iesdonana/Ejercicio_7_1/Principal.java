package org.iesdonana.Ejercicio_7_1;
/**
 * Ejer. 7.1.
 * Un objeto Casa tiene entre otros atributos superficie. Define la clase Casa de tal forma que
 * sea posible establecer un orden entre dos objetos del tipo Casa en base a su superficie. Usar la
 * interface Comparable.
 */
public class Principal {

    public static void main(String[] args) {
        Casa casa1 = new Casa(0, 10);
        Casa casa2 = new Casa(1, 20);
        Casa casa3 = new Casa(2, 5);
        Casa casa4 = new Casa(3, 9);

        Casa[] casas = new Casa[]{casa1, casa2, casa3, casa4};

        ordenarSeleccionDirecta(casas);

        mostrar(casas, ", ", true);
    }

    private static void ordenarSeleccionDirecta(Casa[] casas) {
        assert casas != null : "Error: el array de numeros no puede ser nulo";

        if (casas.length <= 1)
            return;

        int posmin;
        Casa aux;
        for (int i = 0; i < casas.length - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < casas.length; j++)
                if (casas[j].compareTo(casas[posmin]) < 0)
                    posmin = j;

            aux = casas[posmin];
            casas[posmin] = casas[i];
            casas[i] = aux;
        }
    }

    public static void mostrar(Casa[] valores, String separador, boolean saltoLinea) {
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
