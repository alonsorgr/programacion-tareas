public class Principal {

    /*T031-CREAR UN METODO QUE RECIBA 3 PARAMETROS LLAMADOS A,B,C
    (LOS DOS PRIMEROS ENTEROS Y EL TERCERO BOOLEANO) Y DEVUELVA A SI C ES VERDADERO, Y DEVUELVA B SI C ES FALSO.
    SE DEBE USAR EL OPERADOR TERNARIO PARA ELLO.*/

    public static void main(String[] args) {
        System.out.println(ternario(10,5, true));
        System.out.println(ternario(10,5, false));
    }

    public static int ternario(int a, int b, boolean c) {
        return (c) ? a : b;
    }
}
