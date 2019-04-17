public class Principal {

    /* T083-MOSTRAR LA SECUENCIA DE CARACTERES ABDCBDCBDCBDCBDC USANDO LA SENTENCIA FOR EN EL METODO MAIN
     * Y UN METODO LLAMADO MOSTRAR(CHAR) QUE MUESTRA UN CARACTER POR PANTALLA. EL METODO MOSTRAR DEVUELVE TRUE.
     */

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if (i == 0)
                mostrar('A');
            mostrar('B');
            mostrar('C');
            mostrar('D');
        }
    }

    public static boolean mostrar(char c) {
        System.out.print(c);
        return true;
    }
}
