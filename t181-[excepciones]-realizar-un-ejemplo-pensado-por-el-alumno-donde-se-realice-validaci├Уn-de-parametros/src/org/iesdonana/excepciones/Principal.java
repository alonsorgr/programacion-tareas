package org.iesdonana.excepciones;

/**
 * T181-[EXCEPCIONES] REALIZAR UN EJEMPLO PENSADO POR EL ALUMNO DONDE SE REALICE VALIDACIÓN DE PARAMETROS
 *
 * EL CONSTRUCTOR INVOCARÁ A LOS MUTADORES.
 *
 * LOS MUTADORES REALIZARÁN LA VALIDACIÓN LANZANDO LAS EXCEPCIONES:
 *
 * ILLEGALARGUMENTEXCEPTION
 * NULLPOINTEREXCEPTION
 * ILLEGALSTATEEXCEPTION
 *
 * CAZAR DICHAS EXCEPCIONES DESDE EL MÉTODO MAIN DONDE SE CREARÁN LOS OBJETOS DE PRUEBA PROVOCANDO LAS 3 EXCEPCIONES
 *
 * SE USARA LA CLAUSULA THROWS PARA INDICAR QUE UN METODO LANZA DETERMINADA EXCEPCION.
 *
 * ASIMISMO, DOCUMENTAR USANDO LA ETIQUETA JAVADOC CORRESPONDIENTE PARA INDICAR LAS EXCEPCIONES QUE PUEDE LANZAR UN METODO.
 */

public class Principal {

    public static void main(String[] args) {
        Persona persona = null;

        try {
            persona = new Persona("Paco", 100, true);
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        try {
            persona.setGato(new Gato("TOBI"));
        } catch (NullPointerException e) {
            System.err.println(e);
        } catch (IllegalStateException e) {
            System.err.println(e);
        }
    }
}
