package org.iesdonana.colores;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * T161-[SORTEDSET] CREAR UN CONJUNTO DE COLORES ORDENADOS ASCENDENTEMENTE
 * SEGUN SU LONGITUD DE ONDA EN EL ESPECTRO VISIBLE
 */
public class Principal {

    public static void main(String[] args) {

        SortedSet<Color> colores = new TreeSet<>();

        colores.add(new Color(TipoColor.AMARILLO));
        colores.add(new Color(TipoColor.CIAN));
        colores.add(new Color(TipoColor.VIOLETA));
        colores.add(new Color(TipoColor.ROJO));
        colores.add(new Color(TipoColor.VERDE));
        colores.add(new Color(TipoColor.ANARANJADO));
        colores.add(new Color(TipoColor.AZUL));

        for (Color c : colores) {
            System.out.println(c);
        }


    }
}
