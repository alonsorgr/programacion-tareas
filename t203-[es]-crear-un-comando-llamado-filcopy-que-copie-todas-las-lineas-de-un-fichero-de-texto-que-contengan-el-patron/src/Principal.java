import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) {
        if (args.length > 3 || args.length < 2) {
            System.err.println(String.format("Error: número de parámetros incorecto (%d) ", args.length));
            ayuda();
        } else {
            try {
                if (args.length == 2)
                    copiarArchivo(args[0], args[1], "");
                else
                    copiarArchivo(args[0], args[1], args[2]);
            } catch (IOException e) {
                System.err.println(e.getMessage());
                ayuda();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    /**
     * Copia el contenido de un archivo a otro
     *
     * @param origen  archivo a copiar su contenido
     * @param destino archivo donde se copiará el contenido
     * @param patron  patron de búsqueda
     * @throws IllegalArgumentException si el nombre del archivo destino u origen está vació
     * @throws IOException              si hay error al leer o escribir en los archivos
     */
    private static void copiarArchivo(String origen, String destino, String patron)
            throws IOException, IllegalArgumentException {

        if (origen == null || destino == null)
            throw new NullPointerException("Error: el origen y el destino no pueden ser nulos");

        if (origen.isEmpty() || destino.isEmpty())
            throw new IllegalArgumentException("Error: el origen y el destino no pueden ser cadena vacia");

        if (!(Files.isRegularFile(Paths.get(origen))))
            throw new FileNotFoundException(
                    String.format("Error: %s (No existe el archivo o el directorio)", origen));

        String linea;
        Pattern p = Pattern.compile(patron);
        Matcher matcher;

        try (BufferedReader bf = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            while ((linea = bf.readLine()) != null) {
                matcher = p.matcher(linea);
                if (matcher.lookingAt())
                    bw.write(linea + "\n");
            }

        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    private static void ayuda() {
        System.out.println("USO:");
        System.out.println("    filecopy origen destino [patron]");
    }
}
