public class Principal {

    /*T028-CREAR UN METODO QUE RECIBA COMO PARAMETROS 2 NUMEROS ENTEROS Y MUESTRE POR PANTALLA A ELEVADO A B.
    USAR UN METODO DE LA CLASE MATH PARA REALIZAR LA OPERACION DE EXPONENCIACION*/

    public static void main(String[] args) {
        potencia(2,3);
    }

    public static void potencia(int a, int b) {
        System.out.println(Math.pow(a,b));
    }


}
