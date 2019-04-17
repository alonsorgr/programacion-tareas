public class Bola {
    private int numero;
    private TipoColor tipoColor;

    public Bola(int numero, TipoColor tipoColor) {
        setNumero(numero);
        setTipoColor(tipoColor);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoColor(TipoColor tipoColor) {
        this.tipoColor = tipoColor;
    }

    public static Bola bolaAleatoria() {
        int n = (int)(Math.random()*4);
        int numero;
        TipoColor tipoColor;
        if (n==0) {
            numero = n;
            tipoColor = TipoColor.AZUL;
        } else if (n==1) {
            numero = n;
            tipoColor = TipoColor.AMARILLO;
        } else if (n==2) {
            numero = n;
            tipoColor = TipoColor.BLANCO;
        } else {
            numero = n;
            tipoColor = TipoColor.NEGRO;
        }
        return new Bola(numero, tipoColor);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "numero=" + numero +
                ", tipoColor=" + tipoColor +
                '}';
    }
}
