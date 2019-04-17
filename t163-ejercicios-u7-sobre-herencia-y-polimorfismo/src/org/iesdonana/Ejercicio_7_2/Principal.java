package org.iesdonana.Ejercicio_7_2;

/**
 * Ejer. 7.2.
 * Crear un ejemplo donde un coche contenga 4 ruedas (objetos). Implementar el método
 * clone() usando la interface Cloneable en la clase Coche realizando una copia profunda (“deep
 * copy”)
 */
public class Principal {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coche coche1 = new Coche("AUDI");
        Coche coche2 = (Coche)coche1.clone();

        System.out.println(coche2);
    }
}
