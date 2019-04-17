/**
 * T114-CREAR UN METODO LLAMADO PRIMOS QUE DEVUELVA UN ARRAY CON LOS NUMEROS PRIMOS QUE HAY EN UN ARRAY
 * DE NUMEROS ENTEROS. CADA NUMERO PRIMO DEBE ESTAR EN UN RANGO [A,B]. SE DEBE CREAR Y USAR LA CLASE RANGO
 */
public class Principal {
    public static void main(String[] args) {

        int[] resultado = primos(new int[]{2, 4, 6, 8, 10, 11, 12, 13, 17}, new Rango(10, 20));

        for (int e : resultado)
            System.out.print(e + " ");
    }

    private static int[] primos(int[] numeros, Rango rango) {
        assert numeros != null : "Error: el array de numeros de entrada no puede ser nulo";
        assert rango != null : "Error: el rango de entrada no puede ser nulo";

        if (numeros.length == 0)
            return new int[0];

        int contador = 0;

        for (int numero : numeros)
            if (esPrimo(numero))
                if (rango.esValido(numero))
                    contador++;

        int[] resultado = new int[contador];

        for (int i = 0, j = 0; i < numeros.length; i++)
            if (esPrimo(numeros[i]))
                if (rango.esValido(numeros[i]))
                    resultado[j++] = numeros[i];

        return resultado;
    }

    private static boolean esPrimo(int n) {
        return n % 2 != 0;
    }
}
