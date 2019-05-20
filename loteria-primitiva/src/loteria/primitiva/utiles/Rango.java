package iesdonana.primitiva.utiles;

public class Rango {
    private int inicio;
    private int fin;

    public Rango(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public boolean esValido(int n) {
        return n > inicio || n < fin;
    }
}
