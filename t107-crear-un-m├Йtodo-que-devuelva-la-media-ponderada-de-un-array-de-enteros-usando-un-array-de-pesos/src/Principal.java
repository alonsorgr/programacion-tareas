public class Principal {

    /**
     * T107-CREAR UN MÉTODO QUE DEVUELVA LA MEDIA PONDERADA DE UN ARRAY DE ENTEROS USANDO UN ARRAY DE PESOS.
     * RECIBE 2 ARRAYS: NUMEROS Y PESOS.
     */

    public static void main(String[] args) {

        double[] pesos = {0.15, 0.25, 0.50, 0.10};
        int[] numeros = {3,1,2,4};

        System.out.println(mediaPonderada(pesos, numeros));

    }
    /**
     * Calcula la media ponderada de dos elementos Array
     * @param pesos Array no nulo y de misma longitud que numeros
     * @param numeros Array no nulo y de misma longitud que pesos
     * @return Media ponderada
     */
    private static double mediaPonderada(double[] pesos, int[] numeros) {
        assert pesos != null : "Error: El array de entrada no puede ser nulo";
        assert numeros != null : "Error: El array de entrada no puede ser nulo";
        assert pesos.length == numeros.length :
                String.format("Error: longitud diferente {numeros = %d} {pesos = %d}", numeros.length, pesos.length);

        int longitud = numeros.length;

        double sumaPesos = 0;
        int sumaNumeros = 0;

        for (int i = 0; i <= longitud -1; i++) {
            sumaPesos += numeros[i] * pesos[i];
            sumaNumeros += numeros[i];
        }

        return sumaPesos / sumaNumeros;
    }
}
