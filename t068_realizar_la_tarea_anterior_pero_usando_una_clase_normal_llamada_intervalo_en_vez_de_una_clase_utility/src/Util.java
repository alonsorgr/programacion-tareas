public class Util {

    private int a;
    private int b;

    public Util(int a, int b) {
        setB(b);
        setA(a);
    }

    private void setA(int a) {
        assert a < b : String.format("El numero %d debe ser menor que el final del intervalo", a);
        this.a = a;
    }

    private void setB(int b) {
        assert b > a : String.format("El numero %d debe ser mayor que el inicio del intervalo", b);
        this.b = b;
    }

    private int getA() {
        return a;
    }

    private int getB() {
        return b;
    }

    public boolean estaEnIntervaloCerado(int x) {
        return a <= x && x <= b;
    }

    public boolean estaEnIntervaloAbierto(int x) {
        return a < x && x < b;
    }

    public boolean estaEnIntervaloCerradoAbierto(int x) {
        return a <= x && x < b;
    }

    public boolean estaEnIntervaloAbiertoCerado(int x) {
        return a < x && x <= b;
    }

    public boolean esSolapado(Util util) {
        return (a >= util.getA() && a <= util.getB()) || (b >= util.getA() && b <= util.getB());
    }

    public boolean esInclido(Util util) {
        return (util.getA() <= a && util.getB() >= b);
    }
}
