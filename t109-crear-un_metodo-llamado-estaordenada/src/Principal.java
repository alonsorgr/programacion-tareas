public class Principal {

    /**
     * T109-CREAR UN METODO LLAMADO ESTAORDENADA QUE RECIBA UN ARRAY DE NUMEROS ENTEROS
     * Y DEVUELVA SI EL ARRAY ESTA ORDENADO ASCENDENTEMENTE
     */

    public static void main(String[] args) {
        int[] ordenada = {1,3,5,6,8,10,30};
        int[] desordenada = {1,3,5,6,8,1,3};
        System.out.println(estaOrdenada(ordenada));
        System.out.println(estaOrdenada(desordenada));
    }

    private static boolean estaOrdenada(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length <= 1)
            return true;

        for (int i = 0; i < numeros.length - 1; i++)
            if (numeros[i] > numeros[i + 1])
                return false;
        return true;
    }
}
