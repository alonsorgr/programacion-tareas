package org.iesdonana;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * T169-CREAR UN EJEMPLO PENSADO POR EL ALUMNO EN EL QUE SE VEA LA DIFERENCIA ENTRE HASHMAP Y TREEMAP
 *
 * En el HashMap los elementos no tienen un orden específico
 * En el TreeMap los elementos están ordenados por el orden natural (compareTo) de la clave del mapa
 */
public class Principal {

    public static void main(String[] args) {

        HashMap<Rango, Militar> militares1 = new HashMap<>();
        TreeMap<Rango, Militar> militares2 = new TreeMap<>();

        militares1.put(new Rango(TipoRango.ALFEREZ),
                new Militar("Alonso", new Rango(TipoRango.ALFEREZ), 64));
        militares1.put(new Rango(TipoRango.SOLDADO),
                new Militar("Enrique", new Rango(TipoRango.SOLDADO), 64));
        militares1.put(new Rango(TipoRango.CAPITAN),
                new Militar("Hector", new Rango(TipoRango.CAPITAN), 64));
        militares1.put(new Rango(TipoRango.GENERAL),
                new Militar("Florido", new Rango(TipoRango.GENERAL), 64));

        militares2.put(new Rango(TipoRango.ALFEREZ),
                new Militar("Alonso", new Rango(TipoRango.ALFEREZ), 64));
        militares2.put(new Rango(TipoRango.SOLDADO),
                new Militar("Enrique", new Rango(TipoRango.GENERAL), 64));
        militares2.put(new Rango(TipoRango.CAPITAN),
                new Militar("Hector", new Rango(TipoRango.CAPITAN), 64));
        militares2.put(new Rango(TipoRango.GENERAL),
                new Militar("Florido", new Rango(TipoRango.GENERAL), 64));

        System.out.println("HashMap: " + militares1);
        System.out.println("TreeMap: " + militares2);

    }
}
