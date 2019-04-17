package pro.excepciones;

import java.util.ArrayList;
import java.util.List;

/**
 * T189-USANDO ALGUN METODO DE ALGUNA CLASE DE LA JFC FORZAR ALGUNA DE LAS SIGUIENTE EXCEPCIONES
 *
 * CLASSCASTEXCEPTION
 * ILLEGALARGUMENTEXCEPTION
 * NULLPOINTEREXCEPTION
 */
public class Principal {

    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato("RUBI"));
        gatos.add(new Gato("HOLI"));
        gatos.add(new Gato("DEDE"));

        try {
            gatos.get(4);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
