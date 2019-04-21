package iesdonana.es;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T198-[E/S] IDENTIFICAR Y MODIFICAR EL CODIGO PARA CAZAR LAS EXCEPCIONES QUE NO SE CAZAN EN [JAVAHOWTO10E]
 * Fig. 15.10: CreateSequentialFile.java
 */
public class CreateSequentialFile {

    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
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
            try {
                // create new record; this example assumes valid input
                Account record = new Account(input.nextInt(),
                        input.next(), input.next(), input.nextDouble()); // CAZADA NEXTDOUBLE
                // serialize record object into file
                output.writeObject(record);
            } catch (IllegalStateException e) { // ILLEGALSTATEEXCEPTION
                System.err.println("Error: el scanner está cerrado");
            } catch (InputMismatchException e) {
                System.err.println(
                        "Error: el siguiente token no coincide con la expresión regular flotante, o está fuera de rango");
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            System.out.print("? ");
        }
    }

    public static void closeFile() {
        try {
            if (output != null)
                output.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
