package iesdonana.es;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jaula {
    private List<Animal> animales;

    public Jaula() {
        animales = new ArrayList<>();
    }

    public void agregar(Animal[] animales) {
        if (animales == null)
            throw new NullPointerException("Error: la lista de aniumales no puede ser nula");

        if (animales.length == 0)
            throw new IllegalStateException("Error: el array de animales está vacío");
        this.animales.addAll(Arrays.asList(animales));
        Collections.sort(this.animales);
    }

    public void guardar(File archivo, Animal[] animales) {

        try (FileOutputStream salida = new FileOutputStream(archivo);
             ObjectOutputStream objeto = new ObjectOutputStream(salida)) {
            objeto.writeObject(animales);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargar(File arcivo) {
        try (FileInputStream entrada = new FileInputStream(arcivo);
             ObjectInputStream objeto = new ObjectInputStream(entrada)) {
            Animal[] animales = (Animal[]) objeto.readObject();
            this.animales.clear();
            this.animales.addAll(Arrays.asList(animales));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mostrar() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }
}
