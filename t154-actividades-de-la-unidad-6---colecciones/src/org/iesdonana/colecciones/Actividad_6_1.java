package org.iesdonana.colecciones; /**
 * Actividad 6.1 Analizar y probar el código del ejemplo anterior (Ejemplo 4). ¿Qué tipo de
 * conversión automática se da en los casos (1) y (2)?
 *
 * Autoboxing
 */
import java.util.ArrayList;
import java.util.List;

public class Actividad_6_1 {
    public static void main(String[] args) {
        Integer i = -8; // (1)
        // Unboxing en paso de parámetros
        int va = valorAbsoluto(i);
        System.out.println("valor absoluto de " + i + " = " + va);
        List<Double> ld = new ArrayList<>();
        ld.add(Math.PI); // (2)
        // Unboxing en asignación
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }

    public static int valorAbsoluto(int i) {
        return (i < 0) ? -i : i;
    }
}
