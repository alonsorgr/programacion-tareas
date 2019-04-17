public class Ejercicio_7 {

    /**
     * Ejer. 5.7. Define un método que reciba un array de enteros y devuelva el valor máximo.
     */

    public static void main(String[] args) {
        int[] numeros = {5,15,50,10,8,9,};
        System.out.println(maximo(numeros));
    }

    private static int maximo(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        int resultado = 0;
        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i] > resultado)
                resultado = numeros[i];
        }
        return resultado;
    }
}
