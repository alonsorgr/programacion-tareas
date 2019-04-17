public class Principal {

    /*
    T085-CREAR UN METODO LLAMADO EN(CARACTER,CADENA) QUE DEVUELVA VERDADERO SI EL CARACTER ESTA EN LA CADENA
    1. NO SE PUEDE USAR EL METODO INDEXOF()
    2. SE DEBE USAR LA PALABRA CLAVE BREAK
    */

    public static void main(String[] args) {
        System.out.println(en('X', "Alonso"));
        System.out.println(en('A', "Alonso"));
    }

    public static boolean en(char c, String s) {

        int longitud = s.length();
        boolean correcto = false;

        for (int i = 0; i < longitud; i++)
            if (s.charAt(i) == c) {
                correcto = true;
                break;
            }

        return correcto;
    }
}
