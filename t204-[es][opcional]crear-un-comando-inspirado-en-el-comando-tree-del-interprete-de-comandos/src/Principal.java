import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * T204-[E/S][OPCIONAL]CREAR UN COMANDO INSPIRADO EN EL COMANDO TREE DEL INTERPRETE DE COMANDOS (CON Y SIN OPCION /F)
 */
public class Principal {

    public static void main(String[] args) {
        if (args.length == 0 || args.length > 2) {
            System.err.println(String.format("Error: número de parámetros incorecto (%d) ", args.length));
            ayuda();
        } else {
            try {
                if (args.length == 2) {
                    if (args[1].equalsIgnoreCase("/f")) {
                        comandoTree(new File(args[0]), "", true);
                    }
                } else
                    comandoTree(new File(args[0]), "", false);
            } catch (FileNotFoundException | NullPointerException e) {
                System.err.println(e.getMessage());
                ayuda();
            }
        }
    }

    private static void comandoTree(File directorio, String tabulacion, boolean mostrarArchivos)
            throws NullPointerException, FileNotFoundException {

        if (directorio == null)
            throw new NullPointerException("Error: el directorio no puede ser nulo");
        if (tabulacion == null)
            throw new NullPointerException("Error: la cadena del tabulador no puede ser nula");
        if (!(Files.isDirectory(Paths.get(directorio.getAbsolutePath()))))
            throw new FileNotFoundException(
                    String.format("Error: %s (No existe el archivo o el directorio)", directorio.getAbsolutePath()));

        File[] lista = directorio.listFiles();

        if (lista != null)
            for (File archivo : lista)
                if (archivo.isDirectory()) {
                    System.out.println(tabulacion + "|" + "\u2500\u2500 " + archivo.getName());
                    comandoTree(archivo, tabulacion + "|  ", mostrarArchivos);
                } else if (mostrarArchivos)
                    System.out.println(tabulacion + "\uD83D\uDFA3" + "\u2500\u2500 " + archivo.getName());
    }

    private static void ayuda() {
        System.out.println("USO:");
        System.out.println("    tree directorio [-f mostrar archivos]");
    }
}
