import java.time.Year;

public class Persona {
    private static final int MINFECHANACIMIENTO = 1900;
    private String nombre;
    private int fechaNacimiento;

    public Persona(String nombre, int fechaNacimiento) {
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
    }

    private void setNombre(String nombre) {
        assert nombre != null : "Error: el nombre de una persona no puede ser nulo";
        assert !nombre.isEmpty() : "Error: el nombre de una persona no puede ser vacío";
        this.nombre = nombre;
    }

    private void setFechaNacimiento(int fechaNacimiento) {
        assert fechaNacimiento >= MINFECHANACIMIENTO || fechaNacimiento <= Year.now().getValue() :
                String.format("Error: año incorrecto (%d) - la fecha mínima es (%d)",
                        fechaNacimiento, MINFECHANACIMIENTO);
        this.fechaNacimiento = fechaNacimiento;
    }

    private int getEdad() {
        return Year.now().getValue() - fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " (Edad: " + this.getEdad() + ")";
    }
}
