public class Personaje implements Comparable<Personaje>{
    private String alias;       // NO NULO, NO VACIO, NO MODIFICABLE
    private int altura;         // >= 0

    public Personaje(String alias, int altura) {
        setAlias(alias);
        setAltura(altura);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias no puede ser vacío";
        this.alias = alias;
    }

    private void setAltura(int altura) {
        assert altura >= 0 : "Error: la altura de un personaje no puede ser menor a 0";
        this.altura = altura;
    }

    @Override
    public int compareTo(Personaje personaje) {
        return altura - personaje.altura;
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
