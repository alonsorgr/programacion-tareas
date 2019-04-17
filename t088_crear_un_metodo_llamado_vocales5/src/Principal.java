public class Principal {

    public static void main(String[] args) {
        System.out.println(vocales5("AEIOU"));
        System.out.println(vocales5("AEIOD"));
    }

    private static boolean vocales5(String cadena) {
        assert cadena != null : "Error: la cadena de texto introducida no  puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena de entrada no puede er nula";

        if (cadena.length() < 5)
            return false;

        String vocales = "AEIOU";
        int contador = 0;
        boolean correcto = false;

        for (int i = 0; i < vocales.length(); i++) {
            for (int j = 0; j < cadena.length(); j++)
                if (vocales.charAt(i) == cadena.charAt(j)) {
                    contador++;
                    break;
                }

            if (contador == 5)
                correcto = true;
        }

        return correcto;
    }
}
