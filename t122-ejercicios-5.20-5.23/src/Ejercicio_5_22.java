import java.util.Arrays;

/**
 * Ejer. 5.22.
 * Consulta en la documentación Java la clase String.
 * Localiza los siguientes métodos y anota su signatura.
 * Da una breve explicación de lo que hacen y pon un ejemplo.
 */
public class Ejercicio_5_22 {
    public static void main(String[] args) {
        // equalsIgnoreCase()
        System.out.println(compararConMayusculas("A", "a"));
        // replace()
        System.out.println(reemplazar("CHIMUELO", 'O', 'A'));
        // startsWith()
        System.out.println(comienzaCon("Hola", "H", 0));
        // replaceFirst()
        System.out.println(reemplazarExp("Mi nombre es Alonso","es", "era"));
        // endsWith()
        System.out.println(acabaEn("Alonso", "so"));
        // replaceAll()
        System.out.println(remplazarTodo("Paqui", "i", "a"));
        // toLowerCase()
        System.out.println(aMinusculas("ALONSO"));
        // indexOf()
        System.out.println(indiceDe("Paqui", 'q'));
        // toUpperCase()
        System.out.println(aMayusculas("ana"));
        // split()
        System.out.println(Arrays.toString(dividirCadena("Hola cara cola", " ")));
        // trim()
        System.out.println(quitarEspacios(" Hola cara cola "));
        // valueOf()
        // devuelve la representacion en cadena del objeto pasado por parametro
        // public static String valueOf​(Object obj)
        System.out.println(String.valueOf('C'));

    }

    /*
     * equalsIgnoreCase()
     * public boolean equalsIgnoreCase​(String anotherString)
     * Compara 2 cadenas ignorando mayusculas y minusculas
     */

    private static boolean compararConMayusculas(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    /*
     * replace()
     * public String replace​(char oldChar, char newChar)
     * reemplaza todas las ocurrencias de los caracteres pasados por parámetros
     */

    private static String reemplazar(String cadena, char viejo, char nuevo) {
        return cadena.replace(viejo, nuevo);
    }

    /*
     * startsWith()
     * public boolean startsWith​(String prefix, int toffset)
     * comprueba que una cadena empieza en un prefijo dado por parametro en una posicion
     */

    private static boolean comienzaCon(String cadena, String prefijo, int comienzo) {
        return cadena.startsWith(prefijo, comienzo);
    }

    /*
     * replaceFirst()
     * public String replaceFirst​(String regex, String replacement)
     * reemplaza la primera ocurrencia en la subcadena que coincida con la expresión regular
     */

    private static String reemplazarExp(String cadena,String expresion, String otra) {
        return cadena.replaceFirst(expresion, otra);
    }

    /* endsWith()
     * public boolean endsWith​(String suffix)
     * comprueba que la cadena termine como la cadena recibida por parametros
     */

    private static boolean acabaEn(String cadena, String s) {
        return cadena.endsWith(s);
    }

    /*
     * replaceAll()
     * remplaza todas las coincidencias en una cadena con una expresion regular
     * public String replaceAll​(String regex, String replacement)
     */

    private static String remplazarTodo(String cadena, String regex, String remplazo) {
        return cadena.replaceAll(regex, remplazo);
    }

    /*
     * toLowerCase()
     * convierte una cadena a minusculas
     * public String toLowerCase()
     */

    private static String aMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    /*
     * indexOf()
     * devuelve el indice del caracter recibido como parametro
     * public int indexOf​(int ch)
     */

    private static int indiceDe(String cadena, int ch) {
        return cadena.indexOf(ch);
    }

    /*
     * toUpperCase()
     * convierte una cadena a mayusculas
     * public String toUpperCase()
     */

    private static String aMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    /*
     * split()
     * devuelve un array de cadena donde la cadena estará separada por el patron de la expresion regular
     * public String[] split​(String regex)
     */

    private static String[] dividirCadena(String cadena, String regex) {
        return cadena.split(regex);
    }

    /*
     * trim()
     * elimina los espacios de una cadena
     * public String trim()
     */

    private static String quitarEspacios(String cadena) {
        return cadena.trim();
    }
}
