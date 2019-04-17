package org.iesdonana.colecciones.Actividad_6_5;

/**
 * Actividad 6.5
 * Usando una clase nodo de tipo genérico implementar “a mano” (sin usar las
 * clases al efecto de la JCF) una pila que permita realizar las operaciones: apilar,
 * desapilar, estaVacia, cima.
 */

public class Principal {

    public static void main(String[] args) {
        Pila<Persona> pila = new Pila<>();
        pila.apilar(new Nodo<>(new Persona("Alonso")));
        pila.apilar(new Nodo<>(new Persona("Ana")));
        pila.apilar(new Nodo<>(new Persona("Vanessa")));
        pila.apilar(new Nodo<>(new Persona("María")));
        System.out.println(pila);
        System.out.println(pila.consultarPrimero());
        pila.desapilar();
        System.out.println(pila);
    }
}
