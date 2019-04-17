/**
 * T137-STRING.FORMAT Y REUSABILIDAD DE VARIABLES
 *
 * Usando String.format mostrar por pantalla:
 *
 * hakuna matata abracadabra abracadabra matata hakuna
 *
 * -Usando sólo una cadena de formato de longitud menor de 20
 * -String.format con un máximo de 4 parámetros contando la cadena de formato
 * -No se pueden usar métodos auxiliares
 */
public class Principal {

    public static void main(String[] args) {
        String a = "hakuna ";
        String b = "matata ";
        String c = "abracadabra ";

        System.out.println(String.format("%s%s%s%3$s%2$s%1$s", a, b, c));
    }
}
