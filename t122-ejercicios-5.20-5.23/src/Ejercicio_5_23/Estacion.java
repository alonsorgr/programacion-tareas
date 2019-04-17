package Ejercicio_5_23;

public enum Estacion {
    PRIMAVERA  ("Primavera"),
    VERANO   ("Verano"),
    OTONO ("Otoño"),
    INVIERNO    ("Invierno");

    private String nombre;

    Estacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
