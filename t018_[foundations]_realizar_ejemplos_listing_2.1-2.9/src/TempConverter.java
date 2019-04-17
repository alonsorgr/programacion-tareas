
/**
 * Write a description of class TempConverter here.
 * 
 * @author (Alonso García 1º DAW) 
 * @version (L I S T I N G 2 . 7)
 */
public class TempConverter
{
    public static void main(String[ ] args) {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        double fahrenheitTemp;
        int celsiusTemp = 24; // value to convert
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        System.out.println ("Celsius Temperature: " + celsiusTemp);
        System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}
