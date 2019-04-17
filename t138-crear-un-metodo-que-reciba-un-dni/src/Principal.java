/**
 * T138-CREAR UN METODO QUE RECIBA UN DNI (SIN LETRA) Y CALCULE Y DEVUELVA UNA CADENA CON EL DNI CON LETRA.
 * EL CUERPO DEL METODO DEBE TENER UNA SOLA SENTENCIA (RETURN). USAR EL METODO ESTATICO VALUEOF() DE LA CLASE STRING
 * <p>
 * NO SE PUEDE DEFINIR NADA APARTE DEL PROPIO METODO PARA ESTA TAREA.
 * <p>
 * AYUDA: https://es.wikibooks.org/wiki/Algoritmo_para_obtener_la_letra_del_NIF#Java
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(calcularDNI(49035408));
    }

    /**
     * Calcula la letra de un DNI
     *
     * @param dni   núumero de DNI para calcular su letra
     * @return      devuelve un DNI con la letra
     */
    private static String calcularDNI(int dni) {
        return String.valueOf(dni) + "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
    }
}
