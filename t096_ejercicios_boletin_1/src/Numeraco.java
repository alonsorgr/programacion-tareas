public class Numeraco {

    private Cifraca cifraca1;       // NO NULO
    private Cifraca cifraca2;       // NO NULO
    private Cifraca cifraca3;       // NO NULO

    public Numeraco(Cifraca cifraca1, Cifraca cifraca2, Cifraca cifraca3) {
        setCifraca1(cifraca1);
        setCifraca2(cifraca2);
        setCifraca3(cifraca3);
    }

    public void setCifraca1(Cifraca cifraca1) {
        assert cifraca1 != null : "Error: la cifraca recibida no puede contener null";
        this.cifraca1 = cifraca1;
    }

    public void setCifraca2(Cifraca cifraca2) {
        assert cifraca2 != null : "Error: la cifraca recibida no puede contener null";
        this.cifraca2 = cifraca2;
    }

    public void setCifraca3(Cifraca cifraca3) {
        assert cifraca3 != null : "Error: la cifraca recibida no puede contener null";
        this.cifraca3 = cifraca3;
    }

    @Override
    public String toString() {
        return cifraca1.getLinea1() + "  " + cifraca2.getLinea1() + "  " + cifraca3.getLinea1() + "\n" +
               cifraca1.getLinea2() + "  " + cifraca2.getLinea2() + "  " + cifraca3.getLinea2() + "\n" +
               cifraca1.getLinea3() + "  " + cifraca2.getLinea3() + "  " + cifraca3.getLinea3() + "\n" +
               cifraca1.getLinea4() + "  " + cifraca2.getLinea4() + "  " + cifraca3.getLinea4() + "\n" +
               cifraca1.getLinea5() + "  " + cifraca2.getLinea5() + "  " + cifraca3.getLinea5() + "\n";
    }
}
