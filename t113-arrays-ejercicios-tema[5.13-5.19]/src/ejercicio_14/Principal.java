package ejercicio_14;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        Diccionario d = new Diccionario(100);
        InterfazDiccionario i = new InterfazDiccionario(d);

        boolean esCorrecto = true;
        int numero;
        do {

            System.out.println("DICCIONARIO CASTELLANO - INGLÉS");
            System.out.println("Seleccione una opción:");
            System.out.println("1 ) Mostrar diccionario");
            System.out.println("2 ) Agregar palabra");
            System.out.println("3 ) Eliminar palabra");
            System.out.println("4 ) Traducior palabra");
            System.out.println("5 ) Ordenar diccinario");
            System.out.println("0 ) Salir");
            System.out.print("4 ) SELECCIONE UNA OPCION: ");

            numero = new Scanner(System.in).nextInt();

            switch (numero) {
                case 1 :
                    i.mostrar();
                    break;
                case 2 :
                    i.agregarPalabra();
                    break;
                case 3 :
                    i.eliminarPalabra();
                    break;
                case 4 :
                    i.mostrarTraduccion();
                    break;
                case 5 :
                    i.ordenarDiccionario();
                    break;
                case 0 :
                    esCorrecto = false;
                    break;
                default:
                    assert false;
            }

        } while (esCorrecto);
    }

}
