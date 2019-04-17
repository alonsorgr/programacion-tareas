public class Persona
        implements Comparable<Persona> {

    private String alias;       // NOT NULL, NO VACIO, NO MODIFICABLE
    private int altura;         // >= 100, NO MODIFICABLE

    public Persona(String alias, int altura) {
        setAlias(alias);
        setAltura(altura);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error: el alias de una persona no puede ser nulo";
        assert !alias.isEmpty() : "Error: el alias de una persona no puede estar vacio";
        this.alias = alias;
    }

    private void setAltura(int altura) {
        assert altura >= 100 :
                String.format("Error: altura incorrecta (%d). La altura debe ser mayor o igual a 100 cm", altura);
        this.altura = altura;
    }

    @Override
    public int compareTo(Persona persona) {
        return altura-persona.altura;
    }

    @Override
    public String toString() {
        return String.format("%s: %d cm", alias, altura);
    }
}
