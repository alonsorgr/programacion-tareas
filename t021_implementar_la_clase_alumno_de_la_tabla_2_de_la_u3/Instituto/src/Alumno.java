import java.time.Year;

/**
 * "*" Cualquier caracter | "\\s" caracter espacio | "+" mas de un caracter | "." cualquier caracter
 */

public class Alumno {

    private String alias;       // {NO NULL, NO VACIO, >= 3, SIN CARACTERES BLANCOS}
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int anioNac;        // {>=1900}
    private int peso;           // {>=0}


    public Alumno(String alias) {
        setAlias(alias);
    }

    public Alumno(String alias, int anioNac) {
        setAlias(alias);
        setAnioNac(anioNac);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        assert alias != null : "Error: El alias del Alumno no puede ser nulo";
        assert !alias.isEmpty() : "Error: El alias no puede estar vacío";
        assert alias.length() >= 3 : String.format(
                "Error: El alias (%s) no es válido, debe tener más de 3 caracteres", alias);
        assert !alias.matches(".*\\s+.*") : String.format(
                "Error: El alias %s contiene espacios o caracteres en blanco",
                alias);
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        assert anioNac >= 1900 : String.format("Error: El año (%d) no es válido, debe ser mayor de 1900", anioNac);
        this.anioNac = anioNac;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        assert peso >= 0 : String.format("Error: el peso (%d) no es válido, debe ser mayor de 0", peso);
        this.peso = peso;
    }

    public int getEdad() {

        int anio = Year.now().getValue();
        return anio - anioNac;
    }

    public String getNombreCompleto() {

        return apellido1 + " " + apellido2 + ", " + nombre;
    }

    public int contarPares(int a, int b) {

        int contador = 0;

        for (int i = a; i <= b; i++) {
            if (i%2 == 0)
                contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "alias='" + alias + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", anioNac=" + anioNac +
                ", peso=" + peso +
                '}';
    }
}
