package iesdonana.excepciones;

public class NoAnioNacimientoCorrectoException
extends RuntimeException{
    public NoAnioNacimientoCorrectoException(String message) {
        super(message);
    }
}
