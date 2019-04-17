public class Main {

    public static void main(String[] args) {
        System.out.println(expresion(-1));
        System.out.println(expresion(0));
        System.out.println(expresion(1));

        System.out.println(expresionT023(-1));
        System.out.println(expresionT023(0));
        System.out.println(expresionT023(1));
    }

    public static boolean expresion(int x) {
        return (x>=0) || (x<0);
    }

    public static boolean expresionT023(int x) {
        return (x >= 0) && (x < 0);
    }
}
