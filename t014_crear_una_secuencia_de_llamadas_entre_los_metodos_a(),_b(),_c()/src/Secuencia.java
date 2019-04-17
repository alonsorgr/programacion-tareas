public class Secuencia {

    public Secuencia() {}

    // Llamada al método B
    public int metodoA(int numero){
        return metodoB(numero);
    }
    // Llamada a método C decrementando el valor
    public int metodoB(int numero){
        return metodoC(--numero);
    }
    // Devuelve el valor al metodo llamante
    public int metodoC(int numero){
        return --numero;
    }
}
