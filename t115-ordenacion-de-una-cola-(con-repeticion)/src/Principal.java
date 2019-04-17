/**
 * SIGUIENDO EL VIDEO ENLAZADO REALIZAR LA ORDENACION DE UNA COLA DE PERSONAS SIGUIENDO UN CRITERIO DESCENDENTE
 * DE ALTURA (EN CM) CON POSIBLES DEPETICIONES (PUDIENDOSE DAR DOS PERSONAS O  MAS CON LA MISMA ALTURA)
 * <p>
 * https://youtu.be/TJAszE3SmFo
 */
public class Principal {

    public static void main(String[] args) {

        String[] alias = {"Alonso", "Ana", "Paula", "Vanessa", "Enrique",
                "Florido", "Juanma", "Hector", "Jerez", "Menda"};

        int[] alturas = {170, 155, 160, 168, 171, 180, 165, 168, 170, 173};

        Persona[] personas = new Persona[alias.length];

        for (int i = 0; i < alias.length; i++) {
            personas[i] = new Persona(alias[i], alturas[i]);
        }

        for (Persona p: personas) {
            System.out.print(p + " ");
        }

        System.out.println();

        ordenarPorAlturaDescendentemente(personas);

        for (Persona p: personas) {
            System.out.print(p + " ");
        }
    }

    /**
     * Ordena un array de pèrsonas por su altura
     * @param personas personas a comparar y ordenar por altura
     */
    private static void ordenarPorAlturaDescendentemente(Persona[] personas) {
        assert personas != null : "Error: el array de personas no puede ser nulo";

        if (personas.length <= 1)
            return;

        int posicion;
        Persona persona;

        for (int i = 0; i < personas.length-1; i++) {

            posicion = i;

            for (int j = i+1; j < personas.length; j++)
                if (personas[j].compareTo(personas[posicion]) > 0)
                    posicion = j;

            persona = personas[posicion];
            personas[posicion] = personas[i];
            personas[i] = persona;
        }
    }
}
