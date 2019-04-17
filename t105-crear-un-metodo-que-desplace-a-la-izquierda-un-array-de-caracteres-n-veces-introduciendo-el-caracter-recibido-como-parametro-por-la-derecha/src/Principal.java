/**
 * T105-CREAR UN METODO QUE DESPLACE A LA IZQUIERDA UN ARRAY DE CARACTERES N VECES
 * INTRODUCIENDO EL CARACTER RECIBIDO COMO PARAMETRO POR LA DERECHA
 */
public class Principal {

    public static void main(String[] args) {

        char[] vocales = new char[]{'a', 'e', 'i', 'o', 'u'};
        desplazarIzquierda(vocales, '-', 3);
        ArrayUtil.mostrar(vocales, ",");

        System.out.println();

        char[] vacio = new char[0];
        desplazarIzquierda(vacio, '-', 1);
        ArrayUtil.mostrar(vacio, ",");

    }

    private static void desplazarIzquierda(char[] caracteres, char c) {
        assert caracteres != null : "Error: el array de caracteres no puede ser nulo";

        if (caracteres.length == 0)
            return;

        for (int i = 0; i < caracteres.length - 1; i++)
            caracteres[i] = caracteres[i + 1];

        caracteres[caracteres.length - 1] = c;
    }

    private static void desplazarIzquierda(char[] caracteres, char c, int veces) {
        assert caracteres != null : "Error: el array de caracteres no puede ser nulo";

        if (caracteres.length == 0)
            return;

        for (int i = 0; i < veces; i++)
            desplazarIzquierda(caracteres, c);
    }
}
