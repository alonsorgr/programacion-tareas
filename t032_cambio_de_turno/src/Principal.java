/*
 * TENEMOS 2 JUGADORES JUGANDO A UN JUEGO POR TURNOS.
 * LA VARIABLE TURNO () ALMACENA EL JUGADOR AL QUE LE TOCA JUGAR COMO  UN NUMERO (0 o 1)
 * DEFINE UN METODO PARA IMPLEMENTAR EL CAMBIO DE TURNO.
 * AMPLIACION (OPCIONAL)
 * IDEM PERO PARA N JUGADORES
 * AYUDA: USA EL OPERADOR MODULO (%)
 */
public class Principal {

    public static void main(String[] args) {
        Jugador j0 = new Jugador("J0", 0);
        Jugador j1 = new Jugador("J1", 1);

        j0.setTurno(2);
        System.out.println(j0);

        j1.setTurno(2);
        System.out.println(j1);

        j0.setTurno(2);
        System.out.println(j0);

        j1.setTurno(2);
        System.out.println(j1);
    }
}
