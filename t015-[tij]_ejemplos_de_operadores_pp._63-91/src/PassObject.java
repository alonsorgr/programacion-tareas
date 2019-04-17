
/**
 * EJEMPLOS DE OPERADORES.
 * 
 * @author (Alonso García 1º DAW) 
 * Aliasing during method calls [p.66]
 */

class Letter {
    char c;
}

public class PassObject
{
    static void f(Letter y) {
        y.c = '\u007a';
    }
    
    public static void main(String[ ] args) {
        
        Letter x = new Letter();
        x.c = '\u0061';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    
    }
    /* Output:
    1: x.c: a
    2: x.c: z
    */
}
