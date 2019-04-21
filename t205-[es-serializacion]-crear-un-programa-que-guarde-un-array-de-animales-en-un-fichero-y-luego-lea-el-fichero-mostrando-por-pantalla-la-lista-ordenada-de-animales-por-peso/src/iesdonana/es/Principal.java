package iesdonana.es;

import java.io.File;

/**
 * T205-[E/S,SERIALIZACION] CREAR UN PROGRAMA QUE GUARDE UN ARRAY DE ANIMALES
 * EN UN FICHERO Y LUEGO LEA EL FICHERO MOSTRANDO POR PANTALLA LA LISTA ORDENADA DE ANIMALES POR PESO
 */
public class Principal {

    public static void main(String[] args) {

        String[] nombres = {"TOBI", "MAY", "ELF"};
        int[] pesos = {10, 25, 9};

        Animal[] animales = new Animal[pesos.length];

        for (int i = 0; i < animales.length; i++) {
            animales[i] = new Animal(nombres[i], pesos[i]);
        }

        Jaula jaula = new Jaula();

        jaula.agregar(animales);

        jaula.guardar(new File("animales.data"), animales);

        jaula.cargar(new File("animales.data"));

        jaula.mostrar();
    }
}
