/**
 * @author Alonso García
 * @version 0.1
 */
public class CifradoXOR {
    private String dato;               // NO NULO, NO VACIO

    /**
     * Crea un objeto CifradoXOR
     *
     * @param datos la cadena que se desea cifrar
     */
    public CifradoXOR(String datos) {
        setDato(datos);
    }

    private void setDato(String dato) {
        assert dato != null : "Error: la cadena de dato a cifrarado no puede ser nula";
        assert !dato.isEmpty() : "Error: la cadena de dato a cifrarado no puede estar vacia";
        this.dato = dato;
    }

    /**
     * Cifra y descifra el dato del objeto instanciado
     *
     * @param palabraCalve palabra clave que utilizará para cifrar los datos
     */
    public void cifrarado(String palabraCalve) {
        assert palabraCalve != null : "Error: la palabra clave no puede ser nula";
        assert !palabraCalve.isEmpty() : "Error: la palabra clave no puede estar vacia";

        char[] clave = palabraCalve.toCharArray();
        String cifrado = "";

        for (int i = 0; i < dato.length(); i++)
            cifrado += (char)(dato.charAt(i) ^ clave[(i+1) % clave.length]);

        setDato(cifrado);
    }

    /**
     * Cifra y descifra el dato del objeto instanciado
     *
     * @param n número clave que utilizará para cifrar los datos
     */
    public void cifrarado(int n) {

        char[] datos = dato.toCharArray();
        String cifrado = "";

        for (int i = 0; i < datos.length; i++)
            cifrado += (char)(datos[i] ^ n);

        setDato(cifrado);
    }

    /**
     * Representación gráfica
     * @return la representación en modo texto del objeto
     */
    @Override
    public String toString() {
        return dato;
    }
}
