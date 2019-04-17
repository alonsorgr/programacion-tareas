package org.iesdonana.colecciones.Actividad_6_6;

/**
 * Clase Persona: Genera objetos persona
 */
public class Persona {
    private String alias;           // NO NULO, NO VACIO

    /**
     * Constructor persona
     *
     * @param alias alias de la persona a crear que no puede ser ni nulo ni vacío
     */
    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias de una persona no puedes er nulo";
        assert !alias.isEmpty() : "Error: el alias de una persona no puede ser nulo";
        this.alias = alias;
    }

    /**
     * Representación gráfica
     *
     * @return representación en cadena del objeto nodo
     */
    @Override
    public String toString() {
        return alias;
    }
}
