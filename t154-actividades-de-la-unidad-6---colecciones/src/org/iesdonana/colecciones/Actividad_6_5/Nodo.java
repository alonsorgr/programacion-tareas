package org.iesdonana.colecciones.Actividad_6_5;

/**
 * Clase Nodo: Genera un nodo del tipo especificado
 *
 * @param <E> Tipo de la lista
 */
public class Nodo<E> {
    private E elemento;
    private Nodo<E> anterior;

    /**
     * Crea un objeto nodo del tipo pasado como parámetro
     *
     * @param elemento
     */
    public Nodo(E elemento) {
        setElemento(elemento);
    }

    private void setElemento(E elemento) {
        assert elemento != null : "Error: el elemento no puede ser nulo";
        this.elemento = elemento;
    }

    /**
     * Establece el anterior nodo en la lista
     *
     * @param anterior nodo no nulo a colocar en la pila
     */
    public void setAnterior(Nodo<E> anterior) {
        assert elemento != null : "Error: el elemento anterior no puede ser nulo";
        this.anterior = anterior;
    }

    /**
     * Accesor del elemento
     *
     * @return devuelve el elemento
     */
    public E getElemento() {
        return elemento;
    }

    /**
     * Accesor de nodo anterior
     *
     * @return devuelve el nodo anterior de la pila
     */
    public Nodo<E> getAnterior() {
        return anterior;
    }

    /**
     * Representación gráfica
     *
     * @return representación en cadena del objeto nodo
     */
    @Override
    public String toString() {
        return elemento.toString();
    }
}
