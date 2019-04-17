package org.iesdonana.militar;

public class Rango implements Comparable<Rango> {
    private TipoRango rango;        // NO NULO, NO MODIFICABLE

    public Rango(TipoRango rango) {
        setRango(rango);
    }

    private void setRango(TipoRango rango) {
        assert rango != null : "Error: el rango no puede ser nulo";
        this.rango = rango;
    }

    @Override
    public int compareTo(Rango rango) {
        return this.rango.compareTo(rango.rango);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Rango) {
            Rango otra = (Rango) o;
            return rango.equals(otra.rango);
        }
        return false;
    }

    @Override
    public String toString() {
        return rango.toString();
    }
}
