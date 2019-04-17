/**
 * T121-CREAR UN METODO QUE INTERCAMBIE EL CONTENIDO DE DOS MATRICES
 * Las dos MATRICES tendrán que tener las mismas dimensiones (filas x columnas).
 * <p>
 * Opcional: realizar el ejercicio sin usar variables auxiliares
 */
public class Principal {
    public static void main(String[] args) {
        int[][] matriz1 = generarMatriz(5);
        int[][] matriz2 = generarMatriz(5);
        mostrar(matriz1, ",", true);
        System.out.println();
        mostrar(matriz2, ",", true);
        intercambiarMatriz(matriz1, matriz2);
        System.out.println();
        mostrar(matriz1, ",", true);
        System.out.println();
        mostrar(matriz2, ",", true);
    }

    private static void intercambiarMatriz(int[][] matriz1, int[][] matriz2) {
        assert matriz1 != null : "Error la matriz no puede ser nula";
        assert matriz2 != null : "Error la matriz no puede ser nula";
        assert matriz1.length == matriz2.length :
                String.format("Error: las matrices deben ser iguales de tamaño (%d)", matriz1.length);

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int aux;

        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++) {
                aux = matriz1[i][j];
                matriz1[i][j] = matriz2[i][j];
                matriz2[i][j] = aux;
            }
    }

    private static void intercambiarMatrizSinVariable(int[][] matriz1, int[][] matriz2) {
        assert matriz1 != null : "Error la matriz no puede ser nula";
        assert matriz2 != null : "Error la matriz no puede ser nula";
        assert matriz1.length == matriz2.length :
                String.format("Error: las matrices deben ser iguales de tamaño (%d)", matriz1.length);

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = matriz1[i][j] ^ matriz2[i][j];
                matriz2[i][j] = matriz1[i][j] ^ matriz2[i][j];
                matriz1[i][j] = matriz1[i][j] ^ matriz2[i][j];
            }
    }

    private static int[][] generarMatriz(int dimension) {
        assert dimension >= 0 :
                String.format("Error: dimension (%d) incorrecta. Debe ser mayor o igual a 0", dimension);

        int[][] resultado = new int[dimension][dimension];

        for (int i = 0; i < resultado.length; i++)
            for (int j = 0; j < resultado[i].length; j++)
                resultado[i][j] = (int) (Math.random() * 10);

        return resultado;
    }

    public static void mostrar(int[][] numeros, String separador, boolean saltoLinea) {
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
