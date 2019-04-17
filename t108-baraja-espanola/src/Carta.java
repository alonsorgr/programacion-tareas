public class Carta {

    private int numero;         // >=1
    private String nombre;      // NN
    private Palo palo;          // NN

    public Carta(int numero, String nombre, Palo palo) {
        setNumero(numero);
        setNombre(nombre);
        setPalo(palo);
    }

    public void setNumero(int numero) {
        assert numero >= 1 :
                String.format("Error, número incorrecto {%d}: las cartas deben tener una numeración superior o igual a 1", numero);
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        assert nombre != null : "Error, {null}: el nombre de la carta no puede ser nulo";
        this.nombre = nombre;
    }

    public void setPalo(Palo palo) {
        assert palo != null : "Error, {null}: el palo de la carta no puede ser nulo";
        this.palo = palo;
    }

    @Override
    public String toString() {
        return String.format("Carta {nº %d - Nombre: %s - Palo: %s}", numero, nombre, palo);
    }
}
