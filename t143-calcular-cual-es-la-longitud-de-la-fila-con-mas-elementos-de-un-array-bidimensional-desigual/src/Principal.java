/**
 * T143-CALCULAR CUAL ES LA LONGITUD DE LA FILA CON MAS ELEMENTOS DE UN ARRAY BIDIMENSIONAL DESIGUAL.
 * PONER DOS EJEMPLOS
 */
public class Principal {

    public static void main(String[] args) {
	    int[][] numeros = new int[5][];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new int[(int) (Math.random() * 10)];
        }

	    mostrar(numeros, ", ", true);

        System.out.println("\nNúmero de elementos de la fila mayor: "+filaMayor(numeros));
    }

    private static int filaMayor(int[][] numeros) {
        assert numeros != null : "Error: el array numeros no puede ser nulo";

        int aux = numeros[0].length;

        for (int i = 0; i < numeros.length -1; i++) {
            if (aux < numeros[i+1].length)
                aux = numeros[i+1].length;
        }

        return aux;
    }

    private static void mostrar(int[][] numeros, String separador, boolean saltoLinea) {
        if (numeros == null || numeros.length == 0)
            return;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                String sep = (j != 0) ? separador : "";
                System.out.print(sep + numeros[i][j]);
            }
            if (saltoLinea)
                System.out.println();
        }

    }
}
