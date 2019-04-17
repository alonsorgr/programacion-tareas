package pro;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>();


        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Elija una opcion:");
        System.out.println("1) Comprobar si está vacia");
        System.out.println("2) Obtener el primer elemento sin sacarlo");
        System.out.println("3) Obtener el primer elemento");
        System.out.println("4) Agregar un elemento");
        System.out.println("5) Eliminar un elemento");

        System.out.println("Qué desea hacer? ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(pila.estaVacia());
                break;
            case 2:
                System.out.println(pila.getCima());
                break;
            case 3:
                System.out.println(pila.sacar());
                break;
            case 4:
                System.out.print("Introduzca un numero: ");
                pila.agrgar(sc.nextInt());
                break;
            case 5:
                System.out.println("Elemento a eliminar: ");
                pila.eliminar(sc.nextInt());
                break;
            default:
                throw new UnsupportedOperationException("Opcion no implementada");
        }

    }
}
