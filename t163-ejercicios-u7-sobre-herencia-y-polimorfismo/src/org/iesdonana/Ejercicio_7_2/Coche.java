package org.iesdonana.Ejercicio_7_2;

import java.util.Arrays;

public class Coche implements Cloneable{
    private String marca;
    private Rueda[] ruedas;

    {
        ruedas = new Rueda[4];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = new Rueda(10);
        }
    }

    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Coche coche = (Coche)super.clone();
        return coche;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", ruedas=" + Arrays.toString(ruedas) +
                '}';
    }
}
