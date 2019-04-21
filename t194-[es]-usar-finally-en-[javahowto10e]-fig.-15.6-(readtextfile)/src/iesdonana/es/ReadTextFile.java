package iesdonana.es;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T194-[E/S] USAR FINALLY EN [JAVAHOWTO10E] FIG. 15.6 (READTEXTFILE)
 *
 * ESTUDIAR QUE EXCEPCIONES SE PODRIAN PRODUCIR AL CERRAR EL RECURSO
 *
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html#close()
 */
public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
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
                System.out.printf("%-10d%-12s%-12s%10.2s%n", input.nextInt(),
                        input.next(), input.next(), input.next());
            }
        } catch (InputMismatchException e) { // CAZADA NEXTDOUBLE()
            System.err.println(
                    "si el siguiente token no coincide con la expresión regular flotante, o está fuera de rango");
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        } finally {
            input.close();
        }
    }
}
