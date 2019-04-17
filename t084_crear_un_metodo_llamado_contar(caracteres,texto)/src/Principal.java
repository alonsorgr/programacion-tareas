public class Principal {

    /*
    T084-CREAR UN METODO LLAMADO CONTAR(CARACTERES,TEXTO)
    QUE DEVUELVA LA SUMA DE LAS APARICIONES DE CADA CARACTER EN TEXTO
    */

    public static void main(String[] args) {
        System.out.println(contar("ALA", "ALONSO"));
    }

    /**
     * Contar caracteres
     * Cuenta la suma total de los caracteres repetidos (parámetro caracteres) en la cadena del parámetro "texto".
     * @param caracteres Patrón de caracteres para buscar las ocurrencias.
     * @param texto Cadena de texto donde se contarán los caracteres repetidos
     * @return La suma total de los caracteres recibidos
     */
    private static int contar(String caracteres, String texto) {
        assert caracteres != null : "Error: la cadena de caracteres introducida no  puede ser nula";
        assert texto != null : "Error: la cadena de texto introducida no  puede ser nula";
        assert !repetidos(caracteres) :
                String.format("Error: en la cadena de caracteres introducida hay caracteres que se repiten", caracteres);

        int contador = 0;

        for (int i = 0; i < caracteres.length(); i++)
            for (int j = 0; j < texto.length(); j++)
                if (caracteres.charAt(i) == texto.charAt(j))
                    contador++;

        return contador;
    }

    private static boolean repetidos(String caracteres) {
        assert caracteres != null : "Error: La cadena recibida no puede ser nula";

        boolean correcto = false;

        for (int i = 0; i < caracteres.length(); i++)
            for (int j = i +1; j < caracteres.length(); j++)
                if (caracteres.charAt(i) == caracteres.charAt(j)) {
                    correcto = true;
                    break;
                }
        return correcto;
    }
}
