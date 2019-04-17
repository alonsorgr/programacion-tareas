public class Ejercicio_11 {

    /**
     * Ejer. 5.11. Completa el método siguiente para que genere 100 números aleatorios entre 0 y
     * n. Este método debe devolver un array con la frecuencia de aparición de cada número.
     */

    public static void main(String[] args) {
        ArrayUtil.mostrar(frecuencias(100), ",");
    }

    private static int[] frecuencias(int n) {

        int longitud = 100;
        int contador = 0;
        int[] aleatorios = new int[longitud];
        int[] frecuencias = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            int numero = (int) (Math.random() * (n + 1));
            aleatorios[i] = numero;
        }

        for (int i = 0; i <= aleatorios.length - 1; i++) {
            for (int j = 0; j <= aleatorios.length - 1; j++) {
                if (aleatorios[j] == i)
                    contador++;
            }
            frecuencias[i] = contador;
            contador = 0;
        }
        return frecuencias;
    }
}
