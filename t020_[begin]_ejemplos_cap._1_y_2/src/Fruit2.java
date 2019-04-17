/**
 * @author (Alonso García 1º DAW)
 */
public class Fruit2
{
    public static void main(String[ ] args) {
        // Declare and initialize three variables
        int numOranges = 5;
        int numApples = 10;
        int numFruit = 0;
        // Increment oranges and calculate the total fruit
        numFruit = ++numOranges + numApples;
        System.out.println("A totally fruity program");
        // Display the result
        System.out.println("Value of oranges is " + numOranges);
        System.out.println("Total fruit is " + numFruit);
    }
}
