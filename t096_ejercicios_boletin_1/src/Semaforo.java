public class Semaforo {

    private Colores color;

    public Semaforo() {
        this.color = Colores.VERDE;
    }

    public void cambiar() {

        switch (color) {

            case ROJO:
                this.color = Colores.VERDE;
                break;
            case VERDE:
                this.color = Colores.AMARILLO;
                break;
            case AMARILLO:
                this.color = Colores.ROJO;
                break;
            default:
                assert false : "Error: color no encontrado";
        }
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "color=" + color +
                '}';
    }
}
