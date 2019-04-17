public class Principal {

    public static void main(String[] args) {
        Util u1 = new Util(0,10);
        Util u2 = new Util(-5,5);
        System.out.println(u2.esInclido(u1));
    }
}
