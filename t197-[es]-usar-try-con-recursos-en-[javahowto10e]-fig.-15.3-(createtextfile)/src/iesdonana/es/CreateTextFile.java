package iesdonana.es;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T197-[E/S] USAR TRY CON RECURSOS EN [JAVAHOWTO10E] FIG. 15.3 (CREATETEXTFILE)
 */
public class CreateTextFile {

    private static Formatter output; // outputs text to a file

    public static void main(String[] args) {
        //openFile();
        addRecords();
        // closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // open the file
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        while (input.hasNext()) // loop until end-of-file indicator
        {
            try (Formatter output = new Formatter("clients.txt")) {

                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println(e.getMessage());
            } catch (FileNotFoundException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            System.out.print("? ");
        } // end while
    }

    public static void closeFile() {
        if (output != null)
            output.close();
    }
}
