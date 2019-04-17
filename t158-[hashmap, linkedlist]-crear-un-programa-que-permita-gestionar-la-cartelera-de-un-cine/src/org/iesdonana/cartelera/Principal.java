package org.iesdonana.cartelera;

import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        Interfaz i = new Interfaz(new Cartelera());
        i.menu();
    }
}
