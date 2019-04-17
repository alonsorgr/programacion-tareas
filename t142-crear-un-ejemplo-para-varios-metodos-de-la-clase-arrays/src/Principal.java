import java.util.Arrays;

/**
 * T142-CREAR UN EJEMPLO PARA VARIOS METODOS DE LA CLASE ARRAYS (VER LISTA)
 * <p>
 * BINARYSEARCH
 * FILL
 * SORT
 * TOSTRING
 */
public class Principal {

    public static void main(String[] args) {
        int[] n = new int[]{5, 8, 3, 0, 7, 9, 6, 1, 2};
        System.out.println("Array original: " + Arrays.toString(n));
        Arrays.fill(n, 2, 4, 4);
        System.out.println("Array rellenado: " + Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("Array ordenado: " + Arrays.toString(n));
        System.out.println("Posición del valor buscado (6): " + Arrays.binarySearch(n, 6));
    }
}
