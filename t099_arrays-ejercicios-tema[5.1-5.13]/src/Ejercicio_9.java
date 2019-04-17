public class Ejercicio_9 {

    /**
     * Ejer. 5.9. Construye el siguiente método que rota una posición a la derecha el array numeros.
     */

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        rotarDerecha(numeros,3);
        ArrayUtil.mostrar(numeros, ",", true);
    }

    private static void rotarDerecha(int[] numeros, int veces) {

        for (int i = 0; i <= veces; i++)
            rotarDerecha(numeros);
    }

    private static void rotarDerecha(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if(numeros.length <= 1)
            return;

        for (int i = numeros.length - 1; i > 0; i--) {
            int aux = numeros[i];
            numeros[i] = numeros[i - 1];
            numeros[i - 1] = aux;
        }
    }
}
