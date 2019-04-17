import java.util.*;
/**
 * EJEMPLOS DE OPERADORES.
 * 
 * @author (Alonso García 1º DAW) 
 * Relational operators - Logical operators[p.70-71]
 */
public class Bool
{
    public static void main(String[ ] args) {
        
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // Treating an int as a boolean is not legal Java:
        //! print("i && j is " + (i && j));
        //! print("i || j is " + (i || j));
        //! print("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is "
        + ((i < 10) && (j < 10)) );
        System.out.println("(i < 10) || (j < 10) is "
        + ((i < 10) || (j < 10)) );
    }
}
