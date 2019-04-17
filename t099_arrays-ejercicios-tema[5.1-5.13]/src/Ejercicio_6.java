public class Ejercicio_6 {

    /**
     * Implementa el siguiente método que calcula la media aritmética del array que
     * recibe como parámetro: public double media(double[] notas)
     */

    public static void main(String[] args) {

        double[] notas = {5,5,5};
        System.out.println(media(notas));
    }
    public static double media(double[] notas) {
        assert notas != null : "Error: el array notas no puede ser nulo";

        int longitud = notas.length;

        double resultado = 0;

        for (int i = 0; i < longitud; i++)
            resultado += notas[i];

        resultado = resultado / longitud;

        return resultado;
    }
}
