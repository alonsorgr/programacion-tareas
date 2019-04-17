package org.iesdonana;

import java.util.HashSet;
import java.util.Iterator;

/**
 * T157-USANDO HASHSET REALIZAR OPERACIONES DE CONJUNTOS
 *
 * A=[1,2,3,4,5]
 * B=[1,3,5]
 *
 */
public class Principal {

    public static void main(String[] args) {
        HashSet<Integer> hashSetA = new HashSet<>();
        HashSet<Integer> hashSetB = new HashSet<>();

        hashSetA.add(1);
        hashSetA.add(2);
        hashSetA.add(3);
        hashSetA.add(4);
        hashSetA.add(5);

        hashSetB.add(1);
        hashSetB.add(3);
        hashSetB.add(5);
        // hashSetB.add(6);

        // PERTENENCIA: Indica si un elemento pertenece a un conjunto
        System.out.print("Pertenencia: ");
        System.out.println(pertenencia(hashSetA, 2));

        // UNION: Une dos conjuntos
        System.out.print("Union: ");
        mostrar(union(hashSetA, hashSetB));

        // INTERSECCION: Indica los elementos compartidos entre dos conjuntos
        System.out.print("Interseccion: ");
        mostrar(interseccion(hashSetA, hashSetB));

        // DIFERENCIA: Defuelve las diferencias de dos conjuntos
        System.out.print("Diferencia: ");
        mostrar(diferencia(hashSetA, hashSetB));

        // INCLUSION: Indica si un conjunto está incluido en otro
        System.out.print("Inclusion: ");
        System.out.println(inclusion(hashSetA, hashSetB));
    }

    private static boolean pertenencia(HashSet<Integer> hashSet, int x) {
        return hashSet.contains(x);
    }

    private static HashSet<Integer> union(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {

        HashSet<Integer> resultado = new HashSet<>();
        resultado.addAll(hashSet1);
        resultado.addAll(hashSet2);
        return resultado;
    }

    private static HashSet<Integer> interseccion(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {

        HashSet<Integer> resultado = new HashSet<>();

        for (Integer e : hashSet1)
            if(hashSet2.contains(e))
                resultado.add(e);

        return resultado;
    }

    private static HashSet<Integer> diferencia(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {

        HashSet<Integer> resultado = new HashSet<>();
        Iterator<Integer> it = hashSet1.iterator();

        while (it.hasNext())
            if(!hashSet2.contains(it.next()))
                resultado.add(it.next());

        return resultado;
    }

    private static boolean inclusion(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {

        Iterator<Integer> it = hashSet1.iterator();

        while (it.hasNext())
            if(!hashSet2.contains(it.next()))
                return false;

        return true;
    }

    private static void mostrar(HashSet<Integer> hashSet) {

        Iterator<Integer> it = hashSet.iterator();

        while (it.hasNext())
            System.out.print(it.next() + ", ");

        System.out.println();

    }
}
