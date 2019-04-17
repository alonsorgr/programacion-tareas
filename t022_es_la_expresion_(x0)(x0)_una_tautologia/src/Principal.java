public class Principal {

    // T022-¿ES LA EXPRESION (X>0)||(X<0) UNA TAUTOLOGIA?

    // Una tautologia devuelve siempre verdadero para cualquier asignación de valores en una expresión.
    // Como se puede comprobar, con el valor 0, devuelve falso, por lo que no es una tautologia.

    public static void main(String[] args) {

        System.out.println(tautologia(-1));
        System.out.println(tautologia(0));
        System.out.println(tautologia(1));
    }

    public static boolean tautologia(int x) {
        return (x > 0) || (x < 0);
    }
}
