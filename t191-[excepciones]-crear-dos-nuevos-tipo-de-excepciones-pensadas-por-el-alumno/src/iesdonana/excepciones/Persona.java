package iesdonana.excepciones;

import java.time.Year;

public class Persona {
    private String alias;       // NO NULO, NO VACIO, NO MODIFICABLE
    private int anioNac;        // >= FECHA ACTUAL

    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        if (alias == null)
            throw new NullPointerException("Error: el alias de una persona no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias de una persona no puede estar vacío");
        this.alias = alias;
    }

    public void setAnioNac(int anioNac) {
        int anio = Year.now().getValue();
        if (anioNac > anio)
            throw new NoAnioNacimientoCorrectoException(
                    String.format(
                            "Error: el año de nacimiento (%d) de una persona no puede ser mayor que el atcual (%d)"
                            , anioNac, anio));
        this.anioNac = anioNac;
    }

    @Override
    public String toString() {
        return alias;
    }
}
