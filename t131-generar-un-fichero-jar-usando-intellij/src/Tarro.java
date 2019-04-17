import java.util.Arrays;
/**
 * @author Alonso Gracía
 * @version 0.1
 */
public class Tarro {
    private static Aceituna[] aceitunas1;
    private Aceituna[] aceitunas2;
    private int capacidad;

    /**
     * inicializador del bloque estáticI
     */
    static {
        aceitunas1 = new Aceituna[20];
        for (int i = 0; i < aceitunas1.length; i++) {
            aceitunas1[i] = aceitunaAleatoria();
        }
    }

    /**
     * Inicializador del bloque de instancia
     */
    {
        aceitunas2 = new Aceituna[10];
        for (int i = 0; i < aceitunas2.length; i++) {
            aceitunas2[i] = aceitunaAleatoria();
        }
    }

    /**
     * Crea un instancia de una aceituna
     */
    public Tarro() {
    }
    /**
     * Crea un instancia de un tarro
     *
     * @param capacidad maxima capacidad del tarro de aceitunas
     * @see Aceituna
     */
    public Tarro(int capacidad) {
        setCapacidad(capacidad);
        aceitunas2 = new Aceituna[capacidad];
    }
    /**
     * Agrega un aceituna al tarro
     *
     * @param aceituna aceituna a agregar que no puede ser null
     * @see Aceituna
     */
    public void agregar(Aceituna aceituna) {
        assert aceituna != null : "Error: la aceituna no puede ser nula";
        for (int i = 0; i < aceitunas2.length; i++) {
            if (aceitunas2[i] == null)
                aceitunas2[i] = aceitunaAleatoria();
        }
    }

    /**
     * Elimina un aceituna al tarro
     *
     * @param posicion posicion de la aceituna a borrar. Debe estar en el rango de su capacidad
     * @see Aceituna
     */
    public void eliminar(int posicion) {
        assert posicion >= 0 && posicion <= capacidad :
                String.format("Error: posicion incorrecta (%d). [0-%d]",posicion, capacidad);
        aceitunas2[posicion] = null;
    }

    private void setCapacidad(int capacidad) {
        assert capacidad >= 0 : "Error: la capacidad del tarro debe ser positiva";
        this.capacidad = capacidad;
    }

    /**
     * Agrega un aceituna al tarro
     * @return devuelve una aceituna generada aleatoriamente
     * @see Aceituna
     */
    public static Aceituna aceitunaAleatoria() {
        TipoAceituna[] tipo = TipoAceituna.values();
        int a = (int) (Math.random() * TipoAceituna.values().length);
        return new Aceituna(tipo[a]);
    }
    /**
     * Representación en cadena
     * @return Representación en texto de un tarro de aceitunas
     */
    @Override
    public String toString() {
        return "Tarro{" +
                "aceitunas2=" + Arrays.toString(aceitunas2) +
                '}';
    }
}
