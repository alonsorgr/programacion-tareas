/**
 * T148-QUE CAMBIOS HARIAS EN LA TAREA ANTERIOR SI EL CRITERIO DE COMPARACION FUERA POR ALIAS+ALTURA.
 * ES DECIR, A IGUALDAD DE ALIAS SE COMPARAR LA ALTURA.
 */
public class Principal {

    public static void main(String[] args) {
        String[] nombres = new String[]{"Jose", "Antonio", "Alonso", "Enrique", "Florido", "Cadena"};
        int[] alturas = new int[]{175, 160, 170, 173, 180, 178};

        Personaje[] personajes = new Personaje[nombres.length];

        for (int i = 0; i < nombres.length; i++)
            personajes[i] = new Personaje(nombres[i], alturas[i]);

        System.out.println(buscarPersonaje(personajes, new Personaje("Alonso", 170)));
        System.out.println(buscarPersonaje(personajes, new Personaje("Alonso", 180)));
    }

    private static boolean buscarPersonaje(Personaje[] personajes, Personaje p) {
        assert p != null : "Error: El personaje a buscar no puede ser nulo";

        if (personajes.length == 0)
            return false;

        for (Personaje personaje : personajes)
            if (personaje.equals(p))
                if (personaje.compareTo(p) == 0)
                    return true;

        return false;
    }
}
