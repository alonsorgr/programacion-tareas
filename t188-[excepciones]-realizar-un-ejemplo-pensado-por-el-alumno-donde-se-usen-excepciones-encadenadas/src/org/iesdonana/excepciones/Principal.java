package org.iesdonana.excepciones;

/**
 * T188-[EXCEPCIONES] REALIZAR UN EJEMPLO PENSADO POR EL ALUMNO DONDE SE USEN EXCEPCIONES ENCADENADAS
 *
 * PROVOCAR QUE LA EXCEPCION LLEGUE AL METODO MAIN TRAS 3 NIVELES DE LLAMADAS (INCLUYENDO EL MAIN)
 * Y MOSTRAR INFORMACION EN EL MAIN SOBRE LAS EXCEPCIONES QUE SE HAN PRODUCIDO EN ESA CADENA DE EXCEPCIONES
 *
 * ¿DEBERIA EXISTIR SIEMPRE UN BLOQUE CATCH DE ULTIMO RECURSO EN EL METODO MAIN EN TODOS LOS PROGRAMAS?
 * RAZONA TU RESPUESTA
 */
public class Principal {

    public static void main(String[] args) {
        try {
            Persona p = generar("PACO", -10);
            System.out.println(p);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static Persona generar(String alias, int peso) throws NullPointerException, IllegalArgumentException {
        if (alias == null)
            throw new NullPointerException("Error: el alias no puede ser nulo");

        Persona p = new Persona(alias);

        try {
            p.setPeso(peso);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }

        return p;
    }
}
