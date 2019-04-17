public class Principal {

    public static void main(String[] args) {
        System.out.println(sus2('A', 'O', "FRANCISCA"));
    }

/*
    T079-CREAR UN METODO LLAMADO SUS2(ORIGINAL,NUEVO,CADENA) QUE SUSTITUYA LA SEGUNDA APARICION DEL CARACTER ORIGINAL
    POR EL CARACTER NUEVO EN LA CADENA RECIBIDA. DEVUELVE LA CADENA MODIFICADA. USAR STRING (NO STRINGBUFFER)
*/

    private static String sus2(char original, char nuevo, String cadena) {
        assert cadena != null : "Error: La cadena recibida no puede ser nula";
        assert !cadena.isEmpty() : "Error: la cadena no puede estar vacía";

        String nuevaCadena = "";
        int longitud = cadena.length();

        if (longitud == 1)
            return cadena;

        int contador = 0;

        for (int i = 0; i < longitud; i++) {
            if (cadena.charAt(i) == original)
                contador++;

            if (contador == 2)
                nuevaCadena+=nuevo;
            else
                nuevaCadena+=cadena.charAt(i);

        }
        return nuevaCadena;
    }


}
