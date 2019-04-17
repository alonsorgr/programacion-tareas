public class Animal implements Comparable<Animal>{
    private String alias;           // NO NULO, NO VACIO, NO MODOFICABLE

    public Animal(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias de un animal no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias de un animal no puede estar vacio";
        this.alias = alias;
    }

    @Override
    public int compareTo(Animal animal) {
        return alias.compareTo(animal.alias);
    }

    @Override
    public String toString() {
        return alias;
    }
}
