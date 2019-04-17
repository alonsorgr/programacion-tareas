package Ejercicio_5_23;

public enum Palo {
    BASTOS  ("Bastos"),
    COPAS   ("Copas"),
    ESPADAS ("Espadas"),
    OROS    ("Oros");

    private String nombre;

    Palo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
