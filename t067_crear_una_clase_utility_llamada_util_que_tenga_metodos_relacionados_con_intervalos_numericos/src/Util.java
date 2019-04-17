public class Util {

    private Util() {}

    // [A,B]
    public static boolean estaEnIntervaloCerado(int x, int a, int b) {
        return (a <= x && x <= b);
    }
    // (A,B)
    public static boolean estaEnIntervaloAbierto(int x, int a, int b) {
        return (a < x && x < b);
    }
    //[A,B)
    public static boolean estaEnIntervaloCerradoAbierto(int x, int a, int b) {
        return (a <= x && x < b);
    }
    // (A,B]
    public static boolean estaEnIntervaloAbiertoCerado(int x, int a, int b) {
        return (a < x && x <= b);
    }
    // [A,B] Y [C,D]
    public static boolean esSolapado(int a, int b, int c, int d) {
        return (a >= c && a <= d) || (b >= c && b <= d);
    }
    // [A,C] Y [B,D]
    public static boolean esInclido(int a, int b, int c, int d) {
        return (a <= c && b >= d);
    }
}
