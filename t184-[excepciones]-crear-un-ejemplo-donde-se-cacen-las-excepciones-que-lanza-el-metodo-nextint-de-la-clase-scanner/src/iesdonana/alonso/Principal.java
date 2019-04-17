package iesdonana.alonso;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * T184-[EXCEPCIONES] CREAR UN EJEMPLO DONDE SE CACEN LAS EXCEPCIONES QUE LANZA EL METODO NEXTINT DE LA CLASE SCANNER
 * AÑADIENDO UN CATCH DE ULTIMO RECURSO CORRESPONDIENTE A UNA SUPERCLASE DE ESAS EXCEPCIONES
 *
 * ¿PORQUE SE DEBERIA AÑADIR EL CATCH DE LA SUPERCLASE AUNQUE HAYAMOS CONTROLADO TODOS LAS EXCEPCIONES
 * DOCUMENTADAS LISTADAS EN EL THROWS DEL METODO NEXTINT DE LA CLASE SCANER?
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(leerNumero());
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean correcto = false;

        do {
            try {

                System.out.print("Introduzca un número: ");
                numero = sc.nextInt();
                correcto = true;

            } catch (InputMismatchException e) {
                System.err.println("Error: el dato introducido no corresponde a un número entero");
                sc.next();

            } catch (NoSuchElementException e) {
                System.err.println("Error: se agotó la entrada del scanner");

            } catch (IllegalStateException e) {
                System.err.println("Error: el scanner se ha cerrado");

            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }

        } while (!correcto);

        return numero;
    }
}
