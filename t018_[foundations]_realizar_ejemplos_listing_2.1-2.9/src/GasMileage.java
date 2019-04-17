import java.util.Scanner;
/**
 * Write a description of class GasMileage here.
 * 
 * @author (Alonso García 1º DAW) 
 * @version (L I S T I N G 2 . 9)
 */
public class GasMileage
{
    public static void main(String[ ] args) {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the number of miles: ");
        miles = scan.nextInt();
        System.out.print ("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();
        mpg = miles / gallons;
        System.out.println ("Miles Per Gallon: " + mpg);
    }
}
