import java.util.Scanner;

public class Entrada {

    private Entrada() {}

    public static boolean leerOpcion(String opciones) {
        return  opciones.indexOf(leerCadena()) >= 0;
    }

    public static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String leerCadena() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static double leerReal() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
