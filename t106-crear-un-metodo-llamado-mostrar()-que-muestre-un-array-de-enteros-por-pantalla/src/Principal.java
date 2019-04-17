public class Principal {

    public static void main(String[] args) {
	    int[] numeros = {0,1,2,3,4,5,6,7,8,9};
	    mostrar(numeros, ',');
    }

    /**
     * Muestra por pantalla una lista (array) de números enteros separados por el caracter (,)
     * @param numeros Array de numeros enteros que se mostrará por pantalla
     * @param separador Caracter con el que se separará los numeros de la lista
     */
    private static void mostrar(int[] numeros, char separador) {
        assert numeros != null : "Error: el array de entrada no pùede ser nulo";

        if (numeros.length == 0)
            return;

        for (int i = 0; i < numeros.length; i++) {
            String caracter = (i != 0) ? String.valueOf(separador) : "";
            System.out.print(caracter + numeros[i]);
        }
    }
}
