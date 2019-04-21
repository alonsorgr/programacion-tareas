package iesdonana.es;

import java.io.*;
import java.net.URL;

/**
 * T202-[E/S] DESCARGAR UN FICHERO DE TEXTO DE INTERNET
 *
 * USAR COMO IDEA EL APARTADO "READING A TEXT FILE OVER THE INTERNET" DEL CAP. 11
 * DEL VIDEOTUTORIAL [JAVA7ESSENTIAL) DE LYNDA.COM
 */
public class Principal {

    private static final String LINK = "https://pbs.twimg.com/profile_images/658742621993607168/rz9qEU7d_400x400.jpg";

    public static void main(String[] args) {
        try {
            descargar(LINK);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void descargar(String recurso)
            throws IOException {

        if (recurso == null)
            throw new NullPointerException("Error: el recurso no puede ser nulo");

        URL url = new URL(recurso);

        InputStream stream = url.openStream();
        BufferedInputStream entrada = new BufferedInputStream(stream);
        BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("fichero.jpg"));

        byte[] bytes = new byte[1024];  // Array de bytes para ir guardando el recurso
        int contador;
        while ((contador = entrada.read(bytes)) > 0) // Asigno los bytes desde el buffer de entrada
            salida.write(bytes, 0, contador); // Agrega a la salida los bytes leidos
    }
}
