/*
 * TENEMOS 2 JUGADORES JUGANDO A UN JUEGO POR TURNOS.
 * LA VARIABLE TURNO () ALMACENA EL JUGADOR AL QUE LE TOCA JUGAR COMO  UN NUMERO (0 o 1)
 * DEFINE UN METODO PARA IMPLEMENTAR EL CAMBIO DE TURNO.
 * AMPLIACION (OPCIONAL)
 * IDEM PERO PARA N JUGADORES
 * AYUDA: USA EL OPERADOR MODULO (%)
 */
public class Turno {

    private static int turno;

    public Turno(){}

    public void setTurno() {
        if (turno == 0)
            turno = 1;
        else
            turno = 0;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "turno=" + turno +
                '}';
    }
}
