package pro.excepciones;

/**
 * T187-[EXCEPCIONES] REALIZAR UN EJEMPLO PENSADO POR EL ALUMNO DONDE SE USE MULTICATCH
 *
 * ¿QUE OCURRE EN EL CASO DE CAZAR UNA CLASE Y UNA SUBCLASE EXCEPCION EN LA MISMA LINEA DE LA CLAUSULA CATCH?
 *
 * Que me da error en tiempo de edición y compilacion porque detecta que ya está cazada en la superclase
 */
public class Principal {

    public static void main(String[] args) {
        try {
            dividir(10, 0);
        } catch (RuntimeException | ArithmeticException e) {
            System.err.println("Error: division por cero");
        }
    }

    /**
     * División
     *
     * @param numerador   numerador
     * @param denominador denominador
     * @return resultado de la división
     * @throws ArithmeticException si la division es por 0
     */
    private static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0)
            throw new ArithmeticException();
        return numerador / denominador;
    }
}
