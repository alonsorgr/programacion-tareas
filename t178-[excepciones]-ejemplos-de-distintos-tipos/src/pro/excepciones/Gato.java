package pro.excepciones;

public class Gato {
    private String alias;   // NN, NM
    private int peso;       // > 0
    boolean tieneAmo;
    private Persona amo;

    /**
     * Constructor de Gato
     *
     * @param alias                     alias del gato que no puede ser nulo
     * @throws NullPointerException     si el alias del gatos es nulo
     * @throws IllegalArgumentException si el peso del gato es menor o igual a 0
     */
    public Gato(String alias) throws NullPointerException, IllegalArgumentException {
        setAlias(alias);
    }

    private void setAlias(String alias) throws NullPointerException {
        if (alias == null)
            throw new NullPointerException("Error: el alias de un gato no puede ser nulo");
        this.alias = alias;
    }

    /**
     * Establecer peso gato
     * @param peso peso del gato > 0
     * @throws IllegalArgumentException si el peso del gato es menor o igual a 0
     */
    public void setPeso(int peso) throws IllegalArgumentException {
        if (peso <= 0)
            throw new IllegalArgumentException("Error: el peso de un gato debe ser mayor a 0");
        this.peso = peso;
    }

    public void setTieneAmo(boolean estado) {
        this.tieneAmo = estado;
    }

    // IllegalStateException

    /**
     * Agregar amo
     * @param amo amo delk gato no nulo
     * @throws NullPointerException si el amo es nulo
     * @throws IllegalStateException si el gato ya tiene amo
     */
    public void agregarAmo(Persona amo) throws NullPointerException, IllegalStateException {
        if (amo == null)
            throw new NullPointerException("Error: amo es nulo");
        if (tieneAmo)
            throw new IllegalStateException("Error: el gato ya tiene amo");
        this.amo = amo;
    }

    @Override
    public String toString() {
        return alias;
    }
}
