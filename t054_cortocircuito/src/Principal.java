public class Principal {

    public static void main(String[] args) {
        System.out.println((0 > 1) && mensaje());
    }

    public static boolean mensaje() {
        System.out.println("No hay cortocircuito");
        return true;
    }
}
