public class Persona {
    private String nombre;

    public Persona(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre de una persona no puede ser nulo";
        assert !nombre.isEmpty() : "Error: el nombre de una persona no puede estar vacio";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
