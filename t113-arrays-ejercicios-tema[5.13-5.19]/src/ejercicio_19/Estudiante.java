package ejercicio_19;

public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        assert nombre != null : "Error: el nonbre del estudiante no puede ser nulo";
        assert !nombre.isEmpty() : "Error: el nonbre del estudiante no puede ser vacío";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "[" + nombre  + ']';
    }
}
