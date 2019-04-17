/**
 * T149-COMPARAR DOS MILITARES SEGUN SU RANGO. CLASES: MILITAR, RANGO, TIPORANGO (ENUMERADO)
 *
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html#compareTo(E)
 *
 * El compareTo de la clase Enum fija el orden de precedencia en el orden que estan declarado los tipos dentro del Enum
 */
public class Principal {

    public static void main(String[] args) {
        Militar m1 = new Militar("Paco", new Rango(TipoRango.SOLDADO));
        Militar m2 = new Militar("Paco", new Rango(TipoRango.SOLDADO));

        System.out.println(m1.compareTo(m2));
        System.out.println(m1.equals(m2));
    }
}
