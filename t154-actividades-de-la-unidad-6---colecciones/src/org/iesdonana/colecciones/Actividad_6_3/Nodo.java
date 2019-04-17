package org.iesdonana.colecciones.Actividad_6_3;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Nodo) {
            Nodo otra = (Nodo) o;
            return valor == otra.valor;
        }
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}
