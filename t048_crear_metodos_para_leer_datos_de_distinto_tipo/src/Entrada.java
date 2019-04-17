import java.util.Scanner;

public class Entrada {

    private Entrada() {}

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
