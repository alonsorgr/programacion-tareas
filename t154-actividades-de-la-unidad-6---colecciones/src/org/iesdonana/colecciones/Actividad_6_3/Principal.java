package org.iesdonana.colecciones.Actividad_6_3;

public class Principal {
    public static void main(String[] args) {
        ListaSE lista = new ListaSE();
        Nodo nodo = new Nodo(99);
        Nodo nodo1 = new Nodo(99);
        Nodo nodo2 = new Nodo(99);
        Nodo nodo3 = new Nodo(99);
        lista.agregar(nodo1);
        lista.agregar(nodo2);
        lista.agregar(nodo3);

        System.out.println(lista.contar(nodo));

    }
}
