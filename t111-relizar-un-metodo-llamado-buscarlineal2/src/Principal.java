public class Principal {

    /**
     * T111-RELIZAR UN METODO LLAMADO BUSCARLINEAL2 QUE DEVUELVA UN ARRAY
     * CON LAS POSICIONES EN LAS QUE APARECE EN VALOR BUSCADO
     */

    public static void main(String[] args) {
        int[] numeros = {2, 5, 9, 6, 4, 21, 8, 8};
        for (int numero : buscarLineal(numeros, 88)) {
            System.out.print(numero);
        }

    }

    private static int[] buscarLineal(int[] numeros, int valorBuscado) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length == 0)
            return new int[0];

        int contador = 0;

        for (int numero : numeros)
            if (numero == valorBuscado)
                contador++;

        int[] resultado = new int[contador];

        for (int i = 0, j = 0; i < numeros.length; i++)
            if (numeros[i] == valorBuscado) {
                resultado[j] = i;
                j++;
            }

        return resultado;
    }

}
