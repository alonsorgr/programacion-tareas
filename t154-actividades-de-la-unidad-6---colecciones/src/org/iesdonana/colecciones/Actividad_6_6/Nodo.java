package org.iesdonana.colecciones.Actividad_6_6;

import java.util.Objects;

/**
 * Creado por alonsorgr
 */
public class Nodo<E> {
    private E elemento;
    private Nodo<E> siguiente;

    public Nodo(E elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        Nodo<?> nodo = (Nodo<?>) o;
        return Objects.equals(elemento, nodo.elemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elemento);
    }

    @Override
    public String toString() {
        return elemento.toString();
    }
}
