import java.util.Scanner;

public class Habitacion {

    private final int MINNOMBRE = 3;

    private String nombre;  // NO NULO  > MINNOMBRE
    private int numero;
    private char letra;
    private double ancho;
    private double largo;
    private float alto;
    private boolean estaEncendida;

    public Habitacion(String nombre) {
        setNombre(nombre);
    }

    //region GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public float getAlto() {
        return alto;
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }
    //endregion

    //region SETTERS
    private void setNombre(String nombre) {
        assert nombre != null : String.format("Error: El alias es %s",nombre);
        assert nombre.length() > MINNOMBRE :
                String.format("Error: El alias de la persona no puede ser (%s) debe tener más de %s caracteres",
                        nombre, MINNOMBRE);
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    //endregion

    public void interruptor() {
        estaEncendida = estaEncendida ? false : true;
    }

    private String leerNombre() {
        System.out.print("INTRODUZCA UN NOMBRE PARA LA HABITACION: ");
        return new Scanner(System.in).next();
    }

    public Habitacion generarHabitacion() {
        return new Habitacion(leerNombre());
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", letra=" + letra +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                ", estaEncendida=" + estaEncendida +
                '}';
    }
}
