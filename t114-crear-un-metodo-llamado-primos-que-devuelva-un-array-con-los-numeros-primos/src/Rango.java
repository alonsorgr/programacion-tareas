public class Rango {
    private int inicio;
    private int longitud;

    public Rango(int inicio, int longitud) {
        setInicio(inicio);
        this.longitud = longitud;
    }

    public void setInicio(int inicio) {
        assert inicio <= longitud :
                String.format("Error: el inicio (%d) debe ser menor o igual a la longitud (%d)", inicio, longitud);
    }

    public boolean esValido(int numero) {
        return inicio <= numero && longitud >= numero;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", inicio, longitud);
    }
}
