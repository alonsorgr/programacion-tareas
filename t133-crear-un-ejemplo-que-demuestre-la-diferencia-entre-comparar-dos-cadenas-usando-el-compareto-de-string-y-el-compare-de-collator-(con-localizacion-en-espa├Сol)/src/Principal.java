import java.text.Collator;
import java.util.Locale;

/**
 * T133-CREAR UN EJEMPLO QUE DEMUESTRE LA DIFERENCIA ENTRE COMPARAR DOS CADENAS USANDO EL COMPARETO DE STRING
 * Y EL COMPARE DE COLLATOR (CON LOCALIZACION EN ESPAÑOL)
 */
public class Principal {

    public static void main(String[] args) {
        String[] palabras1 = {"n", "ñ", "o", "p"};
        ordenarAscendentemente(palabras1);
        mostrar(palabras1, ", ", true);
        String[] palabras2 = {"n", "ñ", "o", "p"};
        Collator esp = Collator.getInstance(new Locale("es", "ES"));
        ordenarAscendentemente(palabras2, esp);
        mostrar(palabras2, ", ", false);
    }

    private static void ordenarAscendentemente(String[] palabras) {
        assert palabras != null : "Error: el array de personas no puede ser nulo";

        if (palabras.length <= 1)
            return;

        int posicion;
        String palabra;

        for (int i = 0; i < palabras.length-1; i++) {

            posicion = i;

            for (int j = i+1; j < palabras.length; j++)
                if (palabras[j].compareTo(palabras[posicion]) < 0)
                    posicion = j;

            palabra = palabras[posicion];
            palabras[posicion] = palabras[i];
            palabras[i] = palabra;
        }
    }

    private static void ordenarAscendentemente(String[] palabras, Collator collator) {
        assert palabras != null : "Error: el array de personas no puede ser nulo";

        if (palabras.length <= 1)
            return;

        int posicion;
        String palabra;

        for (int i = 0; i < palabras.length-1; i++) {

            posicion = i;

            for (int j = i+1; j < palabras.length; j++)
                if (collator.compare(palabras[j], palabras[posicion]) < 0)
                    posicion = j;

            palabra = palabras[posicion];
            palabras[posicion] = palabras[i];
            palabras[i] = palabra;
        }
    }

    private static void mostrar(String[] valores, String separador, boolean saltoLinea) {
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
