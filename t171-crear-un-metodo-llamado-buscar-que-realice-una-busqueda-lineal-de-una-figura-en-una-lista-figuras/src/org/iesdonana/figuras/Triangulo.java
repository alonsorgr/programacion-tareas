package org.iesdonana.figuras;

public class Triangulo extends Cerrada {
    private int base;
    private int altura;

    public Triangulo(TipoColor color, Punto centro, int base, int altura) {
        super(color, centro);
        setBase(base);
        setAltura(altura);
    }

    private void setBase(int base) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        this.base = base;
    }

    private void setAltura(int altura) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un triangulo");
    }

    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + " Altura: " + altura;
    }
}
