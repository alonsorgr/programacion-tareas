package org.iesdonana.figuras;

public class Circulo extends Cerrada {
    private double radio;

    public Circulo(TipoColor color, Punto centro, double radio) {
        super(color, centro);
        setRadio(radio);
    }

    private void setRadio(double radio) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un circulo");
    }

    @Override
    public String toString() {
        return super.toString() + " | Tamaño Radio: " + radio;
    }
}
