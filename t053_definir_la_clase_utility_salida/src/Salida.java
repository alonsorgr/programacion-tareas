public class Salida {

    private Salida() {}

    public static void mostrar(String mensaje) {
        System.out.print(mensaje);
    }

    public static void mostrarSL(String mensaje) {
        System.out.println(mensaje);
    }

    public static void error(String error) {
        System.err.println(error);
    }

    public static void log(String log) {
        System.out.printf("Error: %s | El mensaje se ha guardado en el cuaderno de bitacora", log);
    }
}
