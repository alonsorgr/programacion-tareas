package iesdonana.excepciones;

import java.net.UnknownHostException;

public class NombreArchivoNoValidoException
extends Exception {
    public NombreArchivoNoValidoException(String message) {
        super(message);
    }
}
