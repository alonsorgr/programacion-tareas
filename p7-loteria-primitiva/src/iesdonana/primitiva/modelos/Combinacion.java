package iesdonana.primitiva.modelos;

import iesdonana.primitiva.utiles.Rango;

public class Combinacion {
    private int[] numeros;
    protected int reintegro;
    protected int complementario;
    private int posicion = 0;
    public Combinacion() {
        numeros = new int[6];
        setReintegro();
        setComplementario();
    }

    public void agregarNumero(int numero) {
        if (!(new Rango(0, 49).esValido(numero)))
            throw new IndexOutOfBoundsException
                    (String.format("Error: número no váido, debe estar entre 0 y 49 (%d)", numero));
        numeros[posicion++] = numero;
    }

    public void setReintegro() {
        this.reintegro = (int) (Math.random() * 49);
    }

    public void setComplementario() {
        this.complementario = (int) (Math.random() * 49);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getReintegro() {
        return reintegro;
    }

    public int getComplementario() {
        return complementario;
    }

    @Override
    public String toString() {
        return String.format("%02d %02d %02d %02d %02d %02d - %02d - %02d",
                numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], numeros[5], reintegro, complementario);
    }
}
