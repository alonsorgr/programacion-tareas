import java.text.Collator;
import java.util.Locale;

/**
 * T153-ENCONTRAR EL NIVEL DE FUERZA (USANDO SETSTRENGTH) EN LA CLASE COLLATOR
 * PARA QUE LAS PALABRAS SIGUIENTES SEAN IGUALES AL COMPARARLAS USANDO EL METODO COMPARE DE LA CLASE COLLATOR
 *
 * cana y caña
 * facil y fácil
 * facil y fácil (iguales) - cana y caña (distintas)
 * pingüino y pinguino
 * FACIL, FÁCIL, facil, fácil

 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/Collator.html#PRIMARY
 */
public class Principal {

    public static void main(String[] args) {
        Collator esp = Collator.getInstance(new Locale("es", "ES"));
        esp.setStrength(Collator.PRIMARY);

        System.out.println(esp.compare("cana", "caña"));
        System.out.println(esp.compare("facil", "fácil"));
        System.out.println(esp.compare("pinguino", "pingüino"));
        System.out.println(esp.compare("FACIL", "FÁCIL"));
        System.out.println(esp.compare("FACIL", "facil"));
        System.out.println(esp.compare("FACIL", "fácil"));
    }
}
