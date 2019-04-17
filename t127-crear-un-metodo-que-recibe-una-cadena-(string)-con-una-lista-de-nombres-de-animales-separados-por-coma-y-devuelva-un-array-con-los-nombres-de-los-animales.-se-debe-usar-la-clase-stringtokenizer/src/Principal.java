import java.util.StringTokenizer;

/**
 * T127-CREAR UN METODO QUE RECIBE UNA CADENA (STRING) CON UNA LISTA DE NOMBRES DE ANIMALES SEPARADOS POR COMA
 * Y DEVUELVA UN ARRAY CON LOS NOMBRES DE LOS ANIMALES. SE DEBE USAR LA CLASE STRINGTOKENIZER
 */
public class Principal {

    public static void main(String[] args) {
        String nombres = "TEQUILA, GALLETA, TURRÓN, BOBY, ODOR";
        mostrar(nombresAnimales(nombres), ",", false);
    }

    private static String[] nombresAnimales(String nombres) {
        assert nombres != null : "Error: los nombres de los animales no puede ser nulo";
        assert !nombres.isEmpty() : "Error: la cadena de nombres de los animales no puede estar vacia";

        StringTokenizer st = new StringTokenizer(nombres, ",");

        String[] resultado = new String[st.countTokens()];

        for (int i = 0; i < resultado.length; i++)
            resultado[i] = st.nextToken();

        return resultado;
    }

    private static void mostrar(String[] valores, String separador, boolean saltoLinea) {
        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length; i++) {
            String sep = (i != 0) ? separador : "";
            System.out.print(sep + valores[i]);
        }
        if (saltoLinea)
            System.out.println();
    }
}
