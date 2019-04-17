package org.iesdonana.figuras;

public abstract class Figura implements Comparable<Figura>{
    private TipoColor color;
    private Punto centro;

    public Figura(TipoColor color, Punto centro) {
        this.color = color;
        this.centro = centro;
    }

    private void setCentro(Punto centro) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        this.centro = centro;
    }

    public abstract void dibujar();

    public void mover(int x, int y) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        setCentro(new Punto(x, y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Figura) {
            Figura otra = (Figura) o;
            return color.equals(otra.color) && centro.equals(otra.centro);
        }
        return false;
    }

    @Override
    public int compareTo(Figura figura) {
        // TODO: 11/03/19 CONTROLAR RESTRICCIONES
        return centro.compareTo(figura.centro);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}