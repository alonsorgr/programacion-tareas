public class Principal {

    public static void main(String[] args) {
        Tablero t = new Tablero(10);
        t.colocar(new Robot("Paco"));
        t.colocar(new Robot("Elias"));
        t.colocar(new Robot("Jaime"));
        System.out.println(t);
    }
}
