package org.iesdonana;
/**
 * T167-COMPROBAR QUE SE INVOCA AL METODO EQUALS AL AÑADIR ELEMENTOS A COLECCIONES (Y AL BUSCAR ELEMENTOS)
 */

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        TreeSet<Militar> militares = new TreeSet<>();
        militares.add(new Militar("Alonso", new Rango(TipoRango.GENERAL), 64));
        militares.add(new Militar("Alonso", new Rango(TipoRango.GENERAL), 64));

        System.out.println(militares);


        HashMap<Rango, Militar> militares1 = new HashMap<>();

        militares1.put(new Rango(TipoRango.ALFEREZ),
                new Militar("Alonso", new Rango(TipoRango.ALFEREZ), 64));

        System.out.println(militares1.get(new Rango(TipoRango.GENERAL)));

    }
}
