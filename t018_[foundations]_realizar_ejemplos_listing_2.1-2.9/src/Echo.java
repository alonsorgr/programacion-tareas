import java.util.Scanner;
/**
 * Write a description of class Echo here.
 * 
 * @author (Alonso García 1º DAW) 
 * @version (L I S T I N G 2 . 8)
 */
public class Echo
{
    public static void main(String[ ] args) {
        String message;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a line of text:");
        message = scan.nextLine();
        System.out.println ("You entered: \"" + message + "\"");
    }
}
