package iesdonana.es;

import java.io.Serializable;

public class Animal
        implements Comparable<Animal>, Serializable {
    private String alias;       // NO NULO, NO VACÍO, NO MODIFICABLE
    private int peso;           // >= 0

    public Animal(String alias, int peso)
            throws NullPointerException, IllegalArgumentException{
        setAlias(alias);
        setPeso(peso);
    }

    private void setAlias(String alias)
            throws NullPointerException, IllegalArgumentException {
        if (alias == null)
            throw new NullPointerException("Error: el alias de un animal no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias de un animal no puede estar vacío");
        this.alias = alias;
    }

    public void setPeso(int peso)
            throws IllegalArgumentException {
        if (peso < 0)
            throw new IllegalArgumentException("Error: el peso de un animal no puede ser negativo");
        this.peso = peso;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.peso-animal.peso;
    }

    @Override
    public String toString() {
        return String.format("%s | %dKg", alias, peso);
    }
}
