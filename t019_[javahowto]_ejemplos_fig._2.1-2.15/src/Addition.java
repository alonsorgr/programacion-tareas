import java.util.Scanner;
/**
 * @author (Alonso García 1º DAW)
 */
public class Addition
{
    public static void main(String[ ] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2
        number1 = input.nextInt(); // read first number from user
        number2 = input.nextInt(); // read second number from user
        sum = number1 + number2; // add numbers, then store total in sum
        System.out.printf("Sum is %d%n", sum); // display sum
    }
}
