package Ejercicio_5_23;

public enum Nota {
    INSUFICIENTE  ("Insuficiente", "< 5"),
    SUFICIENTE   ("Suficiente", "5"),
    APROBADO ("Aprobado", ">= 5"),
    NOTABLE    ("Notable", ">= 7"),
    SOBRESALIENTE    ("Sobresaliente", ">= 9");

    private String nombre;
    private String valor;

    Nota(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nombre + " " + valor;
    }
}
