public class Ejercicio_13 {

    /**
     * Ejer. 5.13.
     * Modifica el método buscarLineal() para que devuelva la posición donde se ha encontrado el elemento
     * o –1 si no está.
     */

    public static void main(String[] args) {
        int[] numeros = {2,55,33,6,4,8,9,6,4,76};
        System.out.println(buscarLineal(numeros, 9));
    }

    private static int buscarLineal(int[] numeros, int valorBuscado) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length == 0)
            return -1;

        boolean encontrado = false;
        int i = 0;
        while (i < numeros.length && !encontrado)
            if (numeros[i] == valorBuscado) {
                encontrado = true;
            }
            else
                i++;
        return encontrado ? i : -1;
    }

}
