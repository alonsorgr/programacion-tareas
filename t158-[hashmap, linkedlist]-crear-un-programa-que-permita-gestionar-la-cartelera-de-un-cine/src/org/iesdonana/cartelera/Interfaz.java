package org.iesdonana.cartelera;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Gestiona la cartera a través de una terminal
 */
public class Interfaz {
    private Cartelera cartelera;        // NO NULO, NO MODIFICABLE

    /**
     * Crea una instancia de interfaz modo texto
     * @param cartelera
     */
    public Interfaz(Cartelera cartelera) {
        setCartelera(cartelera);
    }

    private void setCartelera(Cartelera cartelera) {
        assert cartelera != null : "Error: la cartelera no puede ser nula";
        this.cartelera = cartelera;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }

    private LinkedList<String> agregarReparto() {
        LinkedList<String> reparto = new LinkedList<>();

        System.out.print("\n¿Cuántos actores tiene la película?: ");
        int veces = scanner().nextInt();
        for (int i = 0; i < veces; i++) {
            System.out.printf("Seleccione el nombre del actor %d: ", i + 1);
            reparto.add(scanner().next());
        }
        return reparto;
    }

    private void agregarEntrada() {
        System.out.print("\nNombre de la película: ");
        String nombre = scanner().next();
        LinkedList<String> reparto = agregarReparto();
        cartelera.agregar(new Entrada(nombre, reparto));
    }

    private void eliminarEntrada() {
        System.out.print("\nIntroduzca el número de entrada a eliminar: ");
        int pos = scanner().nextInt();
        cartelera.eliminar(pos);
    }


    private void borrar() {
        cartelera.borrar();
    }

    /**
     * Menu que permite gestionar las entradas de una cartelera
     */
    public void menu() {

        int opcion;

        do {
            System.out.println("CARTELERA DE CINE\n");
            System.out.println("OPCIONES:\n");
            System.out.println("1) AGREGAR");
            System.out.println("2) ELIMINAR");
            System.out.println("3) BORRAR CARTELERA");
            System.out.println("4) MOSTRAR");
            System.out.println("0) SALIR");

            System.out.print("\nSELECCIONE UNA OPCIÓN:");

            opcion = scanner().nextInt();

            switch (opcion) {
                case 1:
                    agregarEntrada();
                    break;
                case 2:
                    eliminarEntrada();
                    break;
                case 3:
                    borrar();
                    break;
                case 4:
                    cartelera.toString();
                    break;
                case 0:
                    System.exit(-1);
            }

        } while (opcion != 0);
    }

    @Override
    public String toString() {
        return cartelera.toString();
    }
}

