
/**
 * EJEMPLOS DE OPERADORES.
 * 
 * @author (Alonso García 1º DAW) 
 * Relational operators - Casting operators[p.81-82]
 */
public class Casting
{    
    public static void main(String[ ] args) {
    
        int i = 200;
        long lng = (long)i;
        lng = i; // "Widening," so cast not really required
        long lng2 = (long)200;
        lng2 = 200;
        // A "narrowing conversion":
        i = (int)lng2; // Cast required
        
    }
}
