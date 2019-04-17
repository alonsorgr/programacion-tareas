import java.util.Scanner;
/**
 * Write a description of class Entrada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Entrada
{
    private Entrada() {}
    
    // leer una opcion de entre las opciones del menú
    // Devuelve: El caracter elegido
    public static char leerOpcion(String opciones){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        char opcion = ' ';
        
        do {
            System.out.println("Elige una opcion:");
            opcion = sc.nextLine().charAt(0);
            correcto = opciones.indexOf(opciones) >= 0;
            if (!correcto)
                System.out.printf("Opcion incorrecta. La opcion %c no está entre las posibles %s", opcion, opciones);
        } while(!correcto);
        
        return opcion;
    }
}
