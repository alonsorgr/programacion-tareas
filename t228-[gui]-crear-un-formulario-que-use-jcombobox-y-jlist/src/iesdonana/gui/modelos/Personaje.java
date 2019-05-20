package iesdonana.gui.modelos;

import java.util.ArrayList;
import java.util.List;

public class Personaje implements Comparable<Personaje>{
    private String alias;           // NN, NM ,NV
    private int altura;             // NM, >= 0
    private List<Animal> animales;

    public Personaje(String alias, int altura) {
        animales = new ArrayList<>();
        setAlias(alias);
        setAltura(altura);
    }

    public void agregarAnimal(Animal animal) {
        if (animal == null)
            throw new NullPointerException("Error: el animal a agregar np pude ser nulo");
        animales.add(animal);
    }

    private void setAlias(String alias)
            throws NullPointerException, IllegalArgumentException {
        if (alias == null)
            throw new NullPointerException("Error: el alias no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias de una persona no puede estar vacio");
        this.alias = alias;
    }

    private void setAltura(int altura)
            throws IllegalArgumentException {
        if (altura < 0)
            throw new IllegalStateException("Error: la altura de una persona no puede ser negativo");
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Personaje personaje) {
        return alias.compareTo(personaje.alias);
    }

    @Override
    public String toString() {
        return String.format("%s : %d cm", alias, altura);
    }
}
