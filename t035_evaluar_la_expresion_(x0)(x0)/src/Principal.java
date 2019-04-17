public class Principal {

    /*
    * T035-EVALUAR LA EXPRESION (X>0) || (X<0)
    * ESTUDIAR SI ESA EXPRESION:
    * 1) SIEMPRE DEVUELVE VERDADERO
    * 2) SIEMPRE DEVUELVE FALSO
    * 3) DEPENDE DEL VALOR DE X
    *
    * Depende del valor de X
    */

    public static void main(String[] args) {
        System.out.println(expresion(-1));
        System.out.println(expresion(0));
        System.out.println(expresion(1));
    }

    public static boolean expresion(int x) {
        return (x > 0) || (x < 0);
    }
}
