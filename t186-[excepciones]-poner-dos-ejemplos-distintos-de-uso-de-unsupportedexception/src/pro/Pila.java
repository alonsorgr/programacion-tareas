package pro;

import java.util.Stack;

public class Pila <E>{
    private Stack<E> pila;

    public Pila() {
        pila = new Stack();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public E getCima() {
        return pila.peek();
    }

    public E sacar() {
        return pila.pop();
    }

    public E empujar(E elemento) {
        return pila.push(elemento);
    }

    public int buscar(E elemento) {
        return pila.search(elemento);
    }

    public void agrgar(E elemento) {
        throw new UnsupportedOperationException("Error: método no implementado");
    }

    public void eliminar(E elemento) {
        throw new UnsupportedOperationException("Error: método no implementado");

    }
}
