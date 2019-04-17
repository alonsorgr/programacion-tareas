package org.iesdonana.figuras;

import java.util.ArrayList;
import java.util.List;

/**
 * T171-CREAR UN METODO LLAMADO BUSCAR QUE REALICE UNA BUSQUEDA LINEAL DE UNA FIGURA EN UNA LISTA FIGURAS. ABRIR!
 *
 * USAR COMO JERARQUIA DE CLASES LA USADA EN LA P4-FIGURAS
 *
 * EL METODO DEBE RECIBIR UNA FIGURA A BUSCAR Y UNA LISTA DE FIGURAS (USAR TIPO LIST)
 */
public class Principal {

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(TipoColor.ROJO, new Punto(3,3), 10, 5));
        figuras.add(new Cuadrado(5, TipoColor.AMARILLO, new Punto(5,3)));
        figuras.add(new Triangulo(TipoColor.VERDE, new Punto(0,0), 4, 5));
        figuras.add(new Circulo(TipoColor.AZUL, new Punto(5,8), 6));

        System.out.println(buscar(new Circulo(TipoColor.AZUL, new Punto(5,9), 6), figuras));
    }

    private static boolean buscar(Figura figura, List<Figura> figuras) {
        assert figura != null : "La figura a buscar no puyede ser nula";

        for (Figura f : figuras)
            if (f.equals(figura))
                return true;

        return false;
    }
}
