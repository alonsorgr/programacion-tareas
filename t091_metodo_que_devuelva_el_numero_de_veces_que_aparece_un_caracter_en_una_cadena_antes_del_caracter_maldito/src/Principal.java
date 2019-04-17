public class Principal {

    public static void main(String[] args) {
        System.out.println(contar('A', "ANACARDO", 'C'));
        System.out.println(contar('E', "MELONES", 'N'));
        System.out.println(contar('O', "EDUARDO", 'R'));
    }

    private static int contar(char c, String cadena, char maldito) {
        assert cadena != null : "Error: la cadena no puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena no puede estar vacía";

        if ((cadena.indexOf(maldito) < 0))
            return 0;

        int veces = 0;
        int contador = 0;
        int longitud = cadena.length();


        for (int i = 0; i < longitud ; i++)
            if (cadena.charAt(i) == maldito) {
                contador = i;
                break;
            }

        for (int i = 0; i < contador +1; i++)
            if (cadena.charAt(i) == c)
                veces++;

        return veces;
    }
}
