public class Principal {

    public static void main(String[] args) {
	    Habitacion h1 = new Habitacion("COCINA");
	    h1.interruptor();
        System.out.println(h1);

        Habitacion h2 = h1.generarHabitacion();
        System.out.println(h2);
    }
}
