public class Militar implements Comparable<Militar>{
    private String alias;       // NO NULO, NO MODIFICABLE, NO VACIO
    private Rango rango;        // NO NULO

    public Militar(String alias, Rango rango) {
        setAlias(alias);
        setRango(rango);
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
        return alias + " " + rango;
    }
}
