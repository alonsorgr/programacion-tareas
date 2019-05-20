package iesdonana.gui.modelos;

import iesdonana.gui.enums.TipoAnimal;
import iesdonana.gui.enums.TipoColor;

public class Animal implements Comparable<Animal>{
    private int ID;             // NM, >=0
    private String alias;       // NM, NN, NV
    private TipoAnimal tipo;    // NM, NN
    private TipoColor color;    // NM, NN
    private int peso;           // NM, >= 0

    public Animal(int ID, String alias, TipoAnimal tipo, TipoColor color, int peso) {
        setID(ID);
        setAlias(alias);
        setTipo(tipo);
        setColor(color);
        setPeso(peso);
    }

    private void setID(int ID) {
        if (ID < 0)
            throw new IllegalStateException("Error: el ID de un animal no puede ser negativo");
        this.ID = ID;
    }

    private void setAlias(String alias) {
        if (alias == null)
            throw new NullPointerException("Error: el alias no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias de un animal no puede estar vacio");
        this.alias = alias;
    }

    private void setTipo(TipoAnimal tipo) {
        if (tipo == null)
            throw new NullPointerException("Error: el tipo no puede ser nulo");
        this.tipo = tipo;
    }

    private void setColor(TipoColor color) {
        if (color == null)
            throw new NullPointerException("Error: el color no puede ser nulo");
        this.color = color;
    }

    private void setPeso(int peso) {
        if (peso < 0)
            throw new IllegalStateException("Error: el peso de un animal no puede ser negativo");
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    public String getAlias() {
        return alias;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public TipoColor getColor() {
        return color;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int compareTo(Animal animal) {
        return peso-animal.peso;
    }
}
