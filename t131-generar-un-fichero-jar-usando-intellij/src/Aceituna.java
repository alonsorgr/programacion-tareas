/**
 * @author Alonso Gracía
 * @version 0.1
 */
public class Aceituna {
    private TipoAceituna tipo;      //NOT NULL

    /**
     * Crea un instancia de una aceituna
     *
     * @param tipo tipo de aceituna
     * @see TipoAceituna
     */
    public Aceituna(TipoAceituna tipo) {
        setTipo(tipo);
    }

    private void setTipo(TipoAceituna tipo) {
        assert tipo != null : "Error: el tipo de una aceituna no puede ser nulo";
        this.tipo = tipo;
    }

    /**
     * Representación en cadena
     * @return Representación en texto de una aceituna
     */
    @Override
    public String toString() {
        return "Aceituna{" +
                "tipo=" + tipo +
                '}';
    }
}
