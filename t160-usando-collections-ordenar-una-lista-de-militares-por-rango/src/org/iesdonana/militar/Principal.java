package org.iesdonana.militar;

import java.util.ArrayList;
import java.util.Collections;

/**
 * T160-USANDO COLLECTIONS ORDENAR UNA LISTA DE MILITARES POR RANGO
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Militar> militares = new ArrayList<>();

        String[] nombres = new String[]{
                "Alonso", "Enrique", "Florido", "Hector", "Jerez", "Jose Luis", "Vicente", "Paco", "Manolo"};
        int[] pesos = new int[]{64, 75, 85, 72, 78, 66, 78, 88, 96};
        TipoRango[] tipoRangos = TipoRango.values();

        ArrayList<TipoRango> listaTipoRangos = new ArrayList<>();

        Collections.addAll(listaTipoRangos, tipoRangos);
        Collections.shuffle(listaTipoRangos);
        listaTipoRangos.toArray(tipoRangos);

        Rango[] rangos = new Rango[tipoRangos.length];


        for (int i = rangos.length-1; i >= 0; i--) {
            rangos[i] = new Rango(tipoRangos[i]);
        }


        for (int i = 0; i < tipoRangos.length; i++) {
            militares.add(new Militar(nombres[i], rangos[i], pesos[i]));
        }

        System.out.println("\nMOSTRANDO MILITARES SIN ORDENAR\n");
        for (Militar m : militares) {
            System.out.println(m);
        }

        System.out.println();

        // ORDENANDO POR RANGO
        Collections.sort(militares);

        System.out.println("MOSTRANDO MILITARES ORDENADOS POR RANGO\n");
        for (Militar m : militares) {
            System.out.println(m);
        }

        System.out.println();

        /*// ORDENANDO POR ALIAS (COMPARATOR)
        Collections.sort(militares, new Militar());

        System.out.println("MOSTRANDO MILITARES ORDENADOS POR ALIAS\n");
        for (Militar m : militares) {
            System.out.println(m);
        }*/

        // ORDENANDO POR PESO (COMPARATOR)
        Collections.sort(militares, new ComparadorMilitar());

        System.out.println("MOSTRANDO MILITARES ORDENADOS POR PESO\n");
        for (Militar m : militares) {
            System.out.println(m);
        }

    }
}
