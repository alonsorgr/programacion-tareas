package ejercicio_14;

public class Palabra implements Comparable<Palabra>{
    private String castellano;
    private String ingles;

    public Palabra(String castellano, String ingles) {
        setCastellano(castellano);
        setIngles(ingles);
    }

    private void setCastellano(String castellano) {
        assert castellano != null : "Error: el parametro de entrada no puede ser nulo";
        assert !castellano.isEmpty() : "Error: el apámetro de enttada no puede estar vacio";
        this.castellano = castellano;
    }

    private void setIngles(String ingles) {
        assert ingles != null : "Error: el parametro de entrada no puede ser nulo";
        assert !ingles.isEmpty() : "Error: el apámetro de enttada no puede estar vacio";
        this.ingles = ingles;
    }

    public String getCastellano() {
        return castellano;
    }

    public String getIngles() {
        return ingles;
    }

    @Override
    public int compareTo(Palabra palabra) {
        return castellano.compareTo(palabra.castellano);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Palabra) {
            Palabra otra = (Palabra) o;
            return castellano.equals(otra.castellano) && ingles.equals(otra.ingles);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", castellano, ingles);
    }


}
