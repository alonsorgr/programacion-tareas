public class Principal {

    /**
     * T104-CREAR UN METODO QUE MEZCLE DOS ARRAYS DE CARACTERES Y DEVUELVA EL ARRAY RESULTANTE
     */

    public static void main(String[] args) {

        char[] a1 = {'P', 'L', 'T'};
        char[] b1 = {'E', 'O', 'A'};

        char[] a2 = {'1','2','3'};
        char[] b2 = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println(mezclar(a1, b1));
        System.out.println(mezclar(a2, b2));
    }

    private static char[] mezclar(char[] a, char[] b) {
        assert a != null : "Error: el array de entrada no puede ser nulo";
        assert b != null : "Error: el array de entrada no puede ser nulo";

        char[] resultado = new char[a.length + b.length];

        int contador = 0;
        int longitud = (a.length > b.length) ? a.length : b.length;

        for (int i = 0; i < longitud; i++) {
            if (i < a.length)
                resultado[contador++] = a[i];
            if (i < b.length)
                resultado[contador++] = b[i];
        }
        return resultado;
    }
}
