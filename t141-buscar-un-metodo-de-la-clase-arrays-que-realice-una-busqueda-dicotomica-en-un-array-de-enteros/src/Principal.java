import java.util.Arrays;

/**
 * T141-BUSCAR UN METODO DE LA CLASE ARRAYS QUE REALICE UNA BUSQUEDA DICOTOMICA EN UN ARRAY DE ENTEROS
 *
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#binarySearch(int%5B%5D,int)
 *
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#sort(int%5B%5D)
 */
public class Principal {

    public static void main(String[] args) {

        int[] numeros = new int[]{9, 3, 5, -3, -6, 8, 7, 1, 2};
        Arrays.sort(numeros);
        System.out.println(Arrays.binarySearch(numeros, -3));

    }

}
