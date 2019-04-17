package org.iesdonana.figuras;

public class Punto implements Comparable<Punto>{
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o instanceof Punto) {
            Punto otra = (Punto) o;
            return x == otra.x && y == otra.y;
        }
        return false;
    }

    @Override
    public int compareTo(Punto punto) {
        return x-punto.x;
    }
}
