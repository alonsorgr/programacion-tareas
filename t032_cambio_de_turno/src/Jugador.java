public class Jugador {
    private static int turno;
    private String alias;
    private int numero;

    public Jugador(String alias, int numero) {
        this.alias = alias;
        this.numero = numero;
    }

    public void setTurno() {
        if (turno == 0)
            turno = 1;
        else
            turno = 0;
    }
    public void setTurno(int numJugadores) {
        turno = (turno + 1) % numJugadores;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "alias='" + alias + '\'' +
                ", numero=" + numero +
                ", siguiente turno=" + turno +
                '}';
    }
}
