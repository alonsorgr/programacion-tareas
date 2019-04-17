public class Matricula {
    private int numero;
    private String letra;

    public Matricula(int numero, String letra) {
        setNumero(numero);
        setLetra(letra);
    }

    private void setNumero(int numero) {
        assert numero >= 0 :
                String.format("Error: (%d) el numero de una matricula debe ser mayor o igual a 0", numero);
        this.numero = numero;
    }

    private void setLetra(String letra) {
        assert letra != null : "Error: las letra de una matricula no pueden ser nulas";
        assert letra.length() == 3 :
                String.format("Error: (%d) una matricula debe tener tres letras", letra.length());
        this.letra = letra.toUpperCase();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Matricula) {
            Matricula otra = (Matricula) o;
            return numero == otra.numero && letra.equals(otra.letra);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%04d%s", numero, letra);
    }
}
