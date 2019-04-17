package org.iesdonana.cartelera;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Gestiona la cartelera de un cine
 */
public class Cartelera {
    private HashMap<Integer, Entrada> entradas;          // NO NULO
    private static int contador;                         // AUTOINCREMENTADO

    /**
     * Crea una instancia de cartelera
     */
    public Cartelera() {
        entradas = new HashMap<>();
    }

    /**
     * Agrega una entrada a la cartelera
     *
     * @param entrada entrada no nula a agregar a la cartelera
     */
    public void agregar(Entrada entrada) {
        assert entrada != null : "Error: la entrada a agregar no puede ser nula";
        entradas.put(contador++, entrada);
    }

    /**
     * Elimina una entrada de la cartelera
     *
     * @param posicion la posición de la entrada a eliminar que debe ser mayor o igual a 0
     */
    public void eliminar(int posicion) {
        assert posicion >= 0 : "Error: la entrada a eliminar debe ser mayor o igual a 0";
        entradas.remove(posicion);
    }

    /**
     * Borra toda la cartelera
     */
    public void borrar() {
        entradas.clear();
    }

    /**
     * Representación gráfica
     *
     * @return devuelve la representación gráfica del objeto
     */
    @Override
    public String toString() {
        String resultado = "";
        Set set = entradas.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            resultado += String.format("ID:%s | %s\n", mentry.getKey(), mentry.getValue());
        }

        return resultado;
    }
}
