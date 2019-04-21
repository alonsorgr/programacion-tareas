package iesdonana.excepciones;

import java.io.IOException;

/**
 * T201-CREAR UNA CLASE QUE IMPLEMENTE LA INTERFACE AUTOCLOSEABLE.
 * COMPROBAR QUE EL TRY CON RECURSOS EJECUTA EL METODO CLOSE() AUTOMATICAMENTE (MOSTRANDO ALGO POR PANTALLA POR EJEMPLO)
 */
public class Principal {

    public static void main(String[] args) {
        try (Recibo r = new Recibo("prueba.txt")) {
            System.out.println(r);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
