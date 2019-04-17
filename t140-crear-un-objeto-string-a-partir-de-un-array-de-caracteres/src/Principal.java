/**
 * T140-CREAR UN OBJETO STRING A PARTIR DE UN ARRAY DE CARACTERES.
 * VER DOCUMENTACION DE LA CLASE STRING EN LA API DE JAVA EN ORACLE
 * <p>
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#%3Cinit%3E(char%5B%5D)
 */
public class Principal {

    public static void main(String[] args) {
        char[] caracteres = new char[]{'H', 'O', 'L', 'A'};
        System.out.println(caracteresCadena(caracteres));
    }

    /**
     * Convierte un array de caracteres a un objeto String
     *
     * @param caracteres    array de caracteres no nulo
     * @return              devuelve un objeto String formado por un array de caracteres
     */
    private static String caracteresCadena(char[] caracteres) {
        assert caracteres != null : "Error: el array de caracteres no puede ser nulo";

        if (caracteres.length == 0)
            return "";

        return new String(caracteres);
    }
}
