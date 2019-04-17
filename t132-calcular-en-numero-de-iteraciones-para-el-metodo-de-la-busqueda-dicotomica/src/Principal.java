/**
 * T132-CALCULAR EN NUMERO DE ITERACIONES PARA EL METODO DE LA BUSQUEDA DICOTOMICA
 * USANDO UNA TABLA DE ANALISIS DE BUCLES PARA LOS CASOS SIGUIENTES (VER LISTA)
 * <p>
 * VALOR BUSCADO: 4
 * VALOR BUSCADO 8
 * VALOR BUSCADO:12
 * <p>
 * BUSCAR ESOS VALORES PARA LAS 2 LISTAS
 * <p>
 * 1,2,4,6,8,10
 * 0,1,2,4,6,8,10,12
 */
public class Principal {

    public static void main(String[] args) {
        int[] valores1 = {1, 2, 4, 6, 8, 10};
        int[] valores2 = {0, 1, 2, 4, 6, 8, 10, 12};

        mostrar(valores1, ", ", true);
        System.out.printf("Está en lista %d : %b\n", 4, buscarDicotomica(valores1, 4));
        System.out.printf("Está en lista %d : %b\n", 8, buscarDicotomica(valores1, 8));
        System.out.printf("Está en lista %d : %b\n", 12, buscarDicotomica(valores1, 12));

        System.out.println();

        mostrar(valores2, ", ", true);
        System.out.printf("Está en lista %d : %b\n", 4, buscarDicotomica(valores2, 4));
        System.out.printf("Está en lista %d : %b\n", 8, buscarDicotomica(valores2, 8));
        System.out.printf("Está en lista %d : %b\n", 12, buscarDicotomica(valores2, 12));
    }

    private static boolean buscarDicotomica(int[] numeros, int valorBuscado) {
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length - 1;
        int mitad = 0;
        while (izquierda <= derecha && !encontrado) {
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                encontrado = true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }

    public static void mostrar(int[] valores, String separador, boolean saltoLinea) {
        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length; i++) {
            String sep = (i != 0) ? separador : "";
            System.out.print(sep + valores[i]);
        }
        if (saltoLinea)
            System.out.println();
    }
}
