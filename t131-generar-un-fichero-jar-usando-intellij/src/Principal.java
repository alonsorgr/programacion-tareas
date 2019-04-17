import java.util.Scanner;

/**
 * T123-IMPLEMENTAR EL EJEMPLO DEL TARRO DE ACEITUNAS USANDO UN ATRIBUTO ARRAY DE CLASE Y UN ATRIBUTO ARRAY DE INSTANCIA
 * CON 2 CONSTRUCTORES. REALIZAR PRUEBAS DEMOSTRANDO EL ORDEN DE EJECUCION DE LOS BLOQUES DE INICIALIZACION
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("QUÉ CAPACIDAD QUIERE QUE TENGA EL TARRO?: ");
        int capacidad = sc.nextInt();
        Tarro tarro = new Tarro(capacidad);

        for (int i = 0; i < capacidad; i++)
            tarro.agregar(Tarro.aceitunaAleatoria());

        System.out.println(tarro);
    }


}
