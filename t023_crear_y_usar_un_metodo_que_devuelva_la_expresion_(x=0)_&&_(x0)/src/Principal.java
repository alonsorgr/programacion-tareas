public class Principal {

    // T023-CREAR Y USAR UN METODO QUE DEVUELVA LA EXPRESION (X>=0) && (X<0)

    public static void main(String[] args) {
        System.out.println(expresion(-1));
        System.out.println(expresion(0));
        System.out.println(expresion(1));
    }

    public static boolean expresion(int x) {
        return (x >= 0) && (x < 0);
    }
}
