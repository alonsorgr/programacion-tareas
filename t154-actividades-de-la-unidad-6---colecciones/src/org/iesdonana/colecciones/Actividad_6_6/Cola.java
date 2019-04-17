package org.iesdonana.colecciones.Actividad_6_6;

/**
 * Creado por alonsorgr
 */
public class Cola<E> {
    private Nodo inicio;

    public Cola() {

    }

    private boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Agrega un nodo al final de la cola
     *
     * @param nuevo nodo no nulo a agregar
     */
    public void agregar(Nodo<E> nuevo) {
        assert nuevo != null : "Error: el nodo no puede ser nulo";
        if (estaVacia()) {
            inicio = nuevo;
            return;
        }
        Nodo aux = inicio;
        while (aux.getSiguiente() != null)
            aux = aux.getSiguiente();
        aux.setSiguiente(nuevo);
    }

    public Nodo<E> extraerPrincipio() {
        if (estaVacia()) return null;

        Nodo aux = inicio;
        inicio = inicio.getSiguiente();

        return aux;
    }

    public boolean buscar(Nodo<E> nodo) {
        assert nodo != null : "Error: el nodo no puede ser nulo";

        boolean encontrado = false;

        if (estaVacia())
            return encontrado;

        Nodo aux = inicio;

        while (!(encontrado = aux.equals(nodo)) && aux.getSiguiente() != null)
            aux = aux.getSiguiente();

        return encontrado;
    }

    @Override
    public String toString() {
        if (estaVacia())
            return "";
        String resultado = "";
        Nodo aux = inicio;
        while (aux.getSiguiente() != null) {
            resultado += aux + " ";
            aux = aux.getSiguiente();
        }
        return resultado + aux;
    }
}
