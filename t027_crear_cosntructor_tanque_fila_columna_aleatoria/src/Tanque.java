public class Tanque {

    private final int MINFILA = 3;
    private final int MAXFILA=3;
    private final int MINCOLUMNA=0;
    private final int MAXCOLUMNA=3;

    private String alias;                   // !null
    private int fila;                       // >= MINFILA && =< MAXFILA
    private int columna;                    // >= MINCOLUMA && =< MAXCOLUMNA

    public Tanque(String alias) {
        setAlias(alias);
        setFila(filaAleatoria());
        setColumna(columnaAleatoria());
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias tiene valor " + alias;
        this.alias = alias;
    }

    private void setFila(int fila) {
        assert fila >= MINFILA && fila <= MAXFILA : String.format(
                "Error: La fila (%d) introducida no es válida. Debe ser >= a (%d) y <= a (%d)", fila, MINFILA, MAXFILA);
        this.fila = fila;
    }

    private void setColumna(int columna) {
        assert columna >= MINCOLUMNA && columna <= MAXCOLUMNA : String.format(
                "Error: La columna (%d) introducida no es válida. Debe ser >= a (%d) y <= a (%d)", columna, MINCOLUMNA, MAXCOLUMNA);
        this.columna = columna;
    }

    private int filaAleatoria() {
        return (int)((Math.random() * MAXFILA + MINFILA));
    }

    private int columnaAleatoria() {
        return (int)((Math.random() * MAXCOLUMNA + MINCOLUMNA));
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "alias='" + alias + '\'' +
                ", fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
