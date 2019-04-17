public class ArrayUtil {

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     * @param separador Caracter con el que se separarán los elementos del array
     * @param saltoLinea Muestra un salto de linea
     */
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

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     * @param separador Caracter con el que se separarán los elementos del array
     */
    public static void mostrar(int[] valores, String separador) {
        if (valores == null || valores.length == 0)
            return;
        mostrar(valores, separador, false);
    }

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     */
    public static void mostrar(int[] valores) {
        if (valores == null || valores.length == 0)
            return;
        mostrar(valores, "", false);
    }

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     * @param separador Caracter con el que se separarán los elementos del array
     * @param saltoLinea Muestra un salto de linea
     */
    public static void mostrar(char[] valores, String separador, boolean saltoLinea) {
        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length; i++) {
            String sep = (i != 0) ? separador : "";
            System.out.print(sep + valores[i]);
        }
        if (saltoLinea)
            System.out.println();
    }

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     * @param separador Caracter con el que se separarán los elementos del array
     */
    public static void mostrar(char[] valores, String separador) {
        if (valores == null || valores.length == 0)
            return;
        mostrar(valores, separador, false);
    }

    /**
     * Muestra un array por pantalla delimitado por un separador
     * @param valores Array de entrada que será imprimido por pantalla
     */
    public static void mostrar(char[] valores) {
        if (valores == null || valores.length == 0)
            return;
        mostrar(valores, "", false);
    }


}
