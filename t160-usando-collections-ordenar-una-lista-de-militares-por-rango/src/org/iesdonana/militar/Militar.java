package org.iesdonana.militar;

import java.util.Comparator;

public class Militar implements Comparable<Militar>{
    private String alias;       // NO NULO, NO MODIFICABLE, NO VACIO
    private Rango rango;        // NO NULO
    private int peso;           // MAYOR O IGUAL A 0

    public Militar() {
    }

    public Militar(String alias, Rango rango, int peso) {
        setAlias(alias);
        setRango(rango);
        setPeso(peso);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede ser vacio";
        this.alias = alias;
    }

    public void setRango(Rango rango) {
        assert rango != null : "Error: el rango no puede ser nulo";
        this.rango = rango;
    }

    public void setPeso(int peso) {
        assert peso >= 0 : "Error: el peso de una persona no puede ser negativo";
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    /*@Override
    public int compare(Militar militar, Militar t1) {
        return militar.alias.compareTo(t1.alias);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Militar) {
            Militar otra = (Militar) o;
            return rango.equals(otra.rango) && alias.equals(otra.alias);
        }
        return false;
    }

    @Override
    public int compareTo(Militar militar) {
        return rango.compareTo(militar.rango);
    }

    @Override
    public String toString() {
        return alias + " " + rango + " " + peso;
    }
}
