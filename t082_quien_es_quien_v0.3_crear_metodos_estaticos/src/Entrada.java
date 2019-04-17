import java.util.Scanner;

public class Entrada {

    private static final String COLORESPELO = "ROJO, AMARILLO, BLANCO, NEGRO";
    private static final String OPCIONES = "SI, NO";

    private Entrada() {}

    public static String leerAlias() {
        System.out.print("Intruduzca un alias para el jugador: ");
        return new Scanner(System.in).next();
    }

    public static boolean leerGafas() {
        return comprobar(String.format("¿Desea que el jugador tenga gafas? Posibilidades: (%s)",
                OPCIONES), OPCIONES);
    }

    public static boolean leerFumador() {
        return comprobar(String.format("¿Desea que el jugador sea fumador? Posibilidades: (%s)",
                OPCIONES), OPCIONES);
    }

    public static boolean leerSombrero() {
        return comprobar(String.format("¿Desea que el jugador tenga sombrero? Posibilidades: (%s)",
                OPCIONES), OPCIONES);
    }

    public static ColorPelo leerColorPelo() {
        ColorPelo colorPelo = null;
        boolean correcto = false;

        do {
            System.out.printf("Seleccione un tipo de color de pelo. Posibilidades: (%s)\nEscriba una opción: ",
                    COLORESPELO);

            String color = scanner().next();

            correcto = COLORESPELO.contains(color);
            if (!correcto)
                System.out.printf("Error: color (%s) desconocido. Posibilidades: (%s)\n", color, COLORESPELO);

            switch (color) {
                case "ROJO" :
                    colorPelo = ColorPelo.ROJO;
                    break;
                case "AMARILLO" :
                    colorPelo = ColorPelo.AMARILLO;
                    break;
                case "BLANCO" :
                    colorPelo = ColorPelo.BLANCO;
                    break;
                case "NEGRO" :
                    colorPelo = ColorPelo.NEGRO;
                    break;
                default:
                    assert false : "Error: opción no implementada";
            }

        } while (!correcto);
        return colorPelo;
    }

    private static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static boolean comprobar(String mensaje, String opciones) {

        boolean correcto;
        boolean salida = false;

        do {
            System.out.printf("%s. Posibilidades: (%s)\nEscriba una opción: ", mensaje, opciones);

            String esVerdadero = scanner().next();
            correcto = OPCIONES.contains(esVerdadero);
            if (!correcto)
                System.out.printf("Error: respuesta (%s) desconocida. Posibilidades: (%s)\n", esVerdadero, opciones);

            if (esVerdadero.equals("SI"))
                salida = true;
            else if (esVerdadero.equals("NO"))
                salida = false;

        } while (!correcto);
        return salida;
    }
}
