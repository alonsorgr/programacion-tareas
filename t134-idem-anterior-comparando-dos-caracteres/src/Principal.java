import java.text.Collator;
import java.util.Locale;

/**
 * T134-IDEM ANTERIOR COMPARANDO DOS CARACTERES
 */
public class Principal {

    public static void main(String[] args) {
        char[] letras1 = {'n', 'ñ', 'o', 'p'};
        mostrar(letras1, ", ", true);
        ordenarAscendentemente(letras1);
        mostrar(letras1, ", ", true);
        System.out.println();
        char[] letras2 = {'n', 'ñ', 'o', 'p'};
        mostrar(letras2, ", ", true);
        Collator esp = Collator.getInstance(new Locale("es", "ES"));
        ordenarAscendentemente(letras2, esp);
        mostrar(letras2, ", ", true);
    }

    private static void ordenarAscendentemente(char[] caracteres) {
        assert caracteres != null : "Error: el array de numeros no puede ser nulo";

        if (caracteres.length <= 1)
            return;

        int posmin;
        char aux;
        for (int i = 0; i < caracteres.length - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < caracteres.length; j++)
                if (caracteres[j] < caracteres[posmin])
                    posmin = j;

            aux = caracteres[posmin];
            caracteres[posmin] = caracteres[i];
            caracteres[i] = aux;
        }
    }

    private static void ordenarAscendentemente(char[] letras, Collator collator) {
        assert letras != null : "Error: el array de personas no puede ser nulo";

        if (letras.length <= 1)
            return;

        int posicion;
        char caracter;

        for (int i = 0; i < letras.length-1; i++) {

            posicion = i;
            String letra1;
            String letra2;

            for (int j = i+1; j < letras.length; j++) {
                letra1 = String.valueOf(letras[j]);
                letra2 = String.valueOf(letras[posicion]);
                if (collator.compare(letra1, letra2) < 0)
                    posicion = j;
            }

            caracter = letras[posicion];
            letras[posicion] = letras[i];
            letras[i] = caracter;
        }
    }

    private static void mostrar(char[] valores, String separador, boolean saltoLinea) {
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
