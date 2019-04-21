package iesdonana.es;

/**
 * T206-[E/S] MOSTRAR LAS PROPIEDADES DEL SISTEMA DE LA LISTA Y GUARDARLAS EN UN FICHERO DE TEXTO LLAMADO PROP.TXT
 *
 * SE DEBE MOSTRAR POR PANTALLA PARA CADA PROPIEDAD DE LA LISTA ORDENADAS ALFABETICAMENTE:
 *
 * - NOMBRE
 * - VALOR
 * - DESCRIPCION DE LA PROPIEDAD (LA BUSCARA EL ALUMNO EN INTERNET O EN LA BIBLIOGRAFIA)
 */
public class Principal {

    public static void main(String[] args) {
        Informacion informacion = new Informacion();
        try {
            for (Propiedad p : informacion.listaPropiedades())
                System.out.println(p);
            informacion.imprimir("PROP.TXT");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
