import java.util.Scanner;

/**
 * T110-CREAR UN PROGRAMA QUE PREGUNTE AL USUARIO CUANTAS PERSONAS HAY EN UNA HABITACION. A CONTINUACION PREGUNTAR
 * CUANTOS HIJOS TIENE CADA PERSONA Y LAS EDADES DE CADA HIJO. ALMACENAR TODA ESA INFORMACION EN UN ARRAY BIDIMENSIONAL
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CUANTAS PERSONAS HAY EN LA HABITACION? : ");
        int numPersonas = sc.nextInt();
        Persona[][] datos = new Persona[numPersonas][];
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("CUAL ES LA ES EL NOMBRE PARA LA PERSONA (%d)? : ", i);
            String nombre = sc.next();
            System.out.printf("CUAL ES LA FECHA DE NACIMIENTO PARA LA PERSONA (%d)? : ", i);
            int edad = sc.nextInt();
            System.out.printf("CUANTOS HIJOS TIENE LA PERSONA (%d)? : ", i);
            int hijos = sc.nextInt();
            datos[i] = new Persona[hijos+1];
            datos[i][0] = new Persona(nombre, edad);
        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 1; j < datos[i].length; j++) {
                System.out.printf("CUAL ES LA ES EL NOMBRE PARA EL HIJO (%d) DE LA PERSONA (%d)? : ", j,i);
                String nombre = sc.next();
                System.out.printf("CUAL ES LA FECHA DE NACIMIENTO PARA EL HIJO (%d) DE LA PERSONA (%d)? : ", j,i);
                int edad = sc.nextInt();
                datos[i][j] = new Persona(nombre, edad);

            }
        }

        mostrar(datos, ", ", true);
    }

    public static void mostrar(Persona[][] personas, String separador, boolean saltoLinea) {
        if (personas == null || personas.length == 0)
            return;

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                String sep = (j != 0) ? separador : "";
                System.out.print(sep + personas[i][j]);
            }
            if (saltoLinea)
                System.out.println();
        }

    }
}
