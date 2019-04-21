package iesdonana.es;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T193-[E/S] BUSCAR EN LA BIBLIOGRAFIA UN EJEMPLO DE LECTURA DE FICHERO DE TEXTO, IMLEMENTAR Y PROBAR
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
                System.out.printf("%-10d%-12s%-12s%10.2s%n", input.nextInt(),
                        input.next(), input.next(), input.next()); // CAMBIADO NEXTDOUBLE POR NEXT POR ERROR AL LEER EL FICHERO
            }
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
