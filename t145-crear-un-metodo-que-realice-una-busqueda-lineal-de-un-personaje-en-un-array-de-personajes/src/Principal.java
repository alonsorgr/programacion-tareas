/**
 * T145-CREAR UN METODO QUE REALICE UNA BUSQUEDA LINEAL DE UN PERSONAJE EN UN ARRAY DE PERSONAJES.
 * DOS PERSONAJES SON IGUALES SI TIENEN EL MISMO ALIAS. DEFINIR Y USAR UN METODO EQUALS()
 */
public class Principal {

    public static void main(String[] args) {

        String[] nombres = new String[]{"Jose","Antonio","Alonso","Enrique","Florido","Cadena"};

        Personaje[] personajes = new Personaje[nombres.length];

        for (int i = 0; i < nombres.length; i++)
            personajes[i] = new Personaje(nombres[i]);

        System.out.println(buscarPersonaje(personajes, new Personaje("Alonso")));
        System.out.println(buscarPersonaje(personajes, new Personaje("Hector")));
    }

    private static boolean buscarPersonaje(Personaje[] personajes, Personaje p) {
        assert p != null : "Error: El personaje a buscar no puede ser nulo";

        if (personajes.length == 0)
            return false;

        for (Personaje personaje: personajes)
            if (personaje.equals(p))
                return true;

        return false;
    }

}
