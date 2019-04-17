package org.iesdonana.colecciones.Actividad_6_3;

public class ListaSE {
    private Nodo inicio;

    public ListaSE() {
        inicio = null;
    }

    /**
     * Comprueba si la lista está vacia
     *
     * @return devuelve verdadero si la lista esta vacia (no tiene ningun elemento)
     */
    private boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Añade un nuevo nodo al final de la lista
     *
     * @param nuevo nodo a agregar que no puede ser nulo
     */
    public void agregar(Nodo nuevo) {
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

    /**
     * Inserta un nodo al principio de lista
     *
     * @param nuevo nodo a agregar al principio de la lista
     */
    public void insertar(Nodo nuevo) {
        assert nuevo != null : "Error: el nodo no puede ser nulo";
        if (estaVacia()) {
            inicio = nuevo;
            return;
        }

        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setSiguiente(aux);
    }

    /**
     * Inserta el nuevo nodo antes del nodo que recibe
     * @param nuevo nodo a agregar
     * @param nodo  nodo donde se insertará antes el nuevo nodo
     * @return devuelve verdadero si se ha podido agregar
     */
    public boolean insertarAntes(Nodo nuevo, Nodo nodo) {
        assert nuevo != null : "Error: el nodo no puede ser nulo";
        assert nodo != null : "Error: el nodo no puede ser nulo";

        Nodo aux = inicio;
        Nodo sig;

        while (aux.getSiguiente() != null)
            if (buscar(nodo)) {
                sig = aux;
                nuevo.setSiguiente(sig);
                return true;
            }
            else
                aux = aux.getSiguiente();
        return false;
    }

    /**
     * Buscar un nodo en la lista
     * @param nodo nodo a buscar que no puede ser nulo
     * @return verdadero si hay un nodo igual en la lista
     */
    public boolean buscar(Nodo nodo) {
        assert nodo != null : "Error: el nodo no puede ser nulo";

        if (inicio == nodo)
            return true;

        Nodo aux = inicio;

        while (aux.getSiguiente() != null)
            if (nodo.equals(aux.getSiguiente()))
                return true;
            else
                aux = aux.getSiguiente();

        return false;
    }

    public int contar(Nodo nodo) {
        assert nodo != null : "Error: el nodo no puede ser nulo";

        Nodo aux = inicio;
        int contador = 0;

        while (aux.getSiguiente() != null)
            if(buscar(nodo)) {
                contador++;
                aux = aux.getSiguiente();
            } else
                aux = aux.getSiguiente();




        return contador;

    }

    /**
     * Representación gráfica de la lista
     * @return devuelve la representacion en cadena de la lista
     */
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
