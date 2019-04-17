package org.iesdonana.colecciones.Actividad_6_5;

/**
 * Crea una pila de objetos como el parámetro recibido
 *
 * @param <E> Tipo de la lsta
 * @see Nodo<E>
 */
public class Pila<E> {
    private Nodo<E> inicio;

    /**
     * Constructor Cola
     */
    public Pila() {
        inicio = null;
    }

    /**
     * Comprueba que si la lista está vacía
     *
     * @return devuelve verdadero si la pila está vacía
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Consultar el primer objeto de la pila
     *
     * @return devuelve el primer objeto de la pila sin extraerlo
     */
    public E consultarPrimero() {
        if (estaVacia())
            assert false : "Error: la pila está vacía";

        return this.inicio.getElemento();
    }

    /**
     * Apilar elemento
     *
     * @param nodo elemento a apilar
     */
    public void apilar(Nodo<E> nodo) {
        Nodo<E> aux = inicio;
        inicio = nodo;
        inicio.setAnterior(aux);
    }

    /**
     * Desapilar elemento
     *
     * Desapila el primer elemento
     */
    public void desapilar() {
        if (estaVacia())
            assert false : "Error: la pila está vacía";
        inicio = inicio.getAnterior();
    }

    /**
     * Representación gráfica
     *
     * @return representación en cadena del objeto nodo
     */
    @Override
    public String toString() {
        if (estaVacia())
            return "";
        String resultado = "";

        Nodo<E> aux = inicio;

        while (aux.getAnterior() != null) {
            resultado += aux + " ";
            aux = aux.getAnterior();
        }
        return resultado + aux;
    }
}
