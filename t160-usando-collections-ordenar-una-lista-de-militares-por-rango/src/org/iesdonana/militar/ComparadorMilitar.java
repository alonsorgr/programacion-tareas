package org.iesdonana.militar;

import java.util.Comparator;

public class ComparadorMilitar implements Comparator<Militar> {
    @Override
    public int compare(Militar m1, Militar m2) {
        return m1.getPeso() - m2.getPeso();
    }
}
