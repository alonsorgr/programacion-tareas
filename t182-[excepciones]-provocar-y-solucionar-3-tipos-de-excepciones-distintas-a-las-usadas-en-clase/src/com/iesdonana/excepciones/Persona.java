package com.iesdonana.excepciones;

public class Persona {
    private String alias;       // NN, NM

    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) throws NullPointerException {
        if (alias == null)
            throw new NullPointerException("Error: el alias de una persona no puede ser nula");
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
