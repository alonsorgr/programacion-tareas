import java.text.Collator;
import java.util.Locale;

/**
 * T152-IDEM ANTERIOR PERO PARA LAS VOCALES CON Y SIN TILDE UNICAMENTE
 */
public class Principal {

    public static void main(String[] args) {
        Collator esp = Collator.getInstance(new Locale("es", "ES"));
        String[] palabras = new String[]{
                "caña", "cana", "facil", "fácil"};
        mostrar(palabras, ", ", true);
        ordenarAscendentemente(palabras, esp);
        mostrar(palabras, ", ", false);

    }

    private static void ordenarAscendentemente(String[] palabras, Collator collator) {
        assert palabras != null : "Error: el array de personas no puede ser nulo";

        if (palabras.length <= 1)
            return;

        int posicion;
        String palabra;

        for (int i = 0; i < palabras.length-1; i++) {

            posicion = i;
            collator.setStrength(Collator.PRIMARY);
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
