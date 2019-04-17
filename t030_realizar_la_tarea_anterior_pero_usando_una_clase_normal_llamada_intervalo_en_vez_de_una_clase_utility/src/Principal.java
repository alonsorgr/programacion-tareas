public class Principal {

    public static void main(String[] args) {
        Util u1 = new Util(0,9);
        Util u2 = new Util(10,15);
        System.out.println(u2.estaSolapado(u1));
    }
}
