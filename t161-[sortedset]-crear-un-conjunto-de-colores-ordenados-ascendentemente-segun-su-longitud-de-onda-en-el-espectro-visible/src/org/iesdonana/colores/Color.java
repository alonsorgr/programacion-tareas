package org.iesdonana.colores;

public class Color implements Comparable<Color>{
    private TipoColor tipoColor;

    public Color(TipoColor tipoColor) {
        setTipoColor(tipoColor);
    }

    private void setTipoColor(TipoColor tipoColor) {
        assert tipoColor != null : "Error: el tipo del tipoColor no puede ser nulo";
        this.tipoColor = tipoColor;
    }

    @Override
    public int compareTo(Color color) {
        return tipoColor.getNanometros() - color.tipoColor.getNanometros();
    }

    @Override
    public String toString() {
        return tipoColor.toString();
    }
}
