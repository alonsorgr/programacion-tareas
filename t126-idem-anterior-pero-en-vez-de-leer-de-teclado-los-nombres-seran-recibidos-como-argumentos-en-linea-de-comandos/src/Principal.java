/**
 * T126-IDEM ANTERIOR PERO EN VEZ DE LEER DE TECLADO LOS NOMBRES SERAN RECIBIDOS COMO ARGUMENTOS EN LINEA DE COMANDOS
 */
public class Principal {

    public static void main(String[] args) {

        Persona[] hijos;

        if (args.length > 2) {
            hijos = new Persona[args.length-1];
            for (int i = 1; i < args.length; i++)
                hijos[i - 1] = new Persona(args[i]);
        }
        else {
            hijos = new Persona[0];
            System.out.print("USO: [NUMERO DE HIJOS (int)] [NOMBRES[]]");
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
