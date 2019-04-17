public class Coche {
    private Matricula matricula;
    private int numero;
    private static int contador;
    private String modelo;

    public Coche(Matricula matricula) {
        setMatricula(matricula);
        this.numero = ++contador;
    }

    private void setMatricula(Matricula matricula) {
        assert matricula != null : "Error: un coche no puede tener una matricula nula";
        this.matricula = matricula;
        setModelo();
    }

    private void setModelo() {
        String[] modelos = {"FIAT", "OPEL", "MERCEDES", "FORD", "SEAT", "CITROËN"};
        int aleatorio = (int)(Math.random() * modelos.length);
        this.modelo = modelos[aleatorio];
    }

    @Override
    public String toString() {
        return String.format("Coche (nº%d) Mattrícula: (%s) modelo: {%s}", numero, matricula, modelo);
    }
}
