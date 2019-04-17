/**
 * T129-CREAR Y USAR UN METODO QUE RECIBA UN NUMERO DE PARAMETROS VARIABLE
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(calcularMedia(5, 3, 6, 8, 9, 1, 2, 6, 4));
    }

    private static double calcularMedia(int... notas) {

        double resultado = 0.0;

        for (int i = 0; i < notas.length; i++)
            resultado += notas[i];

        return resultado / notas.length;
    }
}
