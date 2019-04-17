public class Principal {

    public static void main(String[] args) {
        System.out.println(repetidos1("PARAPETAR"));
        System.out.println(repetidos2("PARAPETAR"));
        System.out.println(repetidos3("PARAPETAR"));
    }

    private static int contar(char c, String cadena) {
        assert cadena != null : "Error: La cadena no puede contener nulo";

        int contador = 0;
        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            char aux = cadena.charAt(i);
            if (c == aux)
                contador++;

            if (contador >= 2)
                break;
        }
        return contador;
    }

    private static String repetidos1(String cadena) {
        assert cadena != null : "Error: La cadena no puede contener nulo";

        int longitud = cadena.length();
        String repetidos = "";

        for (int i = 0; i < longitud; i++) {
            int contador = contar(cadena.charAt(i), cadena);
            if (contador > 1)
                repetidos+=cadena.charAt(i);
        }
        return repetidos;
    }

    private static String repetidos2(String cadena) {
        assert cadena != null : "Error: la cadena de texto introducida no  puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena de entrada no puede er nula";

        if (cadena.length() <2)
            return cadena;

        String repetidos = "";

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = i +1; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)
                        && contar(cadena.charAt(i), repetidos) <1)
                    repetidos+=cadena.charAt(i);
            }
        }
        return repetidos;
    }

    private static String repetidos3(String cadena) {
        assert cadena != null : "Error: la cadena de texto introducida no  puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena de entrada no puede er nula";

        if (cadena.length() <2)
            return cadena;

        String repetidos = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (contar(cadena.charAt(i), repetidos) <1)
                repetidos+=cadena.charAt(i);
        }

        return repetidos;
    }
}
