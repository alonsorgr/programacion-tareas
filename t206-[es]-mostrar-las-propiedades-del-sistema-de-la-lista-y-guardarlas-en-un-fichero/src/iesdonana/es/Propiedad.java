package iesdonana.es;

public class Propiedad implements Comparable<Propiedad> {
    private String nombre;
    private String valor;
    private String descripcion;

    /**
     * Guarda la información de una propiedad del sistema
     *
     * @param nombre      nombre de la propiedad
     * @param valor       valor de la popiedad
     * @param descripcion descipcion de la propiedad
     */
    public Propiedad(String nombre, String valor, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    /**
     * Compara poripiedades segun su nombre
     *
     * @param propiedad propiedad a comparar
     * @return 0 si son iguales, -1 si le precede +1 si le sucede
     */
    @Override
    public int compareTo(Propiedad propiedad) {
        return nombre.compareTo(propiedad.nombre);
    }

    /**
     * Representación de la propiedad
     *
     * @return representación gráfica del objeto
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append(System.lineSeparator());
        sb.append("Valor: ").append(valor).append(System.lineSeparator());
        sb.append("Descripción: ").append(descripcion).append(System.lineSeparator());
        return sb.toString();
    }
}
