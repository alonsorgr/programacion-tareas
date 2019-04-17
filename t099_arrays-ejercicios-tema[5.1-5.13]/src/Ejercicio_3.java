public class Ejercicio_3 {

    /**
     * Ejer. 5.3. Escribe el código para:
     * Asignar a la variable numeroElementos la longitud del array diasMes
     * Suponiendo que el año es bisiesto asigna a febrero 29 días
     */

    public static void main(String[] args) {
        int[] diasMes = {31,29,31,30,31,30,31,31,30,31,30,31};
        int numeroElementos = diasMes.length;
        System.out.println(numeroElementos);
    }
}
