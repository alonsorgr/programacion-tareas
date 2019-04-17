
public class Baraja {

    private static final int NUMCARTAS = 40;
    private static final int NUMEROS[] = {1,2,3,4,5,6,7,10,11,12};
    private static final String[] NOMBRES = {"", "AS", "", "", "", "", "", "", "", "", "SOTA", "CABALLO", "REY"};

    private Carta[] mazo;                   // NN, longitud = NUMCARTAS

    public Baraja() {
        mazo = new Carta[NUMCARTAS];
        rellenarMazo();
    }

    private void rellenarMazo() {
        Palo[] palos = Palo.values();
        for (int i = 0; i < palos.length ; i++) {
            for (int j = 0; j <= 9 ; j++) {
                mazo[i*10+j] = new Carta(NUMEROS[j], NOMBRES[NUMEROS[j]], palos[i]);
            }
        }
    }

    @Override
    public String toString() {
        String salida = null;
        for (int i = 0; i < mazo.length; i++) {
            salida += mazo[i] + "\n";
        }
        return salida;
    }
}
