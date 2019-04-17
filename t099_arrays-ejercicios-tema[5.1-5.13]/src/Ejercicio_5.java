import java.util.function.ToDoubleBiFunction;

public class Ejercicio_5 {

    /**
     * Implementa el método para que devuelva el nombre del día de la semana
     * correspondiente al número de día que se pasa al método. Si el valor del parámetro
     * es incorrecto se devolverá la cadena “Día incorrecto”. Suponemos que el lunes es
     * el día 1 y el domingo es el día 7.
     */

    public static void main(String[] args) {
        System.out.println(nombreDia(5));
    }

    public static String nombreDia(int numDiaSemana) {
        assert numDiaSemana > 0 && numDiaSemana <= 7 : "Error: los dias de la semana estan comprendidos entre el 1 y el 7";
        String[] nombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return (numDiaSemana >= 1 && numDiaSemana <= 7) ? nombres[numDiaSemana-1] : "Dia incorrecto";
    }
}
