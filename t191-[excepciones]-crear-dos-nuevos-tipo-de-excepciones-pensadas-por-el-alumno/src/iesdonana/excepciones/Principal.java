package iesdonana.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

/**
 * T191-[EXCEPCIONES] CREAR DOS NUEVOS TIPO DE EXCEPCIONES PENSADAS POR EL ALUMNO: CHEQUEADA Y NO CHEQUEADA
 * LANZAR Y CAZAR
 * ¿QUE DIFERENCIA HAY ENTRE LAS DOS? JSUTIFICA TY RESPUESTA
 * EN QUE LA CHEQUEADA (EXCEPTION) EL COMPILADOR NOS OBLIGA A CAZARLA
 * PORQUE EL ERROR PUEDE QUE SEA ALGO QUE ESTÉ FUERA DE NUESTRO ALCANCE Y LA NO CHEQUEADA (RUNTIMEEXCEPTION)
 * NO TE OBLIGA EL COMPILADOR, PERO HAY QUE CAZARLAS PARA CUMPLIR LOS REQUISITOS POR EJEMPLO.
 */
public class Principal {

    public static void main(String[] args) throws NombreArchivoNoValidoException {

        // EJEMPLO NO CHEQUEADA
        Persona persona = new Persona("Alonso");
        try {
            persona.setAnioNac(2222);
        } catch (NoAnioNacimientoCorrectoException e) {
            System.err.println(e.getMessage());
        }

        // EJEMPLO CHEQUEADA
        try {
            renombrar("nuevo.txt", "prueba.txt");
        } catch (NullPointerException | FileNotFoundException | NombreArchivoNoValidoException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Renombra un archivo
     *
     * @param nuevoNombre nuevo nombre de archivo no nulo y no vacio
     * @param path        ruta del archivo a renombrar no nula y archivo válido
     * @throws NullPointerException           si alguno de los parametros es nulo
     * @throws FileNotFoundException          si el archivo a renombrar no es un archivo o no lo encuentra
     * @throws NombreArchivoNoValidoException si el nombre del archivo no es válido
     */
    private static void renombrar(String nuevoNombre, String path)
            throws NullPointerException, FileNotFoundException, NombreArchivoNoValidoException {

        if (nuevoNombre == null)
            throw new NullPointerException("Error: el nuevo nombre no puede ser nulo");

        if (path == null)
            throw new NullPointerException("Error: la ruta no puede ser nula");

        if (nuevoNombre.isEmpty())
            throw new IllegalArgumentException("Error: el nuevo nombre no puede estar vacío");

        File archivo = new File(Paths.get(path).toUri());

        if (!archivo.isFile()) {
            throw new FileNotFoundException("Error: archivo no valido");
        }

        if ((nuevoNombre.matches("^\\d+\\.\\d+\\.[BP]+\\.\\d+$")))
            throw new NombreArchivoNoValidoException(String.format("Error: nombre de archivo no valido", nuevoNombre));

        archivo.renameTo(new File(nuevoNombre));
    }
}
