public class Ejercicio_4 {

    /**
     * Declara dentro del método main() en una clase Principal un array local de 5
     * elementos enteros e inicialízalo con los valores 1, 2, 3, 5, 7 (declara e inicializa en
     * una sola sentencia usando un literal de array). Muestra luego el contenido del
     * array por pantalla. Usa también el depurador para ver el contenido del array.
     */

    public static void main(String[] args) {

        int[] valores = {1,2,3,5,7};
        for (int e: valores) {
            System.out.print(e);
        }
    }
}
