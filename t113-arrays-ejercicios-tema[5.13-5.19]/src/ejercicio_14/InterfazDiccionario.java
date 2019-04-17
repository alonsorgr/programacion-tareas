package ejercicio_14;

import java.util.Scanner;

public class InterfazDiccionario {
    private Diccionario diccionario;

    public InterfazDiccionario(Diccionario diccionario) {
        setDiccionario(diccionario);
    }

    private void setDiccionario(Diccionario diccionario) {
        assert diccionario != null: "Error: el diccionario no puede ser nulo";
        this.diccionario = diccionario;
    }

    public void agregarPalabra() {
        System.out.print("INTRODUZCA UNA PALABRA EN CASTELLANO: ");
        String castellano = scanner().nextLine();
        System.out.print("INTRODUZCA SU TRADUCCIÖN AL INGLËS: ");
        String ingles = scanner().nextLine();
        diccionario.agregar(new Palabra(castellano, ingles));
    }

    public void eliminarPalabra() {
        System.out.print("INTRODUZCA LA PALABRA EN CASTELLANO A BORRAR: ");
        String castellano = scanner().nextLine();
        System.out.print("INTRODUZCA LA PALABRA EN INGLES A BORRAR: ");
        String ingles = scanner().nextLine();
        Palabra palabraBorrar = new Palabra(castellano, ingles);
        diccionario.eliminar(palabraBorrar);
    }

    public void mostrarTraduccion() {
        System.out.print("INTRODUZCA EL,ÍNDICE DE LA PALABRA A TRADUCIR: ");
        int posicion = scanner().nextInt();
        Palabra palabra = diccionario.palabra(posicion);
        System.out.println(String.format("Castellano: %s | Inglés: %s", palabra.getCastellano(), palabra.getIngles()));
    }

    public void ordenarDiccionario() {
        diccionario.ordenarAscendentemente();
    }

    public void mostrar() {
        System.out.println(diccionario);
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }

    @Override
    public String toString() {
        return "InterfazDiccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
}


