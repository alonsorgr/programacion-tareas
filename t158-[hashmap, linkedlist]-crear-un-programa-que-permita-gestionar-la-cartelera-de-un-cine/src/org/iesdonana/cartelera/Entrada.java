package org.iesdonana.cartelera;

import java.util.LinkedList;

/**
 * Gestiona las entradas de un cine
 */
public class Entrada implements Comparable<Entrada> {
    private String pelicula;                // NO NULO, NO VACIO, NO MODIFICABLE
    private LinkedList<String> reparto;     // NO NULO

    /**
     * Crea una instancia de una Entrada en la cartelera
     *
     * @param pelicula título de la pelicula que no puede ser nulo, vacío y no se puede modificar
     * @param reparto  lista de reparto de actores de la película que no puede ser nulo
     */
    public Entrada(String pelicula, LinkedList<String> reparto) {
        setPelicula(pelicula);
        setReparto(reparto);
    }

    private void setPelicula(String pelicula) {
        assert pelicula != null : "Error: el nombre de una pelicula no puede ser nulo";
        this.pelicula = pelicula;
    }

    private void setReparto(LinkedList<String> reparto) {
        assert reparto != null : "Error: el reparto de una pelicula no puede ser nulo";
        this.reparto = reparto;
    }

    /**
     * Compara lexicográficamente por título de película
     *
     * @param entrada ectrada a comparar con la actual
     * @return devuelve 0 si son iguales, negativo si precede y positivo si sucede
     */
    @Override
    public int compareTo(Entrada entrada) {
        return pelicula.compareTo(entrada.pelicula);
    }

    /**
     * Representación gráfica
     *
     * @return devuelve la representación gráfica del objeto
     */
    @Override
    public String toString() {

        String resultado = "";
        for (String e :reparto) {
            resultado += e + " ";
        }

        return String.format("TÍTULO: %s | REPARTO: %s", pelicula, resultado);
    }
}
