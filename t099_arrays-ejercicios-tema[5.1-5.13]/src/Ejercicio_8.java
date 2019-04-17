public class Ejercicio_8 {

    /**
     * Ejer. 5.8. Define un método que reciba como parámetro un array de enteros y devuelva otro
     * array con los valores pares encontrados en el original.
     */

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9};

        for (int e: pares(numeros))
            System.out.print(e);

    }

    private static int[] pares(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length <= 1)
            return numeros;

        int longitud = 0;
        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i] % 2 ==0)
                longitud++;
        }

        int[] pares = new int[longitud];

        for (int i = 0, j = 0; i < numeros.length -1; i++)
            if (numeros[i] % 2 == 0) {
                pares[j] = numeros[i];
                j++;
            }
        return pares;
    }
}
