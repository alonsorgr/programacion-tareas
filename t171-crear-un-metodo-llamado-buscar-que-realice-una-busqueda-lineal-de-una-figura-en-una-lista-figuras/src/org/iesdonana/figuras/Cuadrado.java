package org.iesdonana.figuras;

public class Cuadrado extends Cerrada{
    private int lado;

    public Cuadrado(int lado, TipoColor color, Punto centro) {
        super(color, centro);
        setLado(lado);
    }

    private void setLado(int lado) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un cuadrado");
    }

    @Override
    public String toString() {
        return super.toString() + " | Tamaño Lado: " + lado;
    }
}
