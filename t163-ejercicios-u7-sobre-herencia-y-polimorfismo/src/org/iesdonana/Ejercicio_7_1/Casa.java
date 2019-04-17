package org.iesdonana.Ejercicio_7_1;

public class Casa implements Comparable<Casa>{
private int numero;                  // >= 0
    private int superficie;          // NN, NM

    public Casa(int numero, int superficie) {
        setNumero(numero);
        setSuperficie(superficie);
    }

    public void setNumero(int numero) {
        assert numero >= 0 : "Error: el numero de una casa debe ser mayor a 0";
        this.numero = numero;
    }

    private void setSuperficie(int superficie) {
        assert superficie > 0 : "Error: la superficie de una casa debe ser mayor a 0";
        this.superficie = superficie;
    }

    @Override
    public int compareTo(Casa casa) {
        return superficie - casa.superficie;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numero=" + numero +
                ", superficie=" + superficie +
                '}';
    }

}
