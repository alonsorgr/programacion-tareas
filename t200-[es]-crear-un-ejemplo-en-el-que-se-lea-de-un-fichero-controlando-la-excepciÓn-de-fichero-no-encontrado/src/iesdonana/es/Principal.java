package iesdonana.es;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * T200-[E/S] CREAR UN EJEMPLO EN EL QUE SE LEA DE UN FICHERO CONTROLANDO LA EXCEPCIÓN DE FICHERO NO ENCONTRADO
 */
public class Principal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("prueba.txt"))) {
            while (sc.hasNext())
                System.out.println(sc.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
