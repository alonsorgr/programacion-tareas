public class Personaje {
    private String alias;       // NO NULO, NO VACIO, NO MODIFICABLE

    public Personaje(String alias) {
        setAlias(alias);
    }

    public void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede ser vacío";
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Personaje) {
            Personaje otra = (Personaje) o;
            return alias.equals(otra.alias);
        }
        return false;
    }

    @Override
    public String toString() {
        return alias;
    }
}
