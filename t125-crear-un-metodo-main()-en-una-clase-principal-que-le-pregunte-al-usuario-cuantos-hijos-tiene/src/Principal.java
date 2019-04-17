import java.util.Scanner;

/**
 * T125-CREAR UN METODO MAIN() EN UNA CLASE PRINCIPAL QUE LE PREGUNTE AL USUARIO CUANTOS HIJOS TIENE.
 * A CONTINUACION LEER DE TECLADO LOS NOMBRES DE LOS HIJOS.
 * CREAR UN ARRAY DE PERSONAS (CADA PERSONA TIENE UNICAMENTE UN ATRIBUTO NOMBRE).
 * MOSTRAR EL ARRAY DE PERSONAS USANDO UN METODO MOSTRAR()
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿CUÁNTOS HIJOS TIENES?: ");
        int numeroHijos = sc.nextInt();

        Persona[] hijos = new Persona[numeroHijos];

        for (int i = 0; i < hijos.length; i++) {
            System.out.printf("¿COMO SE LLAMA SU %dº HIJO: ", i+1);
            hijos[i] = new Persona(sc.next());
        }

        mostrar(hijos, ", ", false);
    }

    private static void mostrar(Persona[] valores, String separador, boolean saltoLinea) {
        if (valores == null || valores.length == 0)
            return;

        for (int i = 0; i < valores.length; i++) {
            String sep = (i != 0) ? separador : "";
            System.out.print(sep + valores[i]);
        }
        if (saltoLinea)
            System.out.println();
    }
}
