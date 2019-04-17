package org.iesdonana.colores;
/**
 * https://es.wikipedia.org/wiki/Espectro_visible
 */
public enum TipoColor {
    ROJO (618),
    ANARANJADO (581),
    AMARILLO (570),
    VERDE (497),
    CIAN (476),
    AZUL (427),
    VIOLETA (380);

    private int nanometros;

    TipoColor(int nanometros) {
        this.nanometros = nanometros;
    }

    public int getNanometros() {
        return nanometros;
    }
}
