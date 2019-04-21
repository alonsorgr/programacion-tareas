package iesdonana.excepciones;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T192-[E/S] IDENTIFICAR Y CAZAR ALGUNA EXCEPCION QUE FALTE POR CAZAR
 * EN EL EJEMPLO DEL LIBRO [JAVAHOWTO10E] FIG. 15.6 (READTEXTFILE)
 */
public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");
        try {
            while (input.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (InputMismatchException e) { // CAZADA NEXTDOUBLE()
            System.err.println(
                    "si el siguiente token no coincide con la expresión regular flotante, o está fuera de rango");
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile() {
        if (input != null)
            input.close();
    }
}
