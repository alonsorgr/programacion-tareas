public class Util {

    private Util() {}

    // [A,B]
    public static boolean estaEnIntervaloCerado(int elemento, int inicioIntervalo, int finalIntervalo) {
        return inicioIntervalo <= elemento && elemento <= finalIntervalo;
    }
    // (A,B)
    public static boolean estaEnIntervaloAbierto(int elemento, int inicioIntervalo, int finalIntervalo) {
        return inicioIntervalo < elemento && elemento < finalIntervalo;
    }
    //[A,B)
    public static boolean estaEnIntervaloCerradoAbierto(int elemento, int inicioIntervalo, int finalIntervalo) {
        return inicioIntervalo <= elemento && elemento < finalIntervalo;
    }
    // (A,B]
    public static boolean estaEnIntervaloAbiertoCerado(int elemento, int inicioIntervalo, int finalIntervalo) {
        return inicioIntervalo < elemento && elemento <= finalIntervalo;
    }
    // [A,B] Y [C,D]
    public static boolean estaSolapado(int inicioIntervaloA, int finalIntervaloA, int inicioIntervaloB, int finalIntervaloB){
        return inicioIntervaloA <= finalIntervaloB && inicioIntervaloB <= finalIntervaloA;
    }
    // [A,C] Y [B,D]
    public static boolean estaEnIntervalo(int inicioIntervaloA, int finalIntervaloA, int inicioIntervaloB, int finalIntervaloB){
        return (inicioIntervaloA >= inicioIntervaloB && finalIntervaloB >= finalIntervaloA);
    }
}
