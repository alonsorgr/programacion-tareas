public class Animal {

    private final int MAX = 5;
    private static int contador;    // {<=5}


    public Animal() {
        setContador(++contador);
    }

    private void setContador(int contador) {
        assert contador <= MAX : String.format(
                "Error, numero de instancias no válido (%d): No se pueden crear más de 5 instancias de esta clase", contador);
        this.contador = contador;
    }
}
