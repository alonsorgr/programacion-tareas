
/**
 * EJEMPLOS DE OPERADORES.
 * 
 * @author (Alonso García 1º DAW) 
 * Relational operators - Ternary if-else operator[p.79-80]
 */
public class TernaryIfElse
{
    public static void main(String[ ] args) {
    
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
        
    }
    
        static int ternary(int i) {
            return i < 10 ? i * 100 : i * 10;
        }
        static int standardIfElse(int i) {
            if(i < 10)
            return i * 100;
            else
            return i * 10;
        }
        
}
