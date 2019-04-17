package org.iesdonana.figuras;

public abstract class Cerrada extends Figura {
    public Cerrada(TipoColor color, Punto centro) {
        super(color, centro);
    }

    public abstract double area();
}