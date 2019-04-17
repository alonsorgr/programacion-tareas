/**
 * Ejer. 5.15.
 * Implementa el siguiente método que devuelve la matriz identidad
 * La matriz identidad tiene la diagonal principal a 1 y el resto de los elementos a 0.
 */
public class Ejercicio_15 {

    public static void main(String[] args) {
        for (int i = 0; i < matrizIdentidad().length; i++) {
            for (int j = 0; j < matrizIdentidad()[i].length; j++)
                System.out.print(matrizIdentidad()[i][j]);
            System.out.println();
        }
    }

    private static int[][] matrizIdentidad() {

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (i == j)
                    matriz[i][i] = 1;
                else
                    matriz[i][j] = 0;

        return matriz;
    }
}
