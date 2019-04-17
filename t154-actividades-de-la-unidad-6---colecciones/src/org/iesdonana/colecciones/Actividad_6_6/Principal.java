package org.iesdonana.colecciones.Actividad_6_6;

/**
 * Actividad 6.6
 * Usando una clase nodo que contenga un objeto de tipo Persona implementar
 * “a mano” (sin usar las clases al efecto de la JCF) una cola.
 */

public class Principal {

    public static void main(String[] args) {
        Cola<Persona> cola = new Cola<>();
        cola.agregar(new Nodo<>(new Persona("Alonso")));
        cola.agregar(new Nodo<>(new Persona("Paco")));
        cola.agregar(new Nodo<>(new Persona("Juan")));

        System.out.println(cola);

        System.out.println(cola.extraerPrincipio());
        System.out.println(cola);
    }
}
