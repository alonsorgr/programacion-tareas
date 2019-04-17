public class Ejercicio_10 {

    /**
     * Ejer. 5.10. Implementa el método de la forma siguiente:
     * define un array local pares
     * genera números aleatorios entre 1 y 50 y guarda en el array los que sean pares
     * devuelve el array cuando esté completo (la constante MAX indica la longitud
     * del array)
     */

    public static void main(String[] args) {
        ArrayUtil.mostrar(generarPares(), ",", true);
    }

    private static int[] generarPares() {

        final int MAX = 10;
        int[] pares = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            int numero = (int)(Math.random() * (50+1) +1);
            if (numero % 2 == 0)
                pares[i] = numero;
        }
        return pares;
    }

}
