package Ejercicio_5_23;

public class Principal {
    public static void main(String[] args) {
        System.out.print("\nEJEMPLO PALOS: ");
        Palo[] palos = Palo.values();
        for (Palo p : palos)
            System.out.print(p + ", ");

        System.out.print("\nEJEMPLO ESTACIONES: ");
        Estacion[] estaciones = Estacion.values();
        for (Estacion e : estaciones)
            System.out.print(e + ", ");

        System.out.print("\nEJEMPLO NOTAS: ");
        Nota[] notas = Nota.values();
        for (Nota n : notas)
            System.out.print(n + ", ");

    }
}
